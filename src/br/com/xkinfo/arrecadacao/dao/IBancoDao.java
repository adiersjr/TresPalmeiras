package br.com.xkinfo.arrecadacao.dao;

import java.sql.ResultSet;

import br.com.xkinfo.arrecadacao.model.Banco;

public interface IBancoDao {

	public int incluirBanco(Banco banco) throws Exception;

	public int alterarBanco(Banco banco) throws Exception;

	public int excluirBanco(Banco banco) throws Exception;

	public ResultSet pesquisaBancos() throws Exception;

	public ResultSet pesquisaBanco(int id) throws Exception;
}
