package br.com.xkinfo.cadastro.dao;

import java.sql.ResultSet;
import br.com.xkinfo.cadastro.model.Conjunto;

public interface IConjuntoDao {
	
	public int incluirConjunto(Conjunto conjunto) throws Exception;
	
	public int alterarConjunto(Conjunto conjunto) throws Exception;
	
	public int excluitConjunto(Conjunto conjunto) throws Exception;
	
	public ResultSet pesquisarConjuntos() throws Exception;
	
	public ResultSet pesquisarConjunto(int id) throws Exception;

}
