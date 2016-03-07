package br.com.xkinfo.arrecadacao.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.xkinfo.arrecadacao.model.Banco;
import br.com.xkinfo.arrecadacao.service.IBancoService;
import br.com.xkinfo.dao.DaoFactory;

public class BancoService implements IBancoService {
	
	Banco banco;

	@Override
	public int incluirBanco(String numero, String telefone, String nome, String inicial, String convenio,
			Double tarifaF, String ccCredito, String convenioG, Double tarifaG, int nsr, int diasG, int diasF,
			boolean debito) throws Exception {
		banco = new Banco();
		banco.setNumero(numero);
		banco.setTelefone(telefone);
		banco.setNome(nome);
		banco.setInicial(inicial);
		banco.setConvenio(convenio);
		banco.setTarifaF(tarifaF);
		banco.setCcCredito(ccCredito);
		banco.setConvenioG(convenioG);
		banco.setTarifaG(tarifaG);
		banco.setNsr(nsr);
		banco.setDiasG(diasG);
		banco.setDiasF(diasF);
		banco.setDebito(debito);
		
		return DaoFactory.getBancodao().incluirBanco(banco);
	}

	@Override
	public int alterarBanco(int id, String numero, String telefone, String nome, String inicial, String convenio,
			Double tarifaF, String ccCredito, String convenioG, Double tarifaG, int nsr, int diasG, int diasF,
			boolean debito) throws Exception {
		banco = new Banco();
		banco.setId(id);
		banco.setNumero(numero);
		banco.setTelefone(telefone);
		banco.setNome(nome);
		banco.setInicial(inicial);
		banco.setConvenio(convenio);
		banco.setTarifaF(tarifaF);
		banco.setCcCredito(ccCredito);
		banco.setConvenioG(convenioG);
		banco.setTarifaG(tarifaG);
		banco.setNsr(nsr);
		banco.setDiasG(diasG);
		banco.setDiasF(diasF);
		banco.setDebito(debito);
		
		return DaoFactory.getBancodao().alterarBanco(banco);
	}

	@Override
	public int excluirBanco(int id) throws Exception {
		banco = pesquisaBanco(id);
		return DaoFactory.getBancodao().excluirBanco(banco);
	}

	@Override
	public ArrayList<Banco> pesquisaBancos() throws Exception {
		ResultSet rs = DaoFactory.getBancodao().pesquisaBancos();
		ArrayList<Banco> bancos = new ArrayList<>();
		while(rs.next()){
			banco = new Banco();
			banco.setId(rs.getInt("BAN_CODIGO"));
			banco.setNumero(rs.getString("BAN_NUMERO"));
			banco.setTelefone(rs.getString("BAN_FONE"));
			banco.setNome(rs.getString("BAN_NOME"));
			banco.setInicial(rs.getString("BAN_INICIAIS"));
			banco.setConvenio(rs.getString("BAN_CONVENIO"));
			banco.setTarifaF(rs.getDouble("BAN_TARIFA_F"));
			banco.setCcCredito(rs.getString("BAN_CCCREDITO"));
			banco.setConvenioG(rs.getString("BAN_CONVENIOG"));
			banco.setTarifaG(rs.getDouble("BAN_TARIFA_G"));
			banco.setNsr(rs.getInt("BAN_NSR"));
			banco.setDiasG(rs.getInt("BAN_DIASG"));
			banco.setDiasF(rs.getInt("BAN_DIASF"));
			banco.setDebito(rs.getBoolean("BAN_DEBITO"));
			bancos.add(banco);
		}
		return bancos;
	}

	@Override
	public Banco pesquisaBanco(int id) throws Exception {
		ResultSet rs = DaoFactory.getBancodao().pesquisaBancos();
		while(rs.next()){
			banco = new Banco();
			banco.setId(rs.getInt("BAN_CODIGO"));
			banco.setNumero(rs.getString("BAN_NUMERO"));
			banco.setTelefone(rs.getString("BAN_FONE"));
			banco.setNome(rs.getString("BAN_NOME"));
			banco.setInicial(rs.getString("BAN_INICIAIS"));
			banco.setConvenio(rs.getString("BAN_CONVENIO"));
			banco.setTarifaF(rs.getDouble("BAN_TARIFA_F"));
			banco.setCcCredito(rs.getString("BAN_CCCREDITO"));
			banco.setConvenioG(rs.getString("BAN_CONVENIOG"));
			banco.setTarifaG(rs.getDouble("BAN_TARIFA_G"));
			banco.setNsr(rs.getInt("BAN_NSR"));
			banco.setDiasG(rs.getInt("BAN_DIASG"));
			banco.setDiasF(rs.getInt("BAN_DIASF"));
			banco.setDebito(rs.getBoolean("BAN_DEBITO"));
		}
		return banco;
	}

}
