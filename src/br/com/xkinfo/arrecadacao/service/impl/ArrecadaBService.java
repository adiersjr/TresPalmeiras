package br.com.xkinfo.arrecadacao.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;

import br.com.xkinfo.arrecadacao.model.Agencia;
import br.com.xkinfo.arrecadacao.model.ArrecadaB;
import br.com.xkinfo.arrecadacao.service.IArrecadaBService;
import br.com.xkinfo.cadastro.model.Cadastro;
import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.service.ServiceFactory;

public class ArrecadaBService implements IArrecadaBService{

	ArrecadaB arrecadaB;
	@Override
	public int incluirArrecadaB(Cadastro cadastro, Agencia agencia, String contaCorrente, Calendar dataAlteracao,
			int nsr, int codigoMovimentacao) throws Exception {
		arrecadaB = new ArrecadaB();
		arrecadaB.setCadastro(cadastro);
		arrecadaB.setAgencia(agencia);
		arrecadaB.setContaCorrente(contaCorrente);
		arrecadaB.setDataAlteracao(dataAlteracao);
		arrecadaB.setNsr(nsr);
		arrecadaB.setCodigoMovimentacao(codigoMovimentacao);
		int ret = DaoFactory.getArrecadaBDao().incluirArrecadaB(arrecadaB);
		return ret;
	}

	@Override
	public ArrayList<ArrecadaB> pesquisaArrecadaBs() throws Exception {
		ResultSet rs = DaoFactory.getArrecadaBDao().pesquisaArrecadaBs();
		ArrayList<ArrecadaB> arrecadaBs = new ArrayList<>();
		while(rs.next()){
			arrecadaB = new ArrecadaB();
			arrecadaB.setId(rs.getInt("ARB_NUMERO"));
			arrecadaB.setCadastro(ServiceFactory.getCadastroservice().pesquisarCadastro(rs.getString("CAD_CHAVE")));
			arrecadaB.setAgencia(ServiceFactory.getAgenciaservice().pesquisaAgencia(rs.getString("AGE_CHAVE")));
			arrecadaB.setContaCorrente(rs.getString("ARB_CC"));
			arrecadaB.setDataAlteracao(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("ARB_DTAALTERACAO")));
			arrecadaB.setNsr(rs.getInt("ARB_NSR"));
			arrecadaB.setCodigoMovimentacao(rs.getInt("ARB_CODMOV"));
			arrecadaBs.add(arrecadaB);
		}
		return arrecadaBs;
	}

	@Override
	public ArrayList<ArrecadaB> pesquisaArrecadaBs(Agencia agencia) throws Exception {
		ResultSet rs = DaoFactory.getArrecadaBDao().pesquisaArrecadaBs(agencia);
		ArrayList<ArrecadaB> arrecadaBs = new ArrayList<>();
		while(rs.next()){
			arrecadaB = new ArrecadaB();
			arrecadaB.setId(rs.getInt("ARB_NUMERO"));
			arrecadaB.setCadastro(ServiceFactory.getCadastroservice().pesquisarCadastro(rs.getString("CAD_CHAVE")));
			arrecadaB.setAgencia(ServiceFactory.getAgenciaservice().pesquisaAgencia(rs.getString("AGE_CHAVE")));
			arrecadaB.setContaCorrente(rs.getString("ARB_CC"));
			arrecadaB.setDataAlteracao(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("ARB_DTAALTERACAO")));
			arrecadaB.setNsr(rs.getInt("ARB_NSR"));
			arrecadaB.setCodigoMovimentacao(rs.getInt("ARB_CODMOV"));
			arrecadaBs.add(arrecadaB);
		}
		return arrecadaBs;
	}

	@Override
	public ArrecadaB pesquisaArrecadaB(int id) throws Exception {
		ResultSet rs = DaoFactory.getArrecadaBDao().pesquisaArrecadaB(id);
		arrecadaB = new ArrecadaB();
		while(rs.next()){
			arrecadaB.setId(rs.getInt("ARB_NUMERO"));
			arrecadaB.setCadastro(ServiceFactory.getCadastroservice().pesquisarCadastro(rs.getString("CAD_CHAVE")));
			arrecadaB.setAgencia(ServiceFactory.getAgenciaservice().pesquisaAgencia(rs.getString("AGE_CHAVE")));
			arrecadaB.setContaCorrente(rs.getString("ARB_CC"));
			arrecadaB.setDataAlteracao(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("ARB_DTAALTERACAO")));
			arrecadaB.setNsr(rs.getInt("ARB_NSR"));
			arrecadaB.setCodigoMovimentacao(rs.getInt("ARB_CODMOV"));
		}
		return arrecadaB;
	}

	@Override
	public ArrecadaB pesquisaArrecadaB(Cadastro cadastro) throws Exception {
		ResultSet rs = DaoFactory.getArrecadaBDao().pesquisaArrecadaB(cadastro);
		arrecadaB = new ArrecadaB();
		while(rs.next()){
			arrecadaB.setId(rs.getInt("ARB_NUMERO"));
			arrecadaB.setCadastro(ServiceFactory.getCadastroservice().pesquisarCadastro(rs.getString("CAD_CHAVE")));
			arrecadaB.setAgencia(ServiceFactory.getAgenciaservice().pesquisaAgencia(rs.getString("AGE_CHAVE")));
			arrecadaB.setContaCorrente(rs.getString("ARB_CC"));
			arrecadaB.setDataAlteracao(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("ARB_DTAALTERACAO")));
			arrecadaB.setNsr(rs.getInt("ARB_NSR"));
			arrecadaB.setCodigoMovimentacao(rs.getInt("ARB_CODMOV"));
		}
		return arrecadaB;
	}

}
