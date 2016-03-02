package br.com.xkinfo.service.impl;

import java.util.ArrayList;

import br.com.xkinfo.model.Estado;
import br.com.xkinfo.model.MunicipioIbge;
import br.com.xkinfo.service.IMunicipioIbgeService;

public class MunicipioIbgeService implements IMunicipioIbgeService{

	@Override
	public void incluirMunicipio(String situacao, String nome, String observacao, char amazonia, char fronteira,
			char capital, Estado estado, String anoInstalacao, String anoExtincao, String sucessor, Float latitude,
			Float longitude, Float altitude, Float area) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarMunicipio(int id, String situacao, String nome, String observacao, char amazonia, char fronteira,
			char capital, Estado estado, String anoInstalacao, String anoExtincao, String sucessor, Float latitude,
			Float longitude, Float altitude, Float area) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirMunicipio(int id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<MunicipioIbge> pesquisaMunicipios() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MunicipioIbge pesquisaMunicipio(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
