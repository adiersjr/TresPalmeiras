package br.com.xkinfo.cadastro.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.xkinfo.cadastro.dao.IConjuntoDao;
import br.com.xkinfo.cadastro.model.Conjunto;
import br.com.xkinfo.service.ServiceFactory;
import br.com.xkinfo.util.Conexao;

public class ConjuntoDao implements IConjuntoDao{

	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirConjunto(Conjunto conjunto) throws Exception {
		int result = -1;
		String query = "INSERT INTO CONJUNTO (CON_DESC, CON_METADIC, CON_METAFIC, CON_METADEC, CON_METAFEC, "
				+ " CON_LOCALATINGE, CON_ATIVO) "
				+ " VALUES ('"+conjunto.getDescricao()+"', "+conjunto.getMetaDic()+", "+conjunto.getMetaFic()+", "
				+ " "+conjunto.getMetaDec()+", "+conjunto.getMetaFec()+", '"+conjunto.getLocalAtinge()+"', "
				+ " "+ServiceFactory.getApoioservice().converteBoolean(conjunto.isAtivo())+" ) ";
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
	public int alterarConjunto(Conjunto conjunto) throws Exception {
		int result = -1;
		String query = "UPDATE CONJUNTO SET CON_DESC = '"+conjunto.getDescricao()+"', CON_METADIC = "+conjunto.getMetaDic()+", "
				+ " CON_METAFIC = "+conjunto.getMetaFic()+", CON_METADEC = "+conjunto.getMetaDec()+", CON_METAFEC = "+conjunto.getMetaFec()+", "
				+ " CON_LOCALATINGE = '"+conjunto.getLocalAtinge()+"', "
				+ " CON_ATIVO = "+ServiceFactory.getApoioservice().converteBoolean(conjunto.isAtivo())+" WHERE CON_NUMERO = '"+conjunto.getNumero()+"') ";
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
	public int excluirConjunto(Conjunto conjunto) throws Exception {
		int result = -1;
		String query = "DELETE FROM CONJUNTO WHERE CON_NUMERO = '"+conjunto.getNumero()+"') ";
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
	public ResultSet pesquisarConjuntos() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM CONJUNTO";
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
	public ResultSet pesquisarConjunto(String numero) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM CONJUNTO WHERE CON_NUMERO = '"+numero+"') ";
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
