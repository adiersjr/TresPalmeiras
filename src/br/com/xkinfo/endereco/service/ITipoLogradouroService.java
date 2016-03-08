package br.com.xkinfo.endereco.service;

import java.util.ArrayList;

import br.com.xkinfo.endereco.model.TipoLogradouro;

public interface ITipoLogradouroService {
	
	public void incluirTipoLogradouro(String descricao) throws Exception;
	
	public void alterarTipoLogradouro(int id, String descricao) throws Exception;
	
	public void excluitTipoLogradouro(int id) throws Exception;
	
	public ArrayList<TipoLogradouro> pesquisarTipoLogradouros() throws Exception;
	
	public TipoLogradouro pesquisarTipoLogradouro(int id) throws Exception;

}
