package br.com.xkinfo.endereco.dao;

import java.sql.ResultSet;

import br.com.xkinfo.endereco.model.Bairro;

public interface IBairroDao {
	
	public int incluirBairro(Bairro bairro) throws Exception;
	
	public int alterarBairro(Bairro bairro) throws Exception;
	
	public int excluirBairro(Bairro bairro) throws Exception;
	
	public ResultSet pesquisarBairros() throws Exception;
	
	public ResultSet pesquisarBairro(int id) throws Exception;

}
