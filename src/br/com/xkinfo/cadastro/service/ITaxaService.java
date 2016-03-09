package br.com.xkinfo.cadastro.service;

import java.util.ArrayList;

import br.com.xkinfo.cadastro.model.SituacaoCadastro;
import br.com.xkinfo.cadastro.model.Taxa;

public interface ITaxaService {
	
	public void incluirTaxa(int numero, String descricao, char sinal, char listaOs, char fiscal, char icms, char taxado, char mostraOs, 
			char reclama, int prioridade, Double valor1, Double valor2, Double valor3, Double valor4, String extenso, String extenso1, 
			String extenso2, String extenso3, char contribuicao, SituacaoCadastro situacaoCadastro, boolean imprimir, String observacao,
			String unidade, String classeSped, boolean codigo, int parcelas) throws Exception;
	
	public void alterarTaxa(int id, int numero, String descricao, char sinal, char listaOs, char fiscal, char icms, char taxado, char mostraOs, 
			char reclama, int prioridade, Double valor1, Double valor2, Double valor3, Double valor4, String extenso, String extenso1, 
			String extenso2, String extenso3, char contribuicao, SituacaoCadastro situacaoCadastro, boolean imprimir, String observacao,
			String unidade, String classeSped, boolean codigo, int parcelas) throws Exception;
	
	public void excluirTaxa(int id) throws Exception;
	
	public ArrayList<Taxa> pesquisarTaxas() throws Exception;
	
	public Taxa pesquisarTaxa(int id) throws Exception;

}
