package br.com.xkinfo.cadastro.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.xkinfo.cadastro.dao.IGrupoAtividadeDao;
import br.com.xkinfo.cadastro.model.GrupoAtividade;
import br.com.xkinfo.util.Conexao;

public class GrupoAtividadeDao implements IGrupoAtividadeDao{

	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirGrupoAtividade(GrupoAtividade grupoAtividade) throws Exception {
		int result = -1;
		String query = "INSERT INTO GRUPOATIVIDADE (GRA_DESCRICAO) "
				+ " VALUES ('"+grupoAtividade.getDescricao()+"') ";
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
	public int alterarGrupoAtividade(GrupoAtividade grupoAtividade) throws Exception {
		int result = -1;
		String query = "UPDATE GRUPOATIVIDADE SET GRA_DESCRICAO = '"+grupoAtividade.getDescricao()+"'"
				+ " WHERE GRA_CODIGO = "+grupoAtividade.getId()+" ";
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
	public int excluirGrupoAtividade(GrupoAtividade grupoAtividade) throws Exception {
		int result = -1;
		String query = "DELETE FROM GRUPOATIVIDADE WHERE GRA_CODIGO = "+grupoAtividade.getId()+" ";
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
	public ResultSet pesquisarGrupoAtividades() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM GRUPOATIVIDADE";
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
	public ResultSet pesquisarGrupoAtividade(int id) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM GRUPOATIVIDADE WHERE GRA_CODIGO = "+id+" ";
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
