package br.com.xkinfo.arrecadacao.dao.impl;

import java.sql.ResultSet;
import java.util.Calendar;

import br.com.xkinfo.arrecadacao.dao.IArrecadaGDao;
import br.com.xkinfo.arrecadacao.model.ArrecadaG;
import br.com.xkinfo.arrecadacao.model.Banco;
import br.com.xkinfo.util.Conexao;

public class ArrecadaGDao implements IArrecadaGDao{

	Conexao conexao = new Conexao();
	@Override
	public int incluirArrecadaG(ArrecadaG arrecadaG) throws Exception {
		
		return 0;
	}

	@Override
	public ResultSet pesquisaArrecadaGs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet pesquisaArrecadaGs(Banco banco) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet pesquisaArrecadaG(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet pesquisaArrecadaG(Calendar dataCredito) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
