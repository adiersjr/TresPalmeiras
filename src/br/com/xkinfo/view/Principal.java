package br.com.xkinfo.view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import br.com.xkinfo.pessoa.view.CadastraCargo;
import br.com.xkinfo.pessoa.view.ConsultaCargo;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JPanel painelCardLayout;
	private CardLayout cardLayout;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);

		JMenuItem mntmAgncia = new JMenuItem("Ag\u00EAncia");
		mnCadastro.add(mntmAgncia);

		JMenuItem mntmBanco = new JMenuItem("Banco");
		mnCadastro.add(mntmBanco);

		JMenuItem mntmCargo = new JMenuItem("Cargo");
		mntmCargo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout = new CardLayout();
				cardLayout.show(painelCardLayout, "segundo");
				dispose();
			}
			@Override
			public void mousePressed(MouseEvent e) {
				cardLayout.show(painelCardLayout, "segundo");
			}
		});
		mnCadastro.add(mntmCargo);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setContentPane(getCardLayout());
	}
	private JPanel getCardLayout() {
		if (painelCardLayout == null) {
			cardLayout = new CardLayout();
			painelCardLayout = new JPanel();
			painelCardLayout.setLayout(cardLayout);

			painelCardLayout.add(new ConsultaCargo(), "primeiro");
			painelCardLayout.add(new CadastraCargo(), "segundo");
			//painelCardLayout.add(new ConsultaCargo(), "primeiro");
			//cardLayout.show(painelCardLayout, "telaLocacao");
			//painelCardLayout.setBackground(Color.GREEN);

			return painelCardLayout;
		} else {
			return painelCardLayout;
		}
	}


}
