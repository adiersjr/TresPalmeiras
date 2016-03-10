package br.com.xkinfo.cadastro.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.xkinfo.cadastro.dao.IRamalLigacaoDao;
import br.com.xkinfo.cadastro.model.RamalLigacao;
import br.com.xkinfo.util.Conexao;

public class RamalLigacaoDao implements IRamalLigacaoDao{
	
	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirRamalLigacao(RamalLigacao ramalLigacao) throws Exception {
		int result = -1;
		String query = "INSERT INTO RAMALLIGACAO (RAMALLIGACAO) "
				+ " VALUES ('"+ramalLigacao.getDescricao()+"') ";
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
	public int alterarRamalLigacao(RamalLigacao ramalLigacao) throws Exception {
		int result = -1;
		String query = "UPDATE RAMALLIGACAO SET RAMALLIGACAO = '"+ramalLigacao.getDescricao()+"' "
				+ " WHERE RAM_NUMERO = "+ramalLigacao.getId()+") ";
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
	public int excluirRamalLigacao(RamalLigacao ramalLigacao) throws Exception {
		int result = -1;
		String query = "DELETE FROM RAMALLIGACAO WHERE RAM_NUMERO = "+ramalLigacao.getId()+") ";
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
	public ResultSet pesquisarRamalLigacoes() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM RAMALLIGACAO";
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
	public ResultSet pesquisarRamalLigacao(int id) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM RAMALLIGACAO WHERE RAM_NUMERO = "+id+") ";
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
