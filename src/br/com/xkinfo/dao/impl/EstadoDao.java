package br.com.xkinfo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.xkinfo.dao.IEstadoDao;
import br.com.xkinfo.model.Estado;
import br.com.xkinfo.model.Pais;
import br.com.xkinfo.util.Conexao;

public class EstadoDao implements IEstadoDao{
	
	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirEstado(Estado estado) throws Exception {
		int result = -1;
		String query = "INSERT INTO ESTADO (EST_SIGLA, EST_NOME, PAI_NUMERO) "
				+ "VALUES ('"+estado.getSigla()+"', '"+estado.getNome()+"',"+estado.getPais().getId()+") ";
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
	public int alterarEstado(Estado estado) throws Exception {
		int result = -1;
		String query = "UPDATE ESTADO SET EST_SIGLA = '"+estado.getSigla()+"', EST_NOME = '"+estado.getNome()+"', PAI_NUMERO = "+estado.getPais().getId()+" "
				+ " WHERE EST_CODIGO = "+estado.getId()+" ";
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
	public int excluirEstado(Estado estado) throws Exception {
		int result = -1;
		String query = "DELETE FROM ESTADO WHERE EST_CODIGO = "+estado.getId()+" ";
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
	public ResultSet pesquisaEstados() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM ESTADO";
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
	public ResultSet pesquisaNome(String nome) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM ESTADO WHERE EST_NOME LIKE '%" + nome + "%' ";
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
	public ResultSet pesquisaSigla(String sigla) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM ESTADO WHERE EST_SIGLA = '" + sigla + "' ";
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
	public ResultSet pesquisaPais(Pais pais) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM ESTADO WHERE PAI_NUMERO = " + pais.getId() + " ";
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
	public ResultSet pesquisaEstado(int id) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM ESTADO WHERE EST_CODIGO = " + id + " ";
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
