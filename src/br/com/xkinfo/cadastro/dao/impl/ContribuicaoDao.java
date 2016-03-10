package br.com.xkinfo.cadastro.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.xkinfo.cadastro.dao.IContribuicaoDao;
import br.com.xkinfo.cadastro.model.Contribuicao;
import br.com.xkinfo.service.ServiceFactory;
import br.com.xkinfo.util.Conexao;

public class ContribuicaoDao implements IContribuicaoDao{

	Conexao conexao = new Conexao();
	private Statement st;


	@Override
	public int incluirContribuicao(Contribuicao contribuicao) throws Exception {
		int result = -1;
		String query = "INSERT INTO CONTRIBUICAO (CAD_CHAVE, CON_VALOR, CON_DATA, TAX_CODIGO) "
				+ " VALUES ("+contribuicao.getCadastro().getId()+", "+contribuicao.getValor()+", "
				+ " "+ServiceFactory.getApoioservice().converteDataBanco(contribuicao.getData())+", '"+contribuicao.getTaxa().getId()+"' " ;
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
	public int alterarContribuicao(Contribuicao contribuicao) throws Exception {
		int result = -1;
		String query = "UPDATE CONTRIBUICAO SET CAD_CHAVE = "+contribuicao.getCadastro().getId()+", CON_VALOR = "+contribuicao.getValor()+", "
				+ " CON_DATA = "+ServiceFactory.getApoioservice().converteDataBanco(contribuicao.getData())+", TAX_CODIGO = '"+contribuicao.getTaxa().getId()+"' "
				+ " WHERE CON_NUMERO = "+contribuicao.getId()+" ";
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
	public int excluirContribuicao(Contribuicao contribuicao) throws Exception {
		int result = -1;
		String query = "DELETE FROM CONTRIBUICAO WHERE CON_NUMERO = "+contribuicao.getId()+" ";
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
	public ResultSet pesquisarContribuicoes() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM CONTRIBUICAO";
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
	public ResultSet pesquisarContribuicao(int id) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM CONTRIBUICAO WHERE CON_NUMERO = "+id+" ";
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
