package br.com.xkinfo.cadastro.service;

import java.util.ArrayList;
import java.util.Calendar;
import br.com.xkinfo.cadastro.model.Cadastro;
import br.com.xkinfo.cadastro.model.Contribuicao;
import br.com.xkinfo.cadastro.model.Taxa;

public interface IContribuicaoService {
	
	public void incluirContribuicao(Cadastro cadastro, Double valor, Calendar data, Taxa taxa) throws Exception;
	
	public void alterarContribuicao(int id, Cadastro cadastro, Double valor, Calendar data, Taxa taxa) throws Exception;
	
	public void excluirContribuicao(int id) throws Exception;
	
	public ArrayList<Contribuicao> pesquisarContribuicoes() throws Exception;
	
	public Contribuicao pesquisarContribuicao(int id) throws Exception;

}
