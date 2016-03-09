package br.com.xkinfo.outros.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.xkinfo.outros.dao.IEtaDao;
import br.com.xkinfo.outros.model.Eta;
import br.com.xkinfo.util.Conexao;

public class EtaDao implements IEtaDao{
	
	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirEta(Eta eta) throws Exception {
		int result = -1;
		String query = "INSERT INTO ETAS (ETA_DESCRICAO) VALUES ('"+eta.getDescricao()+"') ";
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
	public int alterarEta(Eta eta) throws Exception {
		int result = -1;
		String query = "UPDATE ETAS SET ETA_DESCRICAO = '"+eta.getDescricao()+"' WHERE ETA_CODIGO = "+eta.getId()+" ";
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
	public int excluirEta(Eta eta) throws Exception {
		int result = -1;
		String query = "DELETE FROM ETAS WHERE ETA_CODIGO = "+eta.getId()+" ";
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
	public ResultSet pesquisarEtas() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM ETAS";
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
	public ResultSet pesquisarEta(int id) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM ETAS WHERE ETA_CODIGO = "+id+" ";
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
