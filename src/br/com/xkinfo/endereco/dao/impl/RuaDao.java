package br.com.xkinfo.endereco.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.xkinfo.endereco.dao.IRuaDao;
import br.com.xkinfo.endereco.model.Rua;
import br.com.xkinfo.util.Conexao;

public class RuaDao implements IRuaDao{

	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirRua(Rua rua) throws Exception {
		int result = -1;
		String query = "INSERT INTO RUAS (TIP_CODIGO, ETA_CODIGO, RUA_NOME, BAI_NOME, RUA_VLRLIXO) "
				+ " VALUES ("+rua.getTipoLogradouro().getId()+", "+rua.getEta().getId()+", '"+rua.getNome()+"', '"+rua.getBairro()+"', "+rua.getValorLixo()+") ";
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
	public int alterarRua(Rua rua) throws Exception {
		int result = -1;
		String query = "UPDATE RUAS SET TIP_CODIGO = "+rua.getTipoLogradouro().getId()+", ETA_CODIGO = "+rua.getEta().getId()+", "
				+ " RUA_NOME = '"+rua.getNome()+"', BAI_NOME = '"+rua.getBairro()+"', RUA_VLRLIXO = "+rua.getValorLixo()+" "
				+ " WHERE RUA_NUMERO = "+rua.getId()+" ";
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
	public int excluirRua(Rua rua) throws Exception {
		int result = -1;
		String query = "DELETE FROM RUAS WHERE RUA_NUMERO = "+rua.getId()+" ";
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
	public ResultSet pesquisarRuas() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM RUAS";
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
	public ResultSet pesquisarRua(int id) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM RUAS WHERE RUA_NUMERO = "+id+" ";
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
