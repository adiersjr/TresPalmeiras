package br.com.xkinfo.endereco.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.xkinfo.endereco.dao.IBairroDao;
import br.com.xkinfo.endereco.model.Bairro;
import br.com.xkinfo.util.Conexao;

public class BairroDao implements IBairroDao{
	
	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirBairro(Bairro bairro) throws Exception {
		int result = -1;
		String query = "INSERT INTO BAIRROS (BAI_NOME) "
				+ " VALUES ('"+bairro.getNome()+"') ";
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
	public int alterarBairro(Bairro bairro) throws Exception {
		int result = -1;
		String query = "UPDATE BAIRROS SET BAI_NOME = '"+bairro.getNome()+"' "
				+ " WHERE BAI_NUMERO = "+bairro.getId()+"  ";
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
	public int excluirBairro(Bairro bairro) throws Exception {
		int result = -1;
		String query = "DELETE FROM BAIRROS WHERE BAI_NUMERO = "+bairro.getId()+"  ";
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
	public ResultSet pesquisarBairros() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM BAIRROS";
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
	public ResultSet pesquisarBairro(int id) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM BAIRROS WHERE BAI_NUMERO = "+id+"  ";
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
