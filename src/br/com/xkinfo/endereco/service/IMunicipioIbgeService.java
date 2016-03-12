package br.com.xkinfo.endereco.service;

import java.util.ArrayList;

import br.com.xkinfo.endereco.model.Estado;
import br.com.xkinfo.endereco.model.MunicipioIbge;

public interface IMunicipioIbgeService {

	public void incluirMunicipio(String situacao, String nome, String observacao, char amazonia, char fronteira, char capital, Estado estado, 
			String anoInstalacao, String anoExtincao, String sucessor, Double latitude, Double longitude, Double altitude, Double area) throws Exception;

	public void alterarMunicipio(String id, String situacao, String nome, String observacao, char amazonia, char fronteira, char capital, Estado estado, 
			String anoInstalacao, String anoExtincao, String sucessor, Double latitude, Double longitude, Double altitude, Double area) throws Exception;

	public void excluirMunicipio(String id) throws Exception;

	public ArrayList<MunicipioIbge> pesquisaMunicipios() throws Exception;

	public MunicipioIbge pesquisaMunicipio(String id) throws Exception;

}
