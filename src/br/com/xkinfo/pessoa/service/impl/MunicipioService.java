package br.com.xkinfo.pessoa.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.pessoa.model.Estado;
import br.com.xkinfo.pessoa.model.Municipio;
import br.com.xkinfo.pessoa.service.IMunicipioService;
import br.com.xkinfo.service.ServiceFactory;

public class MunicipioService implements IMunicipioService {

	Municipio municipio;

	@Override
	public void incluirMunicipio(Estado estado, String nome, String cep, String codIbge, String prodist)
			throws Exception {
		String validaNome = nome.replaceAll(" ", "");
		String validaCep = cep.replaceAll(" ", "");
		String validaCodIbge = codIbge.replaceAll(" ", "");
		String validaProdist = prodist.replaceAll(" ", "");
		String valida = "";

		if (validaNome.isEmpty()) {
			valida = "Nome \n";
		}
		if (validaCep.isEmpty()) {
			valida = valida + "Cep \n";
		}
		if (validaCodIbge.isEmpty()) {
			valida = valida + "Codigo IBGE \n";
		}
		if (validaProdist.isEmpty()){
			valida = valida + "Prodist \n";
		}
		if (valida.isEmpty()) {
			municipio = new Municipio();
			municipio.setEstado(estado);
			municipio.setNome(nome);
			municipio.setCep(cep);
			municipio.setCodigoIbge(codIbge);
			municipio.setProdist(prodist);
			int ret = DaoFactory.getMunicipiodao().incluirMunicipio(municipio);
			if (ret == 1){
				System.out.println("Inclus�o efetuada com Sucesso!");
			}
		} else {
			System.out.println("Favor preencher os seguintes campos: \n" + valida);
		}
	}

	@Override
	public void alterarMunicipio(int id, Estado estado, String nome, String cep, String codIbge, String prodist)
			throws Exception {
		String validaNome = nome.replaceAll(" ", "");
		String validaCep = cep.replaceAll(" ", "");
		String validaCodIbge = codIbge.replaceAll(" ", "");
		String validaProdist = prodist.replaceAll(" ", "");
		String valida = "";

		if (validaNome.isEmpty()) {
			valida = "Nome \n";
		}
		if (validaCep.isEmpty()) {
			valida = valida + "Cep \n";
		}
		if (validaCodIbge.isEmpty()) {
			valida = valida + "Codigo IBGE \n";
		}
		if (validaProdist.isEmpty()){
			valida = valida + "Prodist \n";
		}
		if (valida.isEmpty()) {
			municipio = new Municipio();
			municipio.setId(id);
			municipio.setEstado(estado);
			municipio.setNome(nome);
			municipio.setCep(cep);
			municipio.setCodigoIbge(codIbge);
			municipio.setProdist(prodist);
			int ret = DaoFactory.getMunicipiodao().alterarMunicipio(municipio);
			if (ret == 1){
				System.out.println("Altera��o efetuada com Sucesso!");
			}
		} else {
			System.out.println("Favor preencher os seguintes campos: \n" + valida);
		}
	}

	@Override
	public void excluirMunicipio(int id) throws Exception {
		municipio = pesquisaMunicipio(id);
		int ret = DaoFactory.getMunicipiodao().excluirMunicipio(municipio);
		if (ret == 1){
			System.out.println("Exclus�o efetuada com sucesso!");
		}
		if (ret == 0){
			System.out.println("Registro n�o existe, favor verificar!");
		}
	}

	@Override
	public ArrayList<Municipio> pesquisaMunicipios() throws Exception {
		ResultSet rs = DaoFactory.getMunicipiodao().pesquisaMunicipios();
		municipio = new Municipio();
		ArrayList<Municipio> municipios = new ArrayList<>();
		while(rs.next()){
			municipio = new Municipio();
			municipio.setId(rs.getInt("MUN_NUMERO"));
			municipio.setEstado(ServiceFactory.getEstadoservice().pesquisaSigla(rs.getString("EST_SIGLA")));
			municipio.setNome(rs.getString("MUN_NOME"));
			municipio.setCep(rs.getString("MUN_CEP"));
			municipio.setCodigoIbge(rs.getString("MUN_IBGE"));
			municipio.setProdist(rs.getString("MUN_PRODIST"));
			municipios.add(municipio);

		}
		return municipios;
	}

