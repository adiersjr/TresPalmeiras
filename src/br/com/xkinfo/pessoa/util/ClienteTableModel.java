package br.com.xkinfo.pessoa.util;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.xkinfo.pessoa.model.Cliente;
import br.com.xkinfo.service.ServiceFactory;

public class ClienteTableModel extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	private List<Cliente> clientes;
	private String[] cabecalho = {"Código", "Nome"};
	
	public ClienteTableModel() {
		try {
			clientes = ServiceFactory.getClienteservice().pesquisaClientes();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ClienteTableModel(String nome){
		try {
			clientes = ServiceFactory.getClienteservice().pesquisaClientes();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public int getRowCount() {
		return clientes.size();
	}

	@Override
	public int getColumnCount() {
		return cabecalho.length;
	}

	@Override
	public Object getValueAt(int numLinha, int numColuna) {
		switch(numColuna){
		case 0:
			return clientes.get(numLinha).getId();
		case 1:
			return clientes.get(numLinha).getNome();
		}
		return null;
	}

	public String getColumnName(int numColuna) {
        return cabecalho[numColuna];
    }
	
	public List<Cliente> getClientes() {
        return clientes;
    }
}
