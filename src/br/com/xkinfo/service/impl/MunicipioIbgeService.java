package br.com.xkinfo.service.impl;

import java.util.ArrayList;

import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.model.Estado;
import br.com.xkinfo.model.MunicipioIbge;
import br.com.xkinfo.service.IMunicipioIbgeService;

public class MunicipioIbgeService implements IMunicipioIbgeService{
	
	MunicipioIbge municipio;

	@Override
	public void incluirMunicipio(String situacao, String nome, String observacao, char amazonia, char fronteira,
			char capital, Estado estado, String anoInstalacao, String anoExtincao, String sucessor, Float latitude,
			Float longitude, Float altitude, Float area) throws Exception {

		municipio = new MunicipioIbge();
		municipio.setSituacao(situacao);
		municipio.setNome(nome);
		municipio.setObservacao(observacao);
		municipio.setAmazonia(amazonia);
		municipio.setFronteira(fronteira);
		municipio.setCapital(capital);
		municipio.setEstado(estado);
		municipio.setAnoInstalacao(anoInstalacao);
		municipio.setAnoExtincao(anoExtincao);
		municipio.setSucessor(sucessor);
		municipio.setLatitude(latitude);
		municipio.setLongitude(longitude);
		municipio.setAltitude(altitude);
		municipio.setArea(area);
		int ret = DaoFactory.getMunicipiodao().incluirMunicipio(municipio);
		if (ret == 1){
			System.out.println("Inclusão efetuada com Sucesso!");
		}
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
