package br.com.xkinfo.cadastro.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import br.com.xkinfo.cadastro.model.Cadastro;
import br.com.xkinfo.cadastro.model.Contribuicao;
import br.com.xkinfo.cadastro.model.Taxa;
import br.com.xkinfo.cadastro.service.IContribuicaoService;

public class ContribuicaoService implements IContribuicaoService{

	@Override
	public void incluirContribuicao(Cadastro cadastro, Double valor, Calendar data, Taxa taxa) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarContribuicao(int id, Cadastro cadastro, Double valor, Calendar data, Taxa taxa)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirContribuicao(int id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Contribuicao> pesquisarContribuicoes() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contribuicao pesquisarContribuicao(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
