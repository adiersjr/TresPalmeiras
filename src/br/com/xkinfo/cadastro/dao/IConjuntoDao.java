package br.com.xkinfo.cadastro.dao;

import java.sql.ResultSet;
import br.com.xkinfo.cadastro.model.Conjunto;

public interface IConjuntoDao {
	
	public int incluirConjunto(Conjunto conjunto) throws Exception;
	
	public int alterarConjunto(Conjunto conjunto) throws Exception;
	
	public int excluirConjunto(Conjunto conjunto) throws Exception;
	
	public ResultSet pesquisarConjuntos() throws Exception;
	
	public ResultSet pesquisarConjunto(String numero) throws Exception;

}
