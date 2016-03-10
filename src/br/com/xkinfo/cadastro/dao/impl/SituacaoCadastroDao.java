package br.com.xkinfo.cadastro.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.xkinfo.cadastro.dao.ISituacaoCadastroDao;
import br.com.xkinfo.cadastro.model.SituacaoCadastro;
import br.com.xkinfo.util.Conexao;

public class SituacaoCadastroDao implements ISituacaoCadastroDao {
	
	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirSituacaoCadastro(SituacaoCadastro situacaoCadastro) throws Exception {
		int result = -1;
		String query = "INSERT INTO SITUACAOCAD (SIT_NUMERO, SIT_DESCRICAO) "
				+ " VALUES ("+situacaoCadastro.getNumero()+", '"+situacaoCadastro.getDescricao()+"') ";
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
	public int alterarSituacaoCadastro(SituacaoCadastro situacaoCadastro) throws Exception {
		int result = -1;
		String query = "UPDATE SITUACAOCAD SET SIT_NUMERO = "+situacaoCadastro.getNumero()+", SIT_DESCRICAO = '"+situacaoCadastro.getDescricao()+"' "
				+ " WHERE SITUACAOCAD = "+situacaoCadastro.getId()+") ";
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
	public int excluitSituacaoCadastro(SituacaoCadastro situacaoCadastro) throws Exception {
		int result = -1;
		String query = "DELETE FROM SITUACAOCAD WHERE SITUACAOCAD = "+situacaoCadastro.getId()+") ";
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
	public ResultSet pesquisarSituacaoCadastros() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM SITUACAOCAD";
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
	public ResultSet pesquisarSituacaoCadastro(int id) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM SITUACAOCAD WHERE SITUACAOCAD = "+id+") ";
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
