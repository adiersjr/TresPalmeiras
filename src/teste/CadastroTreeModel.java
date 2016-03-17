package teste;

import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

import br.com.xkinfo.arrecadacao.model.Agencia;
import br.com.xkinfo.arrecadacao.model.Banco;

public class CadastroTreeModel implements TreeModel{

	private String raiz = "Root";
	private List<TreeModelListener> listeners = new ArrayList<>();
	private List<Object> listas;

	public CadastroTreeModel(List<Object> listas) {
		this.listas = listas;
	}

	@Override
	public Object getRoot() {
		return raiz;
	}

	@Override
	public Object getChild(Object parent, int index) {
		if (parent == raiz) // É o nó principal?
			return listas.get(index); // Pegamos da lista de livro
		if (parent instanceof Object) // O pai é um livro?
		{
			// Devolvemos um autor
			return ((Object) parent).getClass();
		}
		// Se o pai não é nenhum desses. Melhor dar erro.
		throw new IllegalArgumentException("Invalid parent class"
				+ parent.getClass().getSimpleName());
	}

	@Override
	public int getChildCount(Object parent) {
		// Mesma lógica.
		if (parent == raiz)
			return listas.size();
		if (parent instanceof Banco) // O pai é um livro?
			return ((Object) parent).getClass()
		// Se o pai não é nenhum desses. Melhor dar erro.
		throw new IllegalArgumentException("Invalid parent class"
				+ parent.getClass().getSimpleName());
	}

	@Override
	public boolean isLeaf(Object node) {
		return node instanceof Agencia;
	}

	@Override
	public void valueForPathChanged(TreePath path, Object newValue) {
		// TODO Auto-generated method stub
	}

	@Override
	public int getIndexOfChild(Object parent, Object child) {
		if (parent == raiz)
			return bancos.indexOf(child);
		if (parent instanceof Banco)
			return ((Banco) parent).getAgencias().indexOf(child);
		return 0;
	}

	@Override
	public void addTreeModelListener(TreeModelListener l) {
		listeners.add(l);
	}

	@Override
	public void removeTreeModelListener(TreeModelListener l) {
		listeners.remove(l);
	}

}
