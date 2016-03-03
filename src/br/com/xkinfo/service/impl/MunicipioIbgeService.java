package br.com.xkinfo.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.model.Estado;
import br.com.xkinfo.model.MunicipioIbge;
import br.com.xkinfo.service.IMunicipioIbgeService;
import br.com.xkinfo.service.ServiceFactory;

public class MunicipioIbgeService implements IMunicipioIbgeService{
	
	MunicipioIbge municipio;

	@Override
	public void incluirMunicipio(String situacao, String nome, String observacao, char amazonia, char fronteira,
			char capital, Estado estado, String anoInstalacao, String anoExtincao, String sucessor, Double latitude,
			Double longitude, Double altitude, Double area) throws Exception {

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
		int ret = DaoFactory.getMunicipioibgedao().incluirMunicipioIbge(municipio);
		if (ret == 1){
			System.out.println("Inclus�o efetuada com Sucesso!");
		}
	}

	@Override
	public void alterarMunicipio(int id, String situacao, String nome, String observacao, char amazonia, char fronteira,
			char capital, Estado estado, String anoInstalacao, String anoExtincao, String sucessor, Double latitude,
			Double longitude, Double altitude, Double area) throws Exception {
		
		municipio = new MunicipioIbge();
		municipio.setId(id);
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
		int ret = DaoFactory.getMunicipioibgedao().alterarMunicipioIbge(municipio);
		if (ret == 1){
			System.out.println("Altera��o efetuada com Sucesso!");
		}
	}

	@Override
	public void excluirMunicipio(int id) throws Exception {
		municipio = pesquisaMunicipio(id);
		DaoFactory.getMunicipioibgedao().excluirMunicipioIbge(municipio);
	}

	@Override
	public ArrayList<MunicipioIbge> pesquisaMunicipios() throws Exception {
		ResultSet rs = DaoFactory.getMunicipioibgedao().pesquisaMunicipiosIbge();
		ArrayList<MunicipioIbge> municipiosIbge = new ArrayList<>();
		while (rs.next()){
			municipio = new MunicipioIbge();
			municipio.setId(rs.getInt("MUI_CODIGO"));
			municipio.setSituacao(rs.getString("MUI_SITUACAO"));
			municipio.setNome(rs.getString("MUI_NOME"));
			municipio.setObservacao(rs.getString("MUI_OBSERVACAO"));
			String amazonia = rs.getString("MUI_AMAZONIA");
			municipio.setAmazonia(amazonia.charAt(0));
			String fronteira = rs.getString("MUI_FRONTEIRA");
			municipio.setFronteira(fronteira.charAt(0));
			String capital = rs.getString("MUI_CAPITAL");
			municipio.setCapital(capital.charAt(0));
			Estado estado = ServiceFactory.getEstadoservice().pesquisaEstado(rs.getInt("EST_CODIGO"));
			municipio.setEstado(estado);
			municipio.setAnoInstalacao(rs.getString("MUI_ANOINSTALACAO"));
			municipio.setAnoExtincao(rs.getString("MUI_ANOEXTINCAO"));
			municipio.setSucessor(rs.getString("MUI_SUCESSOR"));
			municipio.setLatitude(rs.getDouble("MUI_LATITUDE"));
			municipio.setLongitude(rs.getDouble("MUI_LONGITUDE"));
			municipio.setAltitude(rs.getDouble("MUI_ALTITUDE"));
			municipio.setArea(rs.getDouble("MUI_AREA"));
			municipiosIbge.add(municipio);
		}
		return municipiosIbge;
	}

	@Override
	public MunicipioIbge pesquisaMunicipio(int id) throws Exception {
		ResultSet rs = DaoFactory.getMunicipioibgedao().pesquisaMunicipioIbge(id);
		municipio = new MunicipioIbge();
		while (rs.next()){
			municipio = new MunicipioIbge();
			municipio.setId(rs.getInt("MUI_CODIGO"));
			municipio.setSituacao(rs.getString("MUI_SITUACAO"));
			municipio.setNome(rs.getString("MUI_NOME"));
			municipio.setObservacao(rs.getString("MUI_OBSERVACAO"));
			String amazonia = rs.getString("MUI_AMAZONIA");
			municipio.setAmazonia(amazonia.charAt(0));
			String fronteira = rs.getString("MUI_FRONTEIRA");
			municipio.setFronteira(fronteira.charAt(0));
			String capital = rs.getString("MUI_CAPITAL");
			municipio.setCapital(capital.charAt(0));
			Estado estado = ServiceFactory.getEstadoservice().pesquisaEstado(rs.getInt("EST_CODIGO"));
			municipio.setEstado(estado);
			municipio.setAnoInstalacao(rs.getString("MUI_ANOINSTALACAO"));
			municipio.setAnoExtincao(rs.getString("MUI_ANOEXTINCAO"));
			municipio.setSucessor(rs.getString("MUI_SUCESSOR"));
			municipio.setLatitude(rs.getDouble("MUI_LATITUDE"));
			municipio.setLongitude(rs.getDouble("MUI_LONGITUDE"));
			municipio.setAltitude(rs.getDouble("MUI_ALTITUDE"));
			municipio.setArea(rs.getDouble("MUI_AREA"));
		}
		return municipio;
	}

}