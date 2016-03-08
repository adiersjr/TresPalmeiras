package br.com.xkinfo.endereco.dao;

import java.sql.ResultSet;
import br.com.xkinfo.endereco.model.Rua;

public interface IRuaDao {
	
	public int incluirRua(Rua rua) throws Exception;
	
	public int alterarRua(Rua rua) throws Exception;
	
	public int excluirRua(Rua rua) throws Exception;
	
	public ResultSet pesquisarRuas() throws Exception;
	
	public ResultSet pesquisarRua(int id) throws Exception;

}
