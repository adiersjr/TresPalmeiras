package br.com.xkinfo.cadastro.service;

import java.util.ArrayList;

import br.com.xkinfo.cadastro.model.Setor;
import br.com.xkinfo.cadastro.model.Vencimento;

public interface IVencimentoService {
	
	public void incluirVencimento(Setor setor, int numero, String dia, boolean vip) throws Exception;
	
	public void alterarVencimento(int id, Setor setor, int numero, String dia, boolean vip) throws Exception;
	
	public void excluirVencimento(int id) throws Exception;
	
	public ArrayList<Vencimento> pesquisarVencimentos() throws Exception;
	
	public Vencimento pesquisarVencimento(int id) throws Exception;

}
