package br.com.xkinfo.arrecadacao.dao;

import java.sql.ResultSet;

import br.com.xkinfo.arrecadacao.model.ArrecadaE;
import br.com.xkinfo.arrecadacao.model.Banco;
import br.com.xkinfo.cadastro.model.Cadastro;


public interface IArrecadaEDao {
	
	public int incluirArrecadaE(ArrecadaE arrecadaE) throws Exception;
	
	public ResultSet pesquisaArrecadaEs() throws Exception;
	
	public ResultSet pesquisaArrecadaEs(Banco banco) throws Exception;

	public ResultSet pesquisaArrecadaE(int nsr) throws Exception;
	
	public ResultSet pesquisaArrecadaE(Cadastro cadastro) throws Exception;
}
