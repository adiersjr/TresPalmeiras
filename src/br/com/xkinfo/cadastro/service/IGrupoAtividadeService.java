package br.com.xkinfo.cadastro.service;

import java.util.ArrayList;
import br.com.xkinfo.cadastro.model.GrupoAtividade;

public interface IGrupoAtividadeService {
	
	public void incluirGrupoAtividade(String descricao) throws Exception;
	
	public void alterarGrupoAtividade(int id, String descricao) throws Exception;
	
	public void excluirGrupoAtividade(int id) throws Exception;
	
	public ArrayList<GrupoAtividade> pesquisarGrupoAtividades() throws Exception;
	
	public GrupoAtividade pesquisarGrupoAtividade(int id) throws Exception;

}
