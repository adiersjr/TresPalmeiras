package br.com.xkinfo.arrecadacao.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.xkinfo.arrecadacao.dao.IAgenciaDao;
import br.com.xkinfo.arrecadacao.model.Agencia;
import br.com.xkinfo.service.ServiceFactory;
public class AgenciaDao implements IAgenciaDao{

	@Override
	public int incluirAgencia(Agencia agencia) throws Exception {
		int result = -1;
		String query = "INSERT INTO AGENCIAS (AGE_CHAVE, BAN_FONE, BAN_NOME, BAN_INICIAIS, BAN_CONVENIO, BAN_TARIFAS_F, BAN_CCCREDITO, "
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
	public int alterarAgencia(Agencia agencia) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int excluirAgencia(Agencia agencia) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ResultSet pesquisaAgencias() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet pesquisaAgencia(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
