package br.com.xkinfo.cadastro.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import br.com.xkinfo.cadastro.model.Cadastro;
import br.com.xkinfo.cadastro.model.Contribuicao;
import br.com.xkinfo.cadastro.model.Taxa;
import br.com.xkinfo.cadastro.service.IContribuicaoService;
import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.service.ServiceFactory;

public class ContribuicaoService implements IContribuicaoService{

	Contribuicao contribuicao;

	@Override
	public void incluirContribuicao(Cadastro cadastro, Double valor, Calendar data, Taxa taxa) throws Exception {
		contribuicao = new Contribuicao();
		contribuicao.setCadastro(cadastro);
		contribuicao.setValor(valor);
		contribuicao.setData(data);
		contribuicao.setTaxa(taxa);
		DaoFactory.getContribuicaodao().incluirContribuicao(contribuicao);
	}

	@Override
	public void alterarContribuicao(int id, Cadastro cadastro, Double valor, Calendar data, Taxa taxa)
			throws Exception {
		contribuicao = new Contribuicao();
		contribuicao.setId(id);
		contribuicao.setCadastro(cadastro);
		contribuicao.setValor(valor);
		contribuicao.setData(data);
		contribuicao.setTaxa(taxa);
		DaoFactory.getContribuicaodao().alterarContribuicao(contribuicao);
	}

	@Override
	public void excluirContribuicao(int id) throws Exception {
		contribuicao = pesquisarContribuicao(id);
		DaoFactory.getContribuicaodao().excluirContribuicao(contribuicao);
	}

	@Override
	public ArrayList<Contribuicao> pesquisarContribuicoes() throws Exception {
		ResultSet rs = DaoFactory.getContribuicaodao().pesquisarContribuicoes();
		ArrayList<Contribuicao> contribuicoes = new ArrayList<>();
		while(rs.next()){
			contribuicao = new Contribuicao();
			contribuicao.setId(rs.getInt("CON_NUMERO"));
			contribuicao.setCadastro(ServiceFactory.getCadastroservice().pesquisarCadastro(rs.getInt("CAD_CHAVE")));
			contribuicao.setValor(rs.getDouble("CON_VALOR"));
			contribuicao.setData(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CON_DATA")));
			contribuicao.setTaxa(ServiceFactory.getTaxaservice().pesquisarTaxa(rs.getInt("TAX_CODIGO")));
			contribuicoes.add(contribuicao);
		}
		return contribuicoes;
	}

	@Override
	public Contribuicao pesquisarContribuicao(int id) throws Exception {
		ResultSet rs = DaoFactory.getContribuicaodao().pesquisarContribuicoes();
		contribuicao = new Contribuicao();
		while(rs.next()){
			contribuicao.setId(rs.getInt("CON_NUMERO"));
			contribuicao.setCadastro(ServiceFactory.getCadastroservice().pesquisarCadastro(rs.getInt("CAD_CHAVE")));
			contribuicao.setValor(rs.getDouble("CON_VALOR"));
			contribuicao.setData(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CON_DATA")));
			contribuicao.setTaxa(ServiceFactory.getTaxaservice().pesquisarTaxa(rs.getInt("TAX_CODIGO")));
		}
		return contribuicao;
	}

}
