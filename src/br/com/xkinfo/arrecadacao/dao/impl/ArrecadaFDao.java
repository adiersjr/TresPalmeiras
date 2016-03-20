package br.com.xkinfo.arrecadacao.dao.impl;

import java.sql.ResultSet;
import br.com.xkinfo.arrecadacao.dao.IArrecadaFDao;
import br.com.xkinfo.arrecadacao.model.ArrecadaF;
import br.com.xkinfo.arrecadacao.model.Banco;
import br.com.xkinfo.cadastro.model.Cadastro;
import br.com.xkinfo.util.Conexao;

public class ArrecadaFDao implements IArrecadaFDao{

	Conexao conexao = new Conexao();
	@Override
	public int incluirArrecadaF(ArrecadaF arrecadaF) throws Exception {
		return 0;
	}

	@Override
	public ResultSet pesquisaArrecadaFs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet pesquisaArrecadaFs(Banco banco) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet pesquisaArrecadaF(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet pesquisaArrecadaF(Cadastro cadastro) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
