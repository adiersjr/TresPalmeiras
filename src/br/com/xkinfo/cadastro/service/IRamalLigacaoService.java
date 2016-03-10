package br.com.xkinfo.cadastro.service;

import java.util.ArrayList;

import br.com.xkinfo.cadastro.model.RamalLigacao;

public interface IRamalLigacaoService {
	
	public void incluirRamalLigacao(String descricao) throws Exception;
	
	public void alterarRamalLigacao(int id, String descricao) throws Exception;
	
	public void excluirRamalLigacao(int id) throws Exception;
	
	public ArrayList<RamalLigacao> pesquisarRamalLigacoes() throws Exception;
	
	public RamalLigacao pesquisarRamalLigacao(int id) throws Exception;

}
