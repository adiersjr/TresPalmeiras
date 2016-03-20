package br.com.xkinfo.arrecadacao.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.xkinfo.arrecadacao.dao.IArrecadaEDao;
import br.com.xkinfo.arrecadacao.model.ArrecadaE;
import br.com.xkinfo.arrecadacao.model.Banco;
import br.com.xkinfo.cadastro.model.Cadastro;
import br.com.xkinfo.util.Conexao;

public class ArrecadaEDao implements IArrecadaEDao{

	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirArrecadaE(ArrecadaE arrecadaE) throws Exception {
		int result = -1;
		String query = "INSERT INTO ARRECADA_E (ARB_NSR, ARB_CODCLI, BAN_NUMERO, ARB_AGENCIA, ARB_CC, ARB_DTAALTERACAO, ARB_CODMOV) "
				+ " VALUES ('"+ arrecadaE.getNsr() +"', '"+ arrecadaE.getCadastro().getChave() +"', '"+ arrecadaE.getBanco().getNumero() +"',"
				+ arrecadaE.getCodigoMovimentacao()+") ";
		try {
			st = conexao.connect().createStatement();
			result = st.executeUpdate(query);
			conexao.connect().close();
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public ResultSet pesquisaArrecadaEs() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM ARRECADA_E";
		try {
			st = conexao.connect().createStatement();
			rs = st.executeQuery(query);
			conexao.connect().close();
			return rs;
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public ResultSet pesquisaArrecadaEs(Banco banco) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM ARRECADA_E WHERE BAN_NUMERO = '"+ banco.getNumero() +"' ";
		try {
			st = conexao.connect().createStatement();
			rs = st.executeQuery(query);
			conexao.connect().close();
			return rs;
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public ResultSet pesquisaArrecadaE(int nsr) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM ARRECADA_E WHERE ARB_NSR = "+ nsr +" )";
		try {
			st = conexao.connect().createStatement();
			rs = st.executeQuery(query);
			conexao.connect().close();
			return rs;
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public ResultSet pesquisaArrecadaE(Cadastro cadastro) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM ARRECADA_E WHERE ARB_CODCLI = "+cadastro.getChave()+" )";
		try {
			st = conexao.connect().createStatement();
			rs = st.executeQuery(query);
			conexao.connect().close();
			return rs;
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		return rs;
	}

}
