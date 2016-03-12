package br.com.xkinfo.cadastro.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.xkinfo.cadastro.dao.IAtividadeDao;
import br.com.xkinfo.cadastro.model.Atividade;
import br.com.xkinfo.util.Conexao;

public class AtividadeDao implements IAtividadeDao{
	
	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirAtividade(Atividade atividade) throws Exception {
		int result = -1;
		String query = "INSERT INTO ATIVIDADES (ATV_DESCRICAO, ATV_GRUPOANEEL, ATV_NUMERO, GRA_CODIGO, ATV_EPE) "
				+ " VALUES ('"+atividade.getDescricao()+"', '"+atividade.getGrupoAneel()+"', "+atividade.getNumero()+", "
						+ " "+atividade.getGrupoAtividade().getId()+", '"+atividade.getEpe()+"') ";
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
	public int alterarAtividade(Atividade atividade) throws Exception {
		int result = -1;
		String query = "UPDATE ATIVIDADES SET (ATV_DESCRICAO, ATV_GRUPOANEEL, ATV_NUMERO, GRA_CODIGO, ATV_EPE) "
				+ " VALUES ('"+atividade.getDescricao()+"', '"+atividade.getGrupoAneel()+"', "+atividade.getNumero()+", "
						+ " "+atividade.getGrupoAtividade().getId()+", '"+atividade.getEpe()+"') WHERE ATV_CODIGO = "+atividade.getId()+" ";
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
	public int excluirAtividade(Atividade atividade) throws Exception {
		int result = -1;
		String query = "DELETE FROM ATIVIDADES WHERE ATV_CODIGO = "+atividade.getId()+" ";
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
	public ResultSet pesquisarAtividades() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM ATIVIDADES";
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
	public ResultSet pesquisarAtividade(String id) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM ATIVIDADES WHERE ATV_CODIGO = "+id+" ";
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
