package br.com.xkinfo.arrecadacao.dao;

import java.util.ArrayList;

import br.com.xkinfo.arrecadacao.model.Agencia;

public interface IAgenciaDao {
	
	public int incluirAgencia(Agencia agencia) throws Exception;
	
	public int alterarAgencia(Agencia agencia) throws Exception;
	
	public int excluirAgencia(Agencia agencia) throws Exception;

	public ArrayList<Agencia> pesquisaAgencias() throws Exception;

	public Agencia pesquisaAgencia(int id) throws Exception;

}