	@Override
	public ArrayList<Municipio> pesquisaNome(String nome) throws Exception {
		ResultSet rs = DaoFactory.getMunicipiodao().pesquisaNome(nome);
		municipio = new Municipio();
		ArrayList<Municipio> municipios = new ArrayList<>();
		while(rs.next()){
			municipio = new Municipio();
			municipio.setId(rs.getInt("MUN_NUMERO"));
			municipio.setEstado(ServiceFactory.getEstadoservice().pesquisaSigla(rs.getString("EST_SIGLA")));
			municipio.setNome(rs.getString("MUN_NOME"));
			municipio.setCep(rs.getString("MUN_CEP"));
			municipio.setCodigoIbge(rs.getString("MUN_IBGE"));
			municipio.setProdist(rs.getString("MUN_PRODIST"));
			municipios.add(municipio);

		}
		return municipios;
	}

	@Override
	public ArrayList<Municipio> pesquisaEstado(Estado estado) throws Exception {
		ResultSet rs = DaoFactory.getMunicipiodao().pesquisaEstado(estado);
		municipio = new Municipio();
		ArrayList<Municipio> municipios = new ArrayList<>();
		while(rs.next()){
			municipio = new Municipio();
			municipio.setId(rs.getInt("MUN_NUMERO"));
			municipio.setEstado(ServiceFactory.getEstadoservice().pesquisaSigla(rs.getString("EST_SIGLA")));
			municipio.setNome(rs.getString("MUN_NOME"));
			municipio.setCep(rs.getString("MUN_CEP"));
			municipio.setCodigoIbge(rs.getString("MUN_IBGE"));
			municipio.setProdist(rs.getString("MUN_PRODIST"));
			municipios.add(municipio);

		}
		return municipios;
	}

	@Override
	public Municipio pesquisaCep(String cep) throws Exception {
		ResultSet rs = DaoFactory.getMunicipiodao().pesquisaCep(cep);
		municipio = new Municipio();
		while(rs.next()){
			municipio = new Municipio();
			municipio.setId(rs.getInt("MUN_NUMERO"));
			municipio.setEstado(ServiceFactory.getEstadoservice().pesquisaSigla(rs.getString("EST_SIGLA")));
			municipio.setNome(rs.getString("MUN_NOME"));
			municipio.setCep(rs.getString("MUN_CEP"));
			municipio.setCodigoIbge(rs.getString("MUN_IBGE"));
			municipio.setProdist(rs.getString("MUN_PRODIST"));
		}
		return municipio;
	}

	@Override
	public Municipio pesquisaIbge(String codIbge) throws Exception {
		ResultSet rs = DaoFactory.getMunicipiodao().pesquisaIbge(codIbge);
		municipio = new Municipio();
		while(rs.next()){
			municipio = new Municipio();
			municipio.setId(rs.getInt("MUN_NUMERO"));
			municipio.setEstado(ServiceFactory.getEstadoservice().pesquisaSigla(rs.getString("EST_SIGLA")));
			municipio.setNome(rs.getString("MUN_NOME"));
			municipio.setCep(rs.getString("MUN_CEP"));
			municipio.setCodigoIbge(rs.getString("MUN_IBGE"));
			municipio.setProdist(rs.getString("MUN_PRODIST"));
		}
		return municipio;
	}

	@Override
	public Municipio pesquisaMunicipio(int id) throws Exception {
		ResultSet rs = DaoFactory.getMunicipiodao().pesquisaMunicipio(id);
		municipio = new Municipio();
		while(rs.next()){
			municipio = new Municipio();
			municipio.setId(rs.getInt("MUN_NUMERO"));
			municipio.setEstado(ServiceFactory.getEstadoservice().pesquisaSigla(rs.getString("EST_SIGLA")));
			municipio.setNome(rs.getString("MUN_NOME"));
			municipio.setCep(rs.getString("MUN_CEP"));
			municipio.setCodigoIbge(rs.getString("MUN_IBGE"));
			municipio.setProdist(rs.getString("MUN_PRODIST"));
		}
		return municipio;
	}

}
