package br.com.xkinfo.arrecadacao.dao;

import java.sql.ResultSet;
import java.util.Calendar;

import br.com.xkinfo.arrecadacao.model.ArrecadaG;
import br.com.xkinfo.arrecadacao.model.Banco;

public interface IArrecadaGDao {
	
	public int incluirArrecadaG(ArrecadaG arrecadaG) throws Exception;
	
	public ResultSet pesquisaArrecadaGs() throws Exception;
	
	public ResultSet pesquisaArrecadaGs(Banco banco) throws Exception;

	public ResultSet pesquisaArrecadaG(int id) throws Exception;
	
	public ResultSet pesquisaArrecadaG(Calendar dataCredito) throws Exception;
}
