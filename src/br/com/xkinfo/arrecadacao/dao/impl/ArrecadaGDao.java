package br.com.xkinfo.arrecadacao.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

import br.com.xkinfo.arrecadacao.dao.IArrecadaGDao;
import br.com.xkinfo.arrecadacao.model.ArrecadaG;
import br.com.xkinfo.arrecadacao.model.Banco;
import br.com.xkinfo.util.Conexao;

public class ArrecadaGDao implements IArrecadaGDao{

	Conexao conexao = new Conexao();
	private Statement st;
	
	@Override
	public int incluirArrecadaG(ArrecadaG arrecadaG) throws Exception {
		int result = -1;
		String query = "INSERT INTO ARRECADA_G (RET_RETORNO, ARG_VLRDIF, ARG_BANCO, ARG_NSR, ARG_AGECONTA, ARG_DTAPGTO, ARG_DTACREDITO, FAT_CODBARRAS,"
		 		+ " ARG_VLRREC, ARG_VLRTARIFA, ARG_CODAGEARR, ARG_RESERVADO, ARG_FORMAARR) VALUES (" + arrecadaG.getRetorno().getId() + ",'" + arrecadaG.getValorDiferenca() + "'," 
				+ arrecadaG.getBanco().getNumero() + "," + arrecadaG.getNsr() + ",'" + arrecadaG.getAgencia().getNumero() + "','" + arrecadaG.getDataPagamento() + "','" 
			    + arrecadaG.getDataCredito() + "','" + arrecadaG.getCodigoBarras() + "','"+ arrecadaG.getValorFatura() + "','" + arrecadaG.getValorTarifa() + "','"
			    + arrecadaG.getCodigoArrecadador() + "','" + arrecadaG.getReservado() + "','" + arrecadaG.getFormaArrecadacao() + "') ";
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
	public ResultSet pesquisaArrecadaGs() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM ARRECADA_G";
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
	public ResultSet pesquisaArrecadaGs(Banco banco) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM ARRECADA_G WHERE ARG_BANCO = '"+ banco.getNumero() +"' ";
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
	public ResultSet pesquisaArrecadaG(int nsr) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM ARRECADA_G WHERE ARG_NSR = "+ nsr +" )";
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
	public ResultSet pesquisaArrecadaG(Calendar dataCredito) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM ARRECADA_G WHERE ARG_DTACREDITO = '"+  dataCredito +"' )";
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
