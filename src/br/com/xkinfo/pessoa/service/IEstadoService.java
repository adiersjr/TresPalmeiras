package br.com.xkinfo.pessoa.service;

import java.util.ArrayList;

import br.com.xkinfo.pessoa.model.Estado;
import br.com.xkinfo.pessoa.model.Pais;

public interface IEstadoService {
	
	public void incluirEstado(String nome,String sigla, Pais pais, String codigoIbge) throws Exception;

	public void alterarEstado(int id, String nome,String sigla, Pais pais, String codigoIbge) throws Exception;

	public void excluirEstado(int id) throws Exception;

	public ArrayList<Estado> pesquisaEstados() throws Exception;

	public ArrayList<Estado> pesquisaNome(String nome) throws Exception;
	
	public Estado pesquisaSigla(String sigla) throws Exception;
	
	public ArrayList<Estado> pesquisaPais(Pais pais) throws Exception;

	public Estado pesquisaEstado(int id) throws Exception;

}
