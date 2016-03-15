package br.com.xkinfo.pessoa.util;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import br.com.xkinfo.pessoa.model.*;
import br.com.xkinfo.service.ServiceFactory;

public class CargoTableModel extends AbstractTableModel{
	
	private List<Cargo> cargos;
	private String[] cabecalho = {"Código", "Descrição"};
	
	public CargoTableModel() {
		try {
			cargos = ServiceFactory.getCargoservice().pesquisaCargos();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public int getRowCount() {
		return cargos.size();
	}

	@Override
	public int getColumnCount() {
		return cabecalho.length;
	}

	@Override
	public Object getValueAt(int numLinha, int numColuna) {
		switch(numColuna){
		case 0:
			return cargos.get(numLinha).getId();
		case 1:
			return cargos.get(numLinha).getDescricao();
		}
		return null;
	}

	public String getColumnName(int numColuna) {
        return cabecalho[numColuna];
    }
	
	public List<Cargo> getCargos() {
        return cargos;
    }
}
