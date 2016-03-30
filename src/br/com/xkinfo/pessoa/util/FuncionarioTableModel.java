package br.com.xkinfo.pessoa.util;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.xkinfo.pessoa.model.Funcionario;
import br.com.xkinfo.service.ServiceFactory;

public class FuncionarioTableModel extends AbstractTableModel {
	
	private static final long serialVersionUID = 1L;
	private List<Funcionario> funcionarios;
	private String[] cabecalho = {"Código", "Nome"};

	public FuncionarioTableModel() {
		try {
			funcionarios = ServiceFactory.getFuncionarioservice().pesquisaFuncionarios();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public FuncionarioTableModel(String nome){
		try {
			funcionarios = ServiceFactory.getFuncionarioservice().pesquisaNome(nome);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public int getRowCount() {
		return funcionarios.size();
	}

	@Override
	public int getColumnCount() {
		return cabecalho.length;
	}

	@Override
	public Object getValueAt(int numLinha, int numColuna) {
		switch(numColuna){
		case 0:
			return funcionarios.get(numLinha).getId();
		case 1:
			return funcionarios.get(numLinha).getNome();
		}
		return null;
	}

	public String getColumnName(int numColuna) {
		return cabecalho[numColuna];
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
}
