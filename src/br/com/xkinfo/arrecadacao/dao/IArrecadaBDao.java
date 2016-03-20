package br.com.xkinfo.arrecadacao.dao;

import java.sql.ResultSet;

import br.com.xkinfo.arrecadacao.model.Agencia;
import br.com.xkinfo.arrecadacao.model.ArrecadaB;
import br.com.xkinfo.cadastro.model.Cadastro;


public interface IArrecadaBDao {
	
	public int incluirArrecadaB(ArrecadaB arrecadaB) throws Exception;
	
	public ResultSet pesquisaArrecadaBs() throws Exception;
	
	public ResultSet pesquisaArrecadaBs(Agencia agencia) throws Exception;

	public ResultSet pesquisaArrecadaB(int id) throws Exception;
	
	public ResultSet pesquisaArrecadaB(Cadastro cadastro) throws Exception;
}
