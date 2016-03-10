package br.com.xkinfo.cadastro.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.xkinfo.cadastro.dao.IVencimentoDao;
import br.com.xkinfo.cadastro.model.Vencimento;
import br.com.xkinfo.service.ServiceFactory;
import br.com.xkinfo.util.Conexao;

public class VencimentoDao implements IVencimentoDao{

	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirVencimento(Vencimento vencimento) throws Exception {
		int result = -1;
		String query = "INSERT INTO VENCIMENTOS (SET_CHAVE, VEN_NUMERO, VEN_DIA, VEN_VIP) "
				+ " VALUES ("+vencimento.getSetor().getId()+", "+vencimento.getNumero()+", '"+vencimento.getDia()+"', "
				+ " "+ServiceFactory.getApoioservice().converteBoolean(vencimento.isVip())+") ";
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
	public int alterarVencimento(Vencimento vencimento) throws Exception {
		int result = -1;
		String query = "UPDATE VENCIMENTOS SET SET_CHAVE = "+vencimento.getSetor().getId()+", VEN_NUMERO = "+vencimento.getNumero()+", "
				+ " VEN_DIA = '"+vencimento.getDia()+"', VEN_VIP = "+ServiceFactory.getApoioservice().converteBoolean(vencimento.isVip())+" "
				+ " WHERE VEN_CODIGO = "+vencimento.getId()+" ";
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
	public int excluirVencimento(Vencimento vencimento) throws Exception {
		int result = -1;
		String query = "DELETE FROM VENCIMENTOS WHERE VEN_CODIGO = "+vencimento.getId()+" ";
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
	public ResultSet pesquisarVencimentos() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM VENCIMENTOS";
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
	public ResultSet pesquisarVencimento(int id) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM VENCIMENTOS WHERE VEN_CODIGO = "+id+" ";
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
