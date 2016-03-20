package br.com.xkinfo.endereco.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.endereco.model.TipoLogradouro;
import br.com.xkinfo.endereco.service.ITipoLogradouroService;

public class TipoLogradouroService implements ITipoLogradouroService{
	
	TipoLogradouro tipoLogradouro;

	@Override
	public void incluirTipoLogradouro(String descricao) throws Exception {
		tipoLogradouro = new TipoLogradouro();
		tipoLogradouro.setDescricao(descricao);
		DaoFactory.getTipologradouroDao().incluirTipoLogradouro(tipoLogradouro);
	}

	@Override
	public void alterarTipoLogradouro(int id, String descricao) throws Exception {
		tipoLogradouro = new TipoLogradouro();
		tipoLogradouro.setId(id);
		tipoLogradouro.setDescricao(descricao);
		DaoFactory.getTipologradouroDao().alterarTipoLogradouro(tipoLogradouro);
	}

	@Override
	public void excluitTipoLogradouro(int id) throws Exception {
		tipoLogradouro = pesquisarTipoLogradouro(id);
		DaoFactory.getTipologradouroDao().excluitTipoLogradouro(tipoLogradouro);
	}

	@Override
	public ArrayList<TipoLogradouro> pesquisarTipoLogradouros() throws Exception {
		ResultSet rs = DaoFactory.getTipodocumentoDao().pesquisaTipoDocumentos();
		ArrayList<TipoLogradouro> tipoLogradouros = new ArrayList<>();
		while (rs.next()){
			tipoLogradouro = new TipoLogradouro();
			tipoLogradouro.setId(rs.getInt("TIP_CODIGO"));
			tipoLogradouro.setDescricao(rs.getString("TIPO_DESCRICAO"));
			tipoLogradouros.add(tipoLogradouro);
		}
		return tipoLogradouros;
	}

	@Override
	public TipoLogradouro pesquisarTipoLogradouro(int id) throws Exception {
		ResultSet rs = DaoFactory.getTipodocumentoDao().pesquisaTipoDocumentos();
		tipoLogradouro = new TipoLogradouro();
		while (rs.next()){
			tipoLogradouro.setId(rs.getInt("TIP_CODIGO"));
			tipoLogradouro.setDescricao(rs.getString("TIPO_DESCRICAO"));
		}
		return tipoLogradouro;
	}

}
