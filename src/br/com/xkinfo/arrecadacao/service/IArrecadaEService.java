package br.com.xkinfo.arrecadacao.service;

import java.util.ArrayList;
import java.util.Calendar;

import br.com.xkinfo.arrecadacao.model.Agencia;
import br.com.xkinfo.arrecadacao.model.ArrecadaE;
import br.com.xkinfo.arrecadacao.model.Banco;
import br.com.xkinfo.cadastro.model.Cadastro;


public interface IArrecadaEService {

	
	public int incluirArrecadaE(int nsr, Cadastro cadastro, Agencia agencia,Banco banco, int codigoMovimentacao, String contaCorrente, Calendar dataAlteracao) throws Exception;
	
	public ArrayList<ArrecadaE> pesquisaArrecadaEs() throws Exception;
	
	public ArrayList<ArrecadaE> pesquisaArrecadaEs(Banco banco) throws Exception;

	public ArrecadaE pesquisaArrecadaE(int nsr) throws Exception;
	
	public ArrecadaE pesquisaArrecadaE(Cadastro cadastro) throws Exception;
}
