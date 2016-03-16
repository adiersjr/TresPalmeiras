package br.com.xkinfo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.tree.DefaultTreeModel;
import br.com.xkinfo.pessoa.model.Cargo;
import br.com.xkinfo.pessoa.view.CargoView;
import br.com.xkinfo.service.ServiceFactory;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.CardLayout;
import java.awt.Color;

public class Principal2 extends JFrame {

	private JPanel contentPane;
	private CardLayout cardLayout;
	private JTree tree;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal2 frame = new Principal2();
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
	public Principal2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
				);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
				);

		JPanel panel = new JPanel();
		tabbedPane.addTab("GEC", null, panel, null);

		JSplitPane splitPane = new JSplitPane();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addContainerGap()
						.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
						.addContainerGap())
				);
		gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
						.addContainerGap()
						.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
						.addContainerGap())
				);
		arvore();
		splitPane.setLeftComponent(tree);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);

		
	}
	
	private void arvore(){
		tree = new JTree();
		DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Raiz");
		DefaultTreeModel treeModel = new DefaultTreeModel(raiz);
		// CARGOS
		ArrayList<Cargo> cargos = null;
		try {
			cargos = ServiceFactory.getCargoservice().pesquisaCargos();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Cargo cargo : cargos) {
			raiz.add(new DefaultMutableTreeNode(cargo.getDescricao()));
		}
		// BANCOS
		/*DefaultTreeModel treeModel = new DefaultTreeModel(raiz);
		ArrayList<Cargo> cargos = null;
		try {
			cargos = ServiceFactory.getCargoservice().pesquisaCargos();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Cargo cargo : cargos) {
			raiz.add(new DefaultMutableTreeNode(cargo.getDescricao()));
		}*/

		tree.setModel(treeModel);
	}
	
	
	
	private void init() {
		getContentPane().setLayout(new BorderLayout());
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