package br.com.xkinfo.outros.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.outros.model.Eta;
import br.com.xkinfo.outros.service.IEtaService;

public class EtaService implements IEtaService{
	
	Eta eta;

	@Override
	public void incluirEta(String descricao) throws Exception {
		eta = new Eta();
		eta.setDescricao(descricao);
		DaoFactory.getEtaDao().incluirEta(eta);
	}

	@Override
	public void alterarEta(int id, String descricao) throws Exception {
		eta = new Eta();
		eta.setId(id);
		eta.setDescricao(descricao);
		DaoFactory.getEtaDao().alterarEta(eta);
	}

	@Override
	public void excluirEta(int id) throws Exception {
		eta = pesquisarEta(id);
		DaoFactory.getEtaDao().excluirEta(eta);
	}

	@Override
	public ArrayList<Eta> pesquisarEtas() throws Exception {
		ResultSet rs = DaoFactory.getEtaDao().pesquisarEtas();
		ArrayList<Eta> etas = new ArrayList<>();
		while (rs.next()){
			eta = new Eta();
			eta.setId(rs.getInt("ETA_CODIGO"));
			eta.setDescricao(rs.getString("ETA_DESCRICAO"));
			etas.add(eta);
		}
		return etas;
	}

	@Override
	public Eta pesquisarEta(int id) throws Exception {
		ResultSet rs = DaoFactory.getEtaDao().pesquisarEta(id);
		eta = new Eta();
		while (rs.next()){
			eta.setId(rs.getInt("ETA_CODIGO"));
			eta.setDescricao(rs.getString("ETA_DESCRICAO"));
		}
		return eta;
	}

}
