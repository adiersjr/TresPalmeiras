package br.com.xkinfo.endereco.dao;

import java.sql.ResultSet;
import br.com.xkinfo.endereco.model.TipoLogradouro;

public interface ITipoLogradouroDao {
	
	public int incluirTipoLogradouro(TipoLogradouro tipoLogradouro) throws Exception;
	
	public int alterarTipoLogradouro(TipoLogradouro tipoLogradouro) throws Exception;
	
	public int excluitTipoLogradouro(TipoLogradouro tipoLogradouro) throws Exception;
	
	public ResultSet pesquisarTipoLogradouros() throws Exception;
	
	public ResultSet pesquisarTipoLogradouro(int id) throws Exception;

}
