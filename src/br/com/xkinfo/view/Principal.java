package br.com.xkinfo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import br.com.xkinfo.pessoa.view.ConsultaCargo;
import br.com.xkinfo.pessoa.view.ConsultaTipoDocumento;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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

	public Principal() {
		setMinimumSize(new Dimension(800, 600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 463);

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
			public void mousePressed(MouseEvent e) {
				mnCargo(e);
			}
		});
		mnCadastro.add(mntmCargo);
		
		JMenuItem mntmTipoDeDocumento = new JMenuItem("Tipo de Documento");
		mntmTipoDeDocumento.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mnTipoDocumento(e);
			}
		});
		mnCadastro.add(mntmTipoDeDocumento);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	
	private void mnCargo(MouseEvent e){
		ConsultaCargo consultaCargo = new ConsultaCargo();
		consultaCargo.setLocationRelativeTo(this);
		consultaCargo.setVisible(true);
	}
	
	private void mnTipoDocumento(MouseEvent e){
		ConsultaTipoDocumento consultaTipoDocumento = new ConsultaTipoDocumento();
		consultaTipoDocumento.setLocationRelativeTo(this);
		consultaTipoDocumento.setVisible(true);
	}

}
