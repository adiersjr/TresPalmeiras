package br.com.xkinfo.outros.dao;

import java.sql.ResultSet;
import br.com.xkinfo.outros.model.Eta;

public interface IEtaDao {
	
	public int incluirEta(Eta eta) throws Exception;
	
	public int alterarEta(Eta eta) throws Exception;
	
	public int excluirEta(Eta eta) throws Exception;
	
	public ResultSet pesquisarEtas() throws Exception;
	
	public ResultSet pesquisarEta(int id) throws Exception;

}
