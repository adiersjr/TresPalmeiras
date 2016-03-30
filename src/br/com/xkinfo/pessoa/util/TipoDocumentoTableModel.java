package br.com.xkinfo.pessoa.util;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.xkinfo.pessoa.model.TipoDocumento;
import br.com.xkinfo.service.ServiceFactory;

public class TipoDocumentoTableModel extends AbstractTableModel{

	private static final long serialVersionUID = 1L;
	private List<TipoDocumento> documentos;
	private String[] cabecalho = {"Código", "Descrição"};
	
	public TipoDocumentoTableModel() {
		try {
			documentos = ServiceFactory.getTipodocumentoservice().pesquisaTipoDocumentos();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public TipoDocumentoTableModel(String descricao){
		try {
			documentos = ServiceFactory.getTipodocumentoservice().pesquisaDescricao(descricao);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public int getRowCount() {
		return documentos.size();
	}

	@Override
	public int getColumnCount() {
		return cabecalho.length;
	}

	@Override
	public Object getValueAt(int numLinha, int numColuna) {
		switch(numColuna){
		case 0:
			return documentos.get(numLinha).getId();
		case 1:
			return documentos.get(numLinha).getDescricao();
		}
		return null;
	}

	public String getColumnName(int numColuna) {
        return cabecalho[numColuna];
    }
	
	public List<TipoDocumento> getTipoDocumentos() {
        return documentos;
    }
}
