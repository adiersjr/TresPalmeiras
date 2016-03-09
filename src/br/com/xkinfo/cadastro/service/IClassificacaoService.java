package br.com.xkinfo.cadastro.service;

import java.util.ArrayList;

import br.com.xkinfo.cadastro.model.Classificacao;

public interface IClassificacaoService {
	
	public void incluirClassificacao(String chave, char tipo, char atividade, char tipoFornecedor, char fase, char iluminacaoPublica,
			String tarifa, String descricaoClasse, String descricaoAtividade, String descricaoTipoFornecedor, String descricaoFase, 
			String descricaoIluminacao, String descricaoTarifa, int aliquota, boolean desativado, String tn, String tn_inf, String tn_sup, 
			String subgrupo, boolean padrao) throws Exception;
	
	public void alterarClassificacao(int id, String chave, char tipo, char atividade, char tipoFornecedor, char fase, char iluminacaoPublica,
			String tarifa, String descricaoClasse, String descricaoAtividade, String descricaoTipoFornecedor, String descricaoFase, 
			String descricaoIluminacao, String descricaoTarifa, int aliquota, boolean desativado, String tn, String tn_inf, String tn_sup, 
			String subgrupo, boolean padrao) throws Exception;
	
	public void excluirClassificacao(int id) throws Exception;
	
	public ArrayList<Classificacao> pesquisarClassificacoes() throws Exception;
	
	public Classificacao pesquisarClassificacao(int id) throws Exception;

}
