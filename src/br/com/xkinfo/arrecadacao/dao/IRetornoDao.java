package br.com.xkinfo.arrecadacao.dao;

import java.sql.ResultSet;

import br.com.xkinfo.arrecadacao.model.Retorno;

public interface IRetornoDao {

	public int incluirRetorno(Retorno retorno) throws Exception;

	public int alterarRetorno(Retorno retorno) throws Exception;

	public int excluirRetorno(Retorno retorno) throws Exception;

	public ResultSet pesquisaRetornos() throws Exception;

	public ResultSet pesquisaRetorno(int id) throws Exception;

}
