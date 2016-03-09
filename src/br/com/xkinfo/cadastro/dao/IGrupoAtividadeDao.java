package br.com.xkinfo.cadastro.dao;

import java.sql.ResultSet;
import br.com.xkinfo.cadastro.model.GrupoAtividade;

public interface IGrupoAtividadeDao {
	
	public int incluirGrupoAtividade(GrupoAtividade grupoAtividade) throws Exception;
	
	public int alterarGrupoAtividade(GrupoAtividade grupoAtividade) throws Exception;
	
	public int excluirGrupoAtividade(GrupoAtividade grupoAtividade) throws Exception;
	
	public ResultSet pesquisarGrupoAtividades() throws Exception;
	
	public ResultSet pesquisarGrupoAtividade(int id) throws Exception;

}
