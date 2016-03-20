package br.com.xkinfo.arrecadacao.service.impl;

import java.util.ArrayList;
import java.util.Calendar;

import br.com.xkinfo.arrecadacao.model.Agencia;
import br.com.xkinfo.arrecadacao.model.ArrecadaF;
import br.com.xkinfo.arrecadacao.model.Banco;
import br.com.xkinfo.arrecadacao.model.Retorno;
import br.com.xkinfo.arrecadacao.service.IArrecadaFService;
import br.com.xkinfo.cadastro.model.Cadastro;

public class ArrecadaFService implements IArrecadaFService {
	
	ArrecadaF arrecadaF;
	
	@Override
	public int incluirArrecadaF(Retorno retorno, String fatura, Cadastro cadastro, Banco banco, Agencia agencia,
			String contaCorrente, Calendar dataVencimento, Calendar dataCredito, Double valorFatura,
			String codigoBarras, int codigoMovimentacao, int nsr, Calendar dataPagamento) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<ArrecadaF> pesquisaArrecadaFs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ArrecadaF> pesquisaArrecadaFs(Banco banco) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrecadaF pesquisaArrecadaF(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrecadaF pesquisaArrecadaF(Cadastro cadastro) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
