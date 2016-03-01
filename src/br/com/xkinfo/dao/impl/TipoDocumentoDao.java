package br.com.xkinfo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.xkinfo.dao.ITipoDocumentoDao;
import br.com.xkinfo.model.TipoDocumento;
import br.com.xkinfo.util.Conexao;

public class TipoDocumentoDao implements ITipoDocumentoDao{
	
	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirTipoDocumento(TipoDocumento tipoDocumento) throws Exception {
		int result = -1;
		Integer boolPessoal = null;
		if (tipoDocumento.isPessoal() == true){
			boolPessoal = 1;
		}
		if (tipoDocumento.isPessoal() == false) {
			boolPessoal = 0;
		}
		String query = "INSERT INTO TIPODOCUMENTO (TPD_DESCRICAO, TPD_PESSOAL) "
				+ " VALUES ('"+tipoDocumento.getDescricao()+"', "+boolPessoal+" ) ";
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
	public int alterarTipoDocumento(TipoDocumento tipoDocumento) throws Exception {
		int result = -1;
		Integer boolPessoal = null;
		if (tipoDocumento.isPessoal() == true){
			boolPessoal = 1;
		}
		if (tipoDocumento.isPessoal() == false) {
			boolPessoal = 0;
		}
		String query = "UPDATE TIPODOCUMENTO SET TPD_DESCRICAO = '"+tipoDocumento.getDescricao()+"', TPD_PESSOAL = "+boolPessoal+" "
				+ " WHERE TPD_NUMERO = "+tipoDocumento.getId()+"  ";
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
	public int excluirTipoDocumento(TipoDocumento tipoDocumento) throws Exception {
		int result = -1;
		String query = "DELETE FROM TIPODOCUMENTO WHERE TPD_NUMERO = "+tipoDocumento.getId()+"  ";
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
	public ResultSet pesquisaTipoDocumentos() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM TIPODOCUMENTO";
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
	public ResultSet pesquisaDescricao(String descricao) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM TIPODOCUMENTO WHERE TPD_DESCRICAO LIKE '%"+descricao+"%' ";
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
	public ResultSet pesquisaTipoDocumento(int id) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM TIPODOCUMENTO WHERE TPD_NUMERO = "+id+" ";
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
