package br.com.xkinfo.arrecadacao.service;

import java.util.ArrayList;
import java.util.Calendar;

import br.com.xkinfo.arrecadacao.model.Agencia;
import br.com.xkinfo.arrecadacao.model.ArrecadaF;
import br.com.xkinfo.arrecadacao.model.Banco;
import br.com.xkinfo.arrecadacao.model.Retorno;
import br.com.xkinfo.cadastro.model.Cadastro;


public interface IArrecadaFService {
	
	public int incluirArrecadaF(Retorno retorno, String fatura, Cadastro cadastro, Banco banco, Agencia agencia,
			String contaCorrente, Calendar dataVencimento, Calendar dataCredito, Double valorFatura, String codigoBarras,
			int codigoMovimentacao, int nsr, Calendar dataPagamento) throws Exception;
	
	public ArrayList<ArrecadaF> pesquisaArrecadaFs() throws Exception;
	
	public ArrayList<ArrecadaF> pesquisaArrecadaFs(Banco banco) throws Exception;

	public ArrecadaF pesquisaArrecadaF(int id) throws Exception;
	
	public ArrecadaF pesquisaArrecadaF(Cadastro cadastro) throws Exception;
}
