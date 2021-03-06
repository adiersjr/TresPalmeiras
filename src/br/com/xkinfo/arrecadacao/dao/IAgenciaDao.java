package br.com.xkinfo.arrecadacao.dao;

import java.sql.ResultSet;

import br.com.xkinfo.arrecadacao.model.Agencia;
import br.com.xkinfo.arrecadacao.model.Banco;

public interface IAgenciaDao {
	
	public int incluirAgencia(Agencia agencia) throws Exception;
	
	public int alterarAgencia(Agencia agencia) throws Exception;
	
	public int excluirAgencia(Agencia agencia) throws Exception;

	public ResultSet pesquisaAgencias() throws Exception;
	
	public ResultSet pesquisaAgencias(Banco banco) throws Exception;

	public ResultSet pesquisaAgencia(int id) throws Exception;
	
	public ResultSet pesquisaAgencia(String chave) throws Exception;

}
