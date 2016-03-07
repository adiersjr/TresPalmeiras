package br.com.xkinfo.arrecadacao.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.xkinfo.arrecadacao.dao.IBancoDao;
import br.com.xkinfo.arrecadacao.model.Banco;
import br.com.xkinfo.service.ServiceFactory;
import br.com.xkinfo.util.Conexao;

public class BancoDao implements IBancoDao{

	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirBanco(Banco banco) throws Exception {
		int result = -1;
		String query = "INSERT INTO BANCOS (BAN_NUMERO, BAN_FONE, BAN_NOME, BAN_INICIAIS, BAN_CONVENIO, BAN_TARIFAS_F, BAN_CCCREDITO, "
				+ " BAN_CONVENIOG, BAN_TARIFA_G, BAN_NSR, BAN_DIASG, BAN_DIASF, BAN_DEBITO) "
				+ " VALUES ('"+banco.getNumero()+"', '"+banco.getTelefone()+"', '"+banco.getNome()+"', '"+banco.getInicial()+"', '"+banco.getConvenio()+"', "
				+ " "+banco.getTarifaF()+", '"+banco.getCcCredito()+"', '"+banco.getConvenioG()+"', "+banco.getTarifaG()+", "+banco.getNsr()+", "
				+ " "+banco.getDiasG()+", "+banco.getDiasF()+", "+ServiceFactory.getApoioservice().converteBoolean(banco.isDebito())+") ";
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
	public int alterarBanco(Banco banco) throws Exception {
		int result = -1;
		String query = "UPDATE BANCOS SET BAN_NUMERO = '"+banco.getNumero()+"', BAN_FONE = '"+banco.getTelefone()+"', BAN_NOME = '"+banco.getNome()+"', "
				+ " BAN_INICIAIS = '"+banco.getInicial()+"', BAN_CONVENIO = '"+banco.getConvenio()+"', BAN_TARIFAS_F = "+banco.getTarifaF()+", "
				+ " BAN_CCCREDITO = '"+banco.getCcCredito()+"', BAN_CONVENIOG = '"+banco.getConvenioG()+"', BAN_TARIFA_G = "+banco.getTarifaG()+", "
				+ " BAN_NSR = "+banco.getNsr()+", BAN_DIASG = "+banco.getDiasG()+", BAN_DIASF = "+banco.getDiasF()+", "
				+ " BAN_DEBITO = "+ServiceFactory.getApoioservice().converteBoolean(banco.isDebito())+" WHERE BAN_CODIGO = "+banco.getId()+" )";
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
	public int excluirBanco(Banco banco) throws Exception {
		int result = -1;
		String query = "DELETE FROM BANCOS WHERE BAN_CODIGO = "+banco.getId()+" )";
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
	public ResultSet pesquisaBancos() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM BANCOS";
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
	public ResultSet pesquisaBanco(int id) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM BANCOS WHERE BAN_CODIGO = "+id+" )";
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
	public ResultSet pesquisaBanco(String numero) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM BANCOS WHERE BAN_NUMERO = '"+numero+"' )";
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
