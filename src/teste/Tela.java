package teste;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.TreeModel;

import br.com.xkinfo.arrecadacao.model.Banco;
import br.com.xkinfo.service.ServiceFactory;

public class Tela extends JDialog {
	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JScrollPane scrlTree = null;
	private JTree treeLivros = null;
	private TreeModel treeModel;
	
	public static void main(String[] args) {
		List<Banco> bancos = null;
		try {
			bancos = ServiceFactory.getBancoservice().pesquisaBancos();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Tela tela = new Tela(new BancoTreeModel(bancos));
		tela.setVisible(true);

	}
	
	public Tela(TreeModel treeModel) {
		super();
		this.treeModel = treeModel;
		initialize();
	}

	private void initialize() {
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setTitle("Tree");
		this.setContentPane(getJContentPane());
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getScrlTree(), BorderLayout.CENTER);
		}
		return jContentPane;
	}

	private JScrollPane getScrlTree() {
		if (scrlTree == null) {
			scrlTree = new JScrollPane();
			scrlTree.setViewportView(getTreeLivros());
		}
		return scrlTree;
	}

	private JTree getTreeLivros() {
		if (treeLivros == null) {
			treeLivros = new JTree(treeModel);
			treeLivros.setRootVisible(true);
			treeLivros.setShowsRootHandles(true);
		}
		return treeLivros;
	}

	

}
