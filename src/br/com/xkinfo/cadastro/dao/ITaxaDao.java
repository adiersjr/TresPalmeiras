package br.com.xkinfo.cadastro.dao;

import java.sql.ResultSet;

import br.com.xkinfo.cadastro.model.Taxa;

public interface ITaxaDao {
	
	public int incluirTaxa(Taxa taxa) throws Exception;
	
	public int alterarTaxa(Taxa taxa) throws Exception;
	
	public int excluirTaxa(Taxa taxa) throws Exception;
	
	public ResultSet pesquisaTaxas() throws Exception;
	
	public ResultSet pesquisaTaxa(int id) throws Exception;

}
