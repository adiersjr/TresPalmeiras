package br.com.xkinfo.cadastro.service;

import java.util.ArrayList;

import br.com.xkinfo.cadastro.model.Atividade;
import br.com.xkinfo.cadastro.model.GrupoAtividade;

public interface IAtividadeService {
	
	public void incluirAtividade(String descricao, String grupoAneel, int numero, String epe, GrupoAtividade grupoAtividade) throws Exception;
	
	public void alterarAtividade(String id, String descricao, String grupoAneel, int numero, String epe, GrupoAtividade grupoAtividade) throws Exception;
	
	public void excluirAtividade(String id) throws Exception;
	
	public ArrayList<Atividade> pesquisarAtividades() throws Exception;
	
	public Atividade pesquisarAtividade(String id) throws Exception;

}
