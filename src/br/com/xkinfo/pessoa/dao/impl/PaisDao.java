package br.com.xkinfo.pessoa.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.xkinfo.pessoa.dao.IPaisDao;
import br.com.xkinfo.pessoa.model.Pais;
import br.com.xkinfo.util.Conexao;

public class PaisDao implements IPaisDao{

	Conexao conexao = new Conexao();
	private Statement st;
	
	@Override
	public int incluirPais(Pais pais) throws Exception {
		int result = -1;
		String query = "INSERT INTO PAISES (PAI_NOME, PAI_SIGLA) VALUES ('"+pais.getNome()+"','"+pais.getSigla()+"') ";
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
	public int alterarPais(Pais pais) throws Exception {
		int result = -1;
		String query = "UPDATE PAISES SET PAI_NOME = '"+pais.getNome()+"', PAI_SIGLA = '"+pais.getSigla()+"'  WHERE PAI_NUMERO = "+pais.getId()+" ";
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
	public int excluirPais(Pais pais) throws Exception {
		int result = -1;
		String query = "DELETE FROM PAISES WHERE PAI_NUMERO = "+pais.getId()+" ";
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
	public ResultSet pesquisaPaises() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM PAISES";
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
		String query = "SELECT * FROM PAISES WHERE PAI_NOME LIKE '%" + nome + "%' ";
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
	public ResultSet pesquisaPais(int id) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM PAISES WHERE PAI_NUMERO = " + id;
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
