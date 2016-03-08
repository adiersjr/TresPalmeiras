package br.com.xkinfo.endereco.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.xkinfo.endereco.dao.ITipoLogradouroDao;
import br.com.xkinfo.endereco.model.TipoLogradouro;
import br.com.xkinfo.util.Conexao;

public class TipoLogradouroDao implements ITipoLogradouroDao{
	
	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirTipoLogradouro(TipoLogradouro tipoLogradouro) throws Exception {
		int result = -1;
		String query = "INSERT INTO TIPOLOGRADOURO (TIP_DESCRICAO) "
				+ " VALUES ('"+tipoLogradouro.getDescricao()+"') ";
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
	public int alterarTipoLogradouro(TipoLogradouro tipoLogradouro) throws Exception {
		int result = -1;
		String query = "UPDATE TIPOLOGRADOURO SET TIP_DESCRICAO = '"+tipoLogradouro.getDescricao()+"' "
				+ " WHERE TIP_CODIGO = "+tipoLogradouro.getId()+"  ";
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
	public int excluitTipoLogradouro(TipoLogradouro tipoLogradouro) throws Exception {
		int result = -1;
		String query = "DELETE FROM TIPOLOGRADOURO WHERE TIP_CODIGO = "+tipoLogradouro.getId()+"  ";
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
	public ResultSet pesquisarTipoLogradouros() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM TIPOLOGRADOURO";
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
	public ResultSet pesquisarTipoLogradouro(int id) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM TIPOLOGRADOURO WHERE TIP_CODIGO = "+id+"  ";
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
