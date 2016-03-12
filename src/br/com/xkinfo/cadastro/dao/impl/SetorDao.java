package br.com.xkinfo.cadastro.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.xkinfo.cadastro.dao.ISetorDao;
import br.com.xkinfo.cadastro.model.Setor;
import br.com.xkinfo.util.Conexao;

public class SetorDao implements ISetorDao{

	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirSetor(Setor setor) throws Exception {
		int result = -1;
		String query = "INSERT INTO SETORES (SET_CHAVE, MUN_NUMERO, SET_SETOR, SET_DESCR, SET_ULTFATUR, SET_DTAULTCALC, SET_DTAULTEXTFAT, SET_LOCALIZ, "
				+ " SET_ULTFATURAT, SET_DTAULTCALCAT ) "
				+ " VALUES ('"+setor.getChave()+"', "+setor.getMunicipio().getId()+", '"+setor.getSetor()+"', '"+setor.getDescricao()+"', "
				+ " '"+setor.getUltimaFatura()+"', '"+setor.getDataUltimaCalc()+"', '"+setor.getDataUltimaExtFatura()+"', "
				+ " '"+setor.getLocalizacao()+"', '"+setor.getUltimaFaturaT()+"', '"+setor.getDataUltimaCalCat()+"')  ";
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
	public int alterarSetor(Setor setor) throws Exception {
		int result = -1;
		String query = "UPDATE SETORES SET SET_CHAVE = '"+setor.getChave()+"', MUN_NUMERO = "+setor.getMunicipio().getId()+", "
				+ " SET_SETOR = '"+setor.getSetor()+"', SET_DESCR = '"+setor.getDescricao()+"', SET_ULTFATUR = '"+setor.getUltimaFatura()+"', "
				+ " SET_DTAULTCALC = '"+setor.getDataUltimaCalc()+"', SET_DTAULTEXTFAT = '"+setor.getDataUltimaExtFatura()+"', "
				+ " SET_LOCALIZ = '"+setor.getLocalizacao()+"', SET_ULTFATURAT = '"+setor.getUltimaFaturaT()+"', "
				+ " SET_DTAULTCALCAT = '"+setor.getDataUltimaCalCat()+"' WHERE ID = "+setor.getId()+"  ";
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
	public int excluirSetor(Setor setor) throws Exception {
		int result = -1;
		String query = "DELETE FROM SETORES WHERE ID = "+setor.getId()+"  ";
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
	public ResultSet pesquisarSetores() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM SETORES";
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
	public ResultSet pesquisarSetor(int id) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM SETORES WHERE ID = "+id+"  ";
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
	public ResultSet pesquisarSetor(String chave) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM SETORES WHERE SET_CHAVE = "+chave+"  ";
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
