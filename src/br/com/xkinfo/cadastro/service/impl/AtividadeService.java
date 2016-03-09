package br.com.xkinfo.cadastro.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.xkinfo.cadastro.model.Atividade;
import br.com.xkinfo.cadastro.model.GrupoAtividade;
import br.com.xkinfo.cadastro.service.IAtividadeService;
import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.service.ServiceFactory;

public class AtividadeService implements IAtividadeService {
	
	Atividade atividade;

	@Override
	public void incluirAtividade(String descricao, String grupoAneel, int numero, String epe,
			GrupoAtividade grupoAtividade) throws Exception {
		atividade = new Atividade();
		atividade.setDescricao(descricao);
		atividade.setGrupoAneel(grupoAneel);
		atividade.setNumero(numero);
		atividade.setEpe(epe);
		atividade.setGrupoAtividade(grupoAtividade);
		DaoFactory.getAtividadedao().incluirAtividade(atividade);
	}

	@Override
	public void alterarAtividade(int id, String descricao, String grupoAneel, int numero, String epe,
			GrupoAtividade grupoAtividade) throws Exception {
		atividade = new Atividade();
		atividade.setId(id);
		atividade.setDescricao(descricao);
		atividade.setGrupoAneel(grupoAneel);
		atividade.setNumero(numero);
		atividade.setEpe(epe);
		atividade.setGrupoAtividade(grupoAtividade);
		DaoFactory.getAtividadedao().alterarAtividade(atividade);
	}

	@Override
	public void excluirAtividade(int id) throws Exception {
		atividade = pesquisarAtividade(id);
		DaoFactory.getAtividadedao().excluirAtividade(atividade);
	}

	@Override
	public ArrayList<Atividade> pesquisarAtividades() throws Exception {
		ResultSet rs = DaoFactory.getAtividadedao().pesquisarAtividades();
		ArrayList<Atividade> atividades = new ArrayList<>();
		while(rs.next()){
			atividade = new Atividade();
			atividade.setId(rs.getInt("ATV_CODIGO"));
			atividade.setDescricao(rs.getString("ATV_DESCRICAO"));
			atividade.setGrupoAneel(rs.getString("ATV_GRUPOANEEL"));
			atividade.setNumero(rs.getInt("ATV_NUMERO"));
			atividade.setEpe(rs.getString("ATV_EPE"));
			atividade.setGrupoAtividade(ServiceFactory.getGrupoatividadeservice().pesquisarGrupoAtividade(rs.getInt("GRA_CODIGO")));
			atividades.add(atividade);
		}
		return atividades;
	}

	@Override
	public Atividade pesquisarAtividade(int id) throws Exception {
		ResultSet rs = DaoFactory.getAtividadedao().pesquisarAtividades();
		atividade = new Atividade();
		while(rs.next()){
			atividade.setId(rs.getInt("ATV_CODIGO"));
			atividade.setDescricao(rs.getString("ATV_DESCRICAO"));
			atividade.setGrupoAneel(rs.getString("ATV_GRUPOANEEL"));
			atividade.setNumero(rs.getInt("ATV_NUMERO"));
			atividade.setEpe(rs.getString("ATV_EPE"));
			atividade.setGrupoAtividade(ServiceFactory.getGrupoatividadeservice().pesquisarGrupoAtividade(rs.getInt("GRA_CODIGO")));
		}
		return atividade;
	}


}
