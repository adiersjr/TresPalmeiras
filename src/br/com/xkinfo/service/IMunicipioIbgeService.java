package br.com.xkinfo.service;

import java.util.ArrayList;
import br.com.xkinfo.model.Estado;
import br.com.xkinfo.model.MunicipioIbge;

public interface IMunicipioIbgeService {

	public void incluirMunicipio(String situacao, String nome, String observacao, char amazonia, char fronteira, char capital, Estado estado, 
			String anoInstalacao, String anoExtincao, String sucessor, Double latitude, Double longitude, Double altitude, Double area) throws Exception;

	public void alterarMunicipio(int id, String situacao, String nome, String observacao, char amazonia, char fronteira, char capital, Estado estado, 
			String anoInstalacao, String anoExtincao, String sucessor, Double latitude, Double longitude, Double altitude, Double area) throws Exception;

	public void excluirMunicipio(int id) throws Exception;

	public ArrayList<MunicipioIbge> pesquisaMunicipios() throws Exception;

	public MunicipioIbge pesquisaMunicipio(int id) throws Exception;

}
