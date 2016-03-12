package br.com.xkinfo.endereco.dao;

import java.sql.ResultSet;

import br.com.xkinfo.endereco.model.MunicipioIbge;

public interface IMunicipioIbgeDao {
	
	public int incluirMunicipioIbge(MunicipioIbge municipio) throws Exception;

	public int alterarMunicipioIbge(MunicipioIbge municipio) throws Exception;

	public int excluirMunicipioIbge(MunicipioIbge municipio) throws Exception;

	public ResultSet pesquisaMunicipiosIbge() throws Exception;
	
	public ResultSet pesquisaMunicipioIbge(String id) throws Exception;

}
