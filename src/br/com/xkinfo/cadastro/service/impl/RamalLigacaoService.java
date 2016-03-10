package br.com.xkinfo.cadastro.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.xkinfo.cadastro.model.RamalLigacao;
import br.com.xkinfo.cadastro.service.IRamalLigacaoService;
import br.com.xkinfo.dao.DaoFactory;

public class RamalLigacaoService implements IRamalLigacaoService{
	
	RamalLigacao ramalLigacao;

	@Override
	public void incluirRamalLigacao(String descricao) throws Exception {
		ramalLigacao = new RamalLigacao();
		ramalLigacao.setDescricao(descricao);
		DaoFactory.getRamalligacaodao().incluirRamalLigacao(ramalLigacao);
	}

	@Override
	public void alterarRamalLigacao(int id, String descricao) throws Exception {
		ramalLigacao = new RamalLigacao();
		ramalLigacao.setId(id);
		ramalLigacao.setDescricao(descricao);
		DaoFactory.getRamalligacaodao().alterarRamalLigacao(ramalLigacao);
	}

	@Override
	public void excluirRamalLigacao(int id) throws Exception {
		ramalLigacao = pesquisarRamalLigacao(id);
		DaoFactory.getRamalligacaodao().excluirRamalLigacao(ramalLigacao);
	}

	@Override
	public ArrayList<RamalLigacao> pesquisarRamalLigacoes() throws Exception {
		ResultSet rs = DaoFactory.getRamalligacaodao().pesquisarRamalLigacoes();
		ArrayList<RamalLigacao> ramalLigacoes = new ArrayList<>();
		while(rs.next()){
			ramalLigacao = new RamalLigacao();
			ramalLigacao.setId(rs.getInt("RAM_NUMERO"));
			ramalLigacao.setDescricao(rs.getString("RAM_DESCRICAO"));
			ramalLigacoes.add(ramalLigacao);
		}
		return ramalLigacoes;
	}

	@Override
	public RamalLigacao pesquisarRamalLigacao(int id) throws Exception {
		ResultSet rs = DaoFactory.getRamalligacaodao().pesquisarRamalLigacao(id);
		ramalLigacao = new RamalLigacao();
		while(rs.next()){
			ramalLigacao.setId(rs.getInt("RAM_NUMERO"));
			ramalLigacao.setDescricao(rs.getString("RAM_DESCRICAO"));
		}
		return ramalLigacao;
	}

}
