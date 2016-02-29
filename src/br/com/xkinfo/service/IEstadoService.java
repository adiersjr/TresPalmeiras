package br.com.xkinfo.service;

import java.util.ArrayList;
import br.com.xkinfo.model.Estado;
import br.com.xkinfo.model.Pais;

public interface IEstadoService {
	
	public void incluirEstado(String nome,String sigla, Pais pais, String codigoIbge) throws Exception;

	public void alterarEstado(int id, String nome,String sigla, Pais pais, String codigoIbge) throws Exception;

	public void excluirEstado(int id) throws Exception;

	public ArrayList<Estado> pesquisaEstados() throws Exception;

	public ArrayList<Estado> pesquisaNome(String nome) throws Exception;
	
	public ArrayList<Estado> pesquisaSigla(String sigla) throws Exception;
	
	public ArrayList<Estado> pesquisaPais(Pais pais) throws Exception;

	public Estado pesquisaEstado(int id) throws Exception;

}
