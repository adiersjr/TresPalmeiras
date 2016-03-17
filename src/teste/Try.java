package teste;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Try extends JFrame {

	public static void main(String[] args) {
		new Try();
	}

	public Try() {
		init();
	}

	public void init() {
		JPanel panel = new JPanel( new BorderLayout() );
		this.add( panel );
		No no1 = new No("1.0");
		No no11 = new No("1.1");
		No no12 = new No("1.2");
		No no121 = new No("1.2.1");
		No no122 = new No("1.2.2");
		No no13 = new No("1.3");
		No no2 = new No("2");
		no1.addNo(no11);
		no1.addNo(no12);
		no12.addNo(no121);
		no12.addNo(no122);
		no1.addNo(no13);
		ArrayList<No> nos = new ArrayList<No>();
		nos.add( no1 );
		nos.add( no2 );
		DefaultTreeModel model = new DefaultTreeModel(getRoot(nos));
		JTree tree = new JTree( model );
		panel.add( tree, BorderLayout.CENTER );
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		this.pack();
		this.setVisible(true);
	}

	public DefaultMutableTreeNode getRoot( ArrayList<No> nos ) {
		DefaultMutableTreeNode root = new DefaultMutableTreeNode();
		for (No no : nos) {
			DefaultMutableTreeNode nodeChild = new DefaultMutableTreeNode( no );
			populate(nodeChild, no);
			root.add(nodeChild);
		}
		return root;
	}

	public void populate( DefaultMutableTreeNode nodeParent, No noParent ) {
		if ( noParent.getNos() != null ) {
			for( No noChild : noParent.getNos() ) {
				DefaultMutableTreeNode nodeChild = new DefaultMutableTreeNode( noChild );
				nodeParent.add(nodeChild);
				populate(nodeChild, noChild);
			}
		}
	}


	class No implements INo {
		private ArrayList<No> nos;
		private String descricao;
		
		public No(String descricao) {  // CONSTRUTOR
			this.descricao = descricao;
		}
		public ArrayList<No> getNos() {
			return nos;
		}
		public void addNo( No no ) {
			if ( nos == null ) {
				nos = new ArrayList<No>();
			}
			nos.add( no );
		}
		@Override
		public String toString() {
			return this.descricao;
		}
	}

	interface INo {
		ArrayList<No> getNos();
		void addNo( No no );
	}
}