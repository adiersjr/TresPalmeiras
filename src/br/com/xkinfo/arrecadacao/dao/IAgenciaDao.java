package br.com.xkinfo.arrecadacao.dao;

import java.sql.ResultSet;

import br.com.xkinfo.arrecadacao.model.Agencia;

public interface IAgenciaDao {
	
	public int incluirAgencia(Agencia agencia) throws Exception;
	
	public int alterarAgencia(Agencia agencia) throws Exception;
	
	public int excluirAgencia(Agencia agencia) throws Exception;

	public ResultSet pesquisaAgencias() throws Exception;

	public ResultSet pesquisaAgencia(int id) throws Exception;

}
