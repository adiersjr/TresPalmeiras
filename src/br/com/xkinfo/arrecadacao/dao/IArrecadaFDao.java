package br.com.xkinfo.arrecadacao.dao;

import java.sql.ResultSet;

import br.com.xkinfo.arrecadacao.model.ArrecadaF;
import br.com.xkinfo.arrecadacao.model.Banco;
import br.com.xkinfo.cadastro.model.Cadastro;

public interface IArrecadaFDao {
	
	public int incluirArrecadaF(ArrecadaF arrecadaF) throws Exception;
	
	public ResultSet pesquisaArrecadaFs() throws Exception;
	
	public ResultSet pesquisaArrecadaFs(Banco banco) throws Exception;

	public ResultSet pesquisaArrecadaF(int id) throws Exception;
	
	public ResultSet pesquisaArrecadaF(Cadastro cadastro) throws Exception;
}
