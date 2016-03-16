package br.com.xkinfo.arrecadacao.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class BancoTreeModel implements TreeModel{

	private String raiz = "Bancos";
	private List<TreeModelListener> listeners = new ArrayList<>();
	private List<Banco> bancos;

	public BancoTreeModel(List<Banco> bancos) {
		this.bancos = bancos;
	}

	@Override
	public Object getRoot() {
		return raiz;
	}

	@Override
	public Object getChild(Object parent, int index) {
		if (parent == raiz) // É o nó principal?
			return bancos.get(index); // Pegamos da lista de livro
		if (parent instanceof Banco) // O pai é um livro?
		{
			// Devolvemos um autor
			return ((Banco) parent).getAgencias().get(index);
		}
		// Se o pai não é nenhum desses. Melhor dar erro.
		throw new IllegalArgumentException("Invalid parent class"
				+ parent.getClass().getSimpleName());
	}

	@Override
	public int getChildCount(Object parent) {
		// Mesma lógica.
		if (parent == raiz)
			return bancos.size();
		if (parent instanceof Banco) // O pai é um livro?
			return ((Banco) parent).getAgencias().size();
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
