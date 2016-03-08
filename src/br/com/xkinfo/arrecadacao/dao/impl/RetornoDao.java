package br.com.xkinfo.arrecadacao.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.xkinfo.arrecadacao.dao.IRetornoDao;
import br.com.xkinfo.arrecadacao.model.Retorno;
import br.com.xkinfo.util.Conexao;

public class RetornoDao implements IRetornoDao{
	
	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirRetorno(Retorno retorno) throws Exception {
		int result = -1;
		String query = "INSERT INTO RETORNOS (RET_DESCRICAO) "
				+ " VALUES ('"+retorno.getDescricao()+"') ";
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
	public int alterarRetorno(Retorno retorno) throws Exception {
		int result = -1;
		String query = "UPDATE RETORNOS SET RET_DESCRICAO = '"+retorno.getDescricao()+"' "
				+ "WHERE RET_RETORNO = "+retorno.getId()+" )";
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
	public int excluirRetorno(Retorno retorno) throws Exception {
		int result = -1;
		String query = "DELETE FROM RETORNOS WHERE RET_RETORNO = "+retorno.getId()+" )";
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
	public ResultSet pesquisaRetornos() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM RETORNOS";
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
	public ResultSet pesquisaRetorno(int id) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM BANCOS WHERE RET_RETORNO = "+id+" )";
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
