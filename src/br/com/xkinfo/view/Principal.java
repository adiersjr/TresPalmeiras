package br.com.xkinfo.view;

import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import br.com.xkinfo.pessoa.view.CargoView;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JMenuItem;

public class Principal extends JFrame {

	private CardLayout cardLayout;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setMinimumSize(new Dimension(800, 600));
		setTitle("Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setExtendedState(MAXIMIZED_BOTH);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnGec = new JMenu("GEC");
		mnGec.setPreferredSize(new Dimension(50, 22));
		menuBar.add(mnGec);

		JMenuItem mntmCargos = new JMenuItem("Cargos");
		mntmCargos.setName("cargo");
		mnGec.add(mntmCargos);

		JMenu mnGef = new JMenu("GEF");
		mnGef.setPreferredSize(new Dimension(50, 22));
		menuBar.add(mnGef);

		JMenu mnGem = new JMenu("GEM");
		menuBar.add(mnGem);

		getContentPane().setLayout(new CardLayout(0, 0));
		init();
	}

	private void init() {
		getContentPane().add(getCardLayout(), BorderLayout.CENTER);
	}

	private JPanel getCardLayout(){
		if (contentPane == null) {
			cardLayout = new CardLayout();
			contentPane = new JPanel();
			contentPane.setLayout(cardLayout);

			contentPane.add(new CargoView(), "cargo");
			/*contentPane.add(new TelaCadastroCliente(), "telaCadastroCliente");
			contentPane.add(new TelaCadastroDistribuidor(), "telaCadastroDistribuidor");
			contentPane.add(new TelaCadastroTipoMidia(), "telaCadastroTipoMidia");
			contentPane.add(new TelaCadastroFuncionario(), "telaCadastroFuncionario");
			contentPane.add(new TelaCadastroClasse(), "telaCadastroClasse");
			contentPane.add(new TelaCadastroMidia(), "telaCadastroMidia");
			contentPane.add(new TelaCadastroTitulo(), "telaCadastroTitulo");
			contentPane.add(new TelaReserva(), "telaReserva");
			contentPane.add(new TelaLocacao(), "telaLocacao");
			contentPane.add(new TelaDevolucao(), "telaDevolucao");*/
			cardLayout.show(contentPane, "cargo");
			contentPane.setBackground(Color.GREEN);
			return contentPane;
		} else {
			return contentPane;
		}
	}

}
