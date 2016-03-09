package br.com.xkinfo.cadastro.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.xkinfo.cadastro.model.GrupoAtividade;
import br.com.xkinfo.cadastro.service.IGrupoAtividadeService;
import br.com.xkinfo.dao.DaoFactory;

public class GrupoAtividadeService implements IGrupoAtividadeService{
	
	GrupoAtividade grupoAtividade;

	@Override
	public void incluirGrupoAtividade(String descricao) throws Exception {
		grupoAtividade = new GrupoAtividade();
		grupoAtividade.setDescricao(descricao);
		DaoFactory.getGrupoatividadedao().incluirGrupoAtividade(grupoAtividade);
	}

	@Override
	public void alterarGrupoAtividade(int id, String descricao) throws Exception {
		grupoAtividade = new GrupoAtividade();
		grupoAtividade.setId(id);
		grupoAtividade.setDescricao(descricao);
		DaoFactory.getGrupoatividadedao().alterarGrupoAtividade(grupoAtividade);
	}

	@Override
	public void excluirGrupoAtividade(int id) throws Exception {
		grupoAtividade = pesquisarGrupoAtividade(id);
		DaoFactory.getGrupoatividadedao().excluirGrupoAtividade(grupoAtividade);
	}

	@Override
	public ArrayList<GrupoAtividade> pesquisarGrupoAtividades() throws Exception {
		ResultSet rs = DaoFactory.getGrupoatividadedao().pesquisarGrupoAtividades();
		ArrayList<GrupoAtividade> grupos = new ArrayList<>();
		while(rs.next()){
			grupoAtividade = new GrupoAtividade();
			grupoAtividade.setId(rs.getInt("GRA_CODIGO"));
			grupoAtividade.setDescricao(rs.getString("GRA_DESCRICAO"));
			grupos.add(grupoAtividade);
		}
		return grupos;
	}

	@Override
	public GrupoAtividade pesquisarGrupoAtividade(int id) throws Exception {
		ResultSet rs = DaoFactory.getGrupoatividadedao().pesquisarGrupoAtividades();
		grupoAtividade = new GrupoAtividade();
		while(rs.next()){
			grupoAtividade.setId(rs.getInt("GRA_CODIGO"));
			grupoAtividade.setDescricao(rs.getString("GRA_DESCRICAO"));
		}
		return grupoAtividade;
	}

}
