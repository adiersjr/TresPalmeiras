package br.com.xkinfo.arrecadacao.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;

import br.com.xkinfo.arrecadacao.model.Agencia;
import br.com.xkinfo.arrecadacao.model.ArrecadaE;
import br.com.xkinfo.arrecadacao.model.Banco;
import br.com.xkinfo.arrecadacao.service.IArrecadaEService;
import br.com.xkinfo.cadastro.model.Cadastro;
import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.service.ServiceFactory;

public class ArrecadaEService implements IArrecadaEService{

	ArrecadaE arrecadaE;
	@Override
	public int incluirArrecadaE(int nsr, Cadastro cadastro, Agencia agencia,Banco banco, int codigoMovimentacao, String contaCorrente, Calendar dataAlteracao) throws Exception {
		arrecadaE = new ArrecadaE();
		arrecadaE.setNsr(nsr);
		arrecadaE.setCadastro(cadastro);
		arrecadaE.setAgencia(agencia);
		arrecadaE.setBanco(banco);
		arrecadaE.setCodigoMovimentacao(codigoMovimentacao);
		arrecadaE.setContaCorrente(contaCorrente);
		arrecadaE.setDataAlteracao(dataAlteracao);
		int ret = DaoFactory.getArrecadaEDao().incluirArrecadaE(arrecadaE);
		return ret;
	}

	@Override
	public ArrayList<ArrecadaE> pesquisaArrecadaEs() throws Exception {
		ResultSet rs = DaoFactory.getArrecadaEDao().pesquisaArrecadaEs();
		ArrayList<ArrecadaE> arrecadaEs = new ArrayList<>();
		while(rs.next()){
			arrecadaE = new ArrecadaE();
			arrecadaE.setNsr(rs.getInt("ARB_NSR"));
			arrecadaE.setCadastro(ServiceFactory.getCadastroservice().pesquisarCadastro(rs.getString("ARB_CODCLI")));
			arrecadaE.setBanco(ServiceFactory.getBancoservice().pesquisaBanco(rs.getString("BAN_NUMERO")));
			arrecadaE.setAgencia(ServiceFactory.getAgenciaservice().pesquisaAgencia(rs.getString("ARB_AGENCIA")));
			arrecadaE.setContaCorrente(rs.getString("ARB_CC"));
			arrecadaE.setDataAlteracao(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("ARB_DTAALTERACAO")));
			arrecadaE.setCodigoMovimentacao(rs.getInt("ARB_CODMOV"));
			arrecadaEs.add(arrecadaE);
		}
		return arrecadaEs;
	}

	@Override
	public ArrayList<ArrecadaE> pesquisaArrecadaEs(Banco banco) throws Exception {
		ResultSet rs = DaoFactory.getArrecadaEDao().pesquisaArrecadaEs(banco);
		ArrayList<ArrecadaE> arrecadaEs = new ArrayList<>();
		while(rs.next()){
			arrecadaE = new ArrecadaE();
			arrecadaE.setNsr(rs.getInt("ARB_NSR"));
			arrecadaE.setCadastro(ServiceFactory.getCadastroservice().pesquisarCadastro(rs.getString("ARB_CODCLI")));
			arrecadaE.setBanco(ServiceFactory.getBancoservice().pesquisaBanco(rs.getString("BAN_NUMERO")));
			arrecadaE.setAgencia(ServiceFactory.getAgenciaservice().pesquisaAgencia(rs.getString("ARB_AGENCIA")));
			arrecadaE.setContaCorrente(rs.getString("ARB_CC"));
			arrecadaE.setDataAlteracao(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("ARB_DTAALTERACAO")));
			arrecadaE.setCodigoMovimentacao(rs.getInt("ARB_CODMOV"));
			arrecadaEs.add(arrecadaE);
		}
		return arrecadaEs;
	}

	@Override
	public ArrecadaE pesquisaArrecadaE(int nsr) throws Exception {
		ResultSet rs = DaoFactory.getArrecadaEDao().pesquisaArrecadaE(nsr);
		arrecadaE = new ArrecadaE();
		while(rs.next()){
			arrecadaE = new ArrecadaE();
			arrecadaE.setNsr(rs.getInt("ARB_NSR"));
			arrecadaE.setCadastro(ServiceFactory.getCadastroservice().pesquisarCadastro(rs.getString("ARB_CODCLI")));
			arrecadaE.setBanco(ServiceFactory.getBancoservice().pesquisaBanco(rs.getString("BAN_NUMERO")));
			arrecadaE.setAgencia(ServiceFactory.getAgenciaservice().pesquisaAgencia(rs.getString("ARB_AGENCIA")));
			arrecadaE.setContaCorrente(rs.getString("ARB_CC"));
			arrecadaE.setDataAlteracao(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("ARB_DTAALTERACAO")));
			arrecadaE.setCodigoMovimentacao(rs.getInt("ARB_CODMOV"));
		}
		return arrecadaE;
	}

	@Override
	public ArrecadaE pesquisaArrecadaE(Cadastro cadastro) throws Exception {
		ResultSet rs = DaoFactory.getArrecadaEDao().pesquisaArrecadaE(cadastro);
		arrecadaE = new ArrecadaE();
		while(rs.next()){
			arrecadaE = new ArrecadaE();
			arrecadaE.setNsr(rs.getInt("ARB_NSR"));
			arrecadaE.setCadastro(ServiceFactory.getCadastroservice().pesquisarCadastro(rs.getString("ARB_CODCLI")));
			arrecadaE.setBanco(ServiceFactory.getBancoservice().pesquisaBanco(rs.getString("BAN_NUMERO")));
			arrecadaE.setAgencia(ServiceFactory.getAgenciaservice().pesquisaAgencia(rs.getString("ARB_AGENCIA")));
			arrecadaE.setContaCorrente(rs.getString("ARB_CC"));
			arrecadaE.setDataAlteracao(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("ARB_DTAALTERACAO")));
			arrecadaE.setCodigoMovimentacao(rs.getInt("ARB_CODMOV"));
		}
		return arrecadaE;
	}
}
