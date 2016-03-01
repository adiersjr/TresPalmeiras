package br.com.xkinfo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.xkinfo.dao.IMunicipioDao;
import br.com.xkinfo.model.Estado;
import br.com.xkinfo.model.Municipio;
import br.com.xkinfo.util.Conexao;

public class MunicipioDao implements IMunicipioDao{
	
	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirMunicipio(Municipio municipio) throws Exception {
		int result = -1;
		String query;
		query = "INSERT INTO MUNICIPIOS (MUN_NUMERO, EST_SIGLA, MUN_NOME, MUN_CEP, MUN_IBGE, MUN_PRODIST) ";
		query = query + " VALUES (3,'"+municipio.getEstado().getSigla()+"', '"+municipio.getNome()+"', " ;
		query = query + " '"+municipio.getCep()+"', '"+municipio.getCodigoIbge()+"', '"+municipio.getProdist()+"') ";
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
	public int alterarMunicipio(Municipio municipio) throws Exception {
		int result = -1;
		String query;
		query = "UPDATE MUNICIPIOS SET EST_SIGLA = '"+municipio.getEstado().getSigla()+"', MUN_NOME = '"+municipio.getNome()+"', "
				+ " MUN_CEP = '"+municipio.getCep()+"', MUN_IBGE = '"+municipio.getCodigoIbge()+"', MUN_PRODIST = '"+municipio.getProdist()+"'"
						+ " WHERE MUN_NUMERO = "+municipio.getId()+" ";
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
	public int excluirMunicipio(Municipio municipio) throws Exception {
		int result = -1;
		String query = "DELETE FROM MUNICIPIOS WHERE MUN_NUMERO = "+municipio.getId()+" ";
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
	public ResultSet pesquisaMunicipios() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM MUNICIPIOS";
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
		String query = "SELECT * FROM MUNICIPIOS WHERE MUN_NOME LIKE '%" + nome + "%' ";
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
	public ResultSet pesquisaCep(String cep) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM MUNICIPIOS WHERE MUN_CEP = '" + cep + "' ";
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
	public ResultSet pesquisaEstado(Estado estado) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM MUNICIPIOS WHERE EST_SIGLA = '" + estado.getSigla() + "' ";
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
	public ResultSet pesquisaIbge(String codIbge) throws Exception{
		ResultSet rs = null;
		String query = "SELECT * FROM MUNICIPIOS WHERE MUN_IBGE = '" + codIbge + "' ";
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
	public ResultSet pesquisaMunicipio(int id) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM MUNICIPIOS WHERE MUN_NUMERO = " + id + " ";
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
