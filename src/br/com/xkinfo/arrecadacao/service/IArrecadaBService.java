package br.com.xkinfo.arrecadacao.service;

import java.util.ArrayList;
import java.util.Calendar;

import br.com.xkinfo.arrecadacao.model.Agencia;
import br.com.xkinfo.arrecadacao.model.ArrecadaB;
import br.com.xkinfo.cadastro.model.Cadastro;

public interface IArrecadaBService {

	public int incluirArrecadaB(Cadastro cadastro, Agencia agencia, String contaCorrente, Calendar dataAlteracao,
			int nsr, int codigoMovimentacao) throws Exception;
	
	public ArrayList<ArrecadaB> pesquisaArrecadaBs() throws Exception;
	
	public ArrayList<ArrecadaB> pesquisaArrecadaBs(Agencia agencia) throws Exception;

	public ArrecadaB pesquisaArrecadaB(int id) throws Exception;
	
	public ArrecadaB pesquisaArrecadaB(Cadastro cadastro) throws Exception;
}
