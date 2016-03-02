package br.com.xkinfo.dao;

import java.sql.ResultSet;

import br.com.xkinfo.model.MunicipioIbge;

public interface IMunicipioIbgeDao {
	
	public int incluirMunicipioIbge(MunicipioIbge municipio) throws Exception;

	public int alterarMunicipioIbge(MunicipioIbge municipio) throws Exception;

	public int excluirMunicipioIbge(MunicipioIbge municipio) throws Exception;

	public ResultSet pesquisaMunicipiosIbge() throws Exception;

}
