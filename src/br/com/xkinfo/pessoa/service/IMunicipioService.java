package br.com.xkinfo.pessoa.service;

import java.util.ArrayList;

import br.com.xkinfo.endereco.model.Estado;
import br.com.xkinfo.endereco.model.Municipio;

public interface IMunicipioService {
	
	public void incluirMunicipio(Estado estado, String nome, String cep, String codIbge, String prodist) throws Exception;

	public void alterarMunicipio(int id, Estado estado, String nome, String cep, String codIbge, String prodist) throws Exception;

	public void excluirMunicipio(int id) throws Exception;

	public ArrayList<Municipio> pesquisaMunicipios() throws Exception;

	public ArrayList<Municipio> pesquisaNome(String nome) throws Exception;
	
	public ArrayList<Municipio> pesquisaEstado(Estado estado) throws Exception;
	
	public Municipio pesquisaCep(String cep) throws Exception;
	
	public Municipio pesquisaIbge(String codIbge) throws Exception;
	
	public Municipio pesquisaMunicipio(int id) throws Exception;

}
