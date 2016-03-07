package br.com.xkinfo.arrecadacao.service;

import java.util.ArrayList;

import br.com.xkinfo.arrecadacao.model.Banco;

public interface IBancoService {

	public int incluirBanco(String numero, String telefone, String nome, String inicial, String convenio, Double tarifaF, String ccCredito,
			String convenioG, Double tarifaG, int nsr, int diasG, int diasF, boolean debito) throws Exception;

	public int alterarBanco(int id, String numero, String telefone, String nome, String inicial, String convenio, Double tarifaF, String ccCredito,
			String convenioG, Double tarifaG, int nsr, int diasG, int diasF, boolean debito) throws Exception;

	public int excluirBanco(int id) throws Exception;

	public ArrayList<Banco> pesquisaBancos() throws Exception;

	public Banco pesquisaBanco(int id) throws Exception;
}
