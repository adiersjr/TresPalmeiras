package br.com.xkinfo.cadastro.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.xkinfo.cadastro.model.Classificacao;
import br.com.xkinfo.cadastro.service.IClassificacaoService;
import br.com.xkinfo.dao.DaoFactory;

public class ClassificacaoService implements IClassificacaoService{
	
	Classificacao classificacao;

	@Override
	public void incluirClassificacao(String chave, char tipo, char atividade, char tipoFornecedor, char fase,
			char iluminacaoPublica, String tarifa, String descricaoClasse, String descricaoAtividade,
			String descricaoTipoFornecedor, String descricaoFase, String descricaoIluminacao, String descricaoTarifa,
			int aliquota, boolean desativado, String tn, String tn_inf, String tn_sup, String subgrupo, boolean padrao)
					throws Exception {
		classificacao = new Classificacao();
		classificacao.setChave(chave);
		classificacao.setTipo(tipo);
		classificacao.setAtividade(atividade);
		classificacao.setTipoFornecedor(tipoFornecedor);
		classificacao.setFase(fase);
		classificacao.setIluminacaoPublica(iluminacaoPublica);
		classificacao.setTarifa(tarifa);
		classificacao.setDescricaoClasse(descricaoClasse);
		classificacao.setDescricaoAtividade(descricaoAtividade);
		classificacao.setDescricaoTipoFornecedor(descricaoTipoFornecedor);
		classificacao.setDescricaoFase(descricaoFase);
		classificacao.setDescricaoIluminacao(descricaoIluminacao);
		classificacao.setDescricaoTarifa(descricaoTarifa);
		classificacao.setAliquota(aliquota);
		classificacao.setDesativado(desativado);
		classificacao.setTn(tn);
		classificacao.setTn_inf(tn_inf);
		classificacao.setTn_sup(tn_sup);
		classificacao.setSubgrupo(subgrupo);
		classificacao.setPadrao(padrao);
		DaoFactory.getClassificacaodao().incluirClassificacao(classificacao);
	}

	@Override
	public void alterarClassificacao(int id, String chave, char tipo, char atividade, char tipoFornecedor, char fase,
			char iluminacaoPublica, String tarifa, String descricaoClasse, String descricaoAtividade,
			String descricaoTipoFornecedor, String descricaoFase, String descricaoIluminacao, String descricaoTarifa,
			int aliquota, boolean desativado, String tn, String tn_inf, String tn_sup, String subgrupo, boolean padrao)
					throws Exception {
		classificacao = new Classificacao();
		classificacao.setId(id);
		classificacao.setChave(chave);
		classificacao.setTipo(tipo);
		classificacao.setAtividade(atividade);
		classificacao.setTipoFornecedor(tipoFornecedor);
		classificacao.setFase(fase);
		classificacao.setIluminacaoPublica(iluminacaoPublica);
		classificacao.setTarifa(tarifa);
		classificacao.setDescricaoClasse(descricaoClasse);
		classificacao.setDescricaoAtividade(descricaoAtividade);
		classificacao.setDescricaoTipoFornecedor(descricaoTipoFornecedor);
		classificacao.setDescricaoFase(descricaoFase);
		classificacao.setDescricaoIluminacao(descricaoIluminacao);
		classificacao.setDescricaoTarifa(descricaoTarifa);
		classificacao.setAliquota(aliquota);
		classificacao.setDesativado(desativado);
		classificacao.setTn(tn);
		classificacao.setTn_inf(tn_inf);
		classificacao.setTn_sup(tn_sup);
		classificacao.setSubgrupo(subgrupo);
		classificacao.setPadrao(padrao);
		DaoFactory.getClassificacaodao().alterarClassificacao(classificacao);
	}

	@Override
	public void excluirClassificacao(int id) throws Exception {
		classificacao = pesquisarClassificacao(id);
		DaoFactory.getClassificacaodao().excluirClassificacao(classificacao);
	}

	@Override
	public ArrayList<Classificacao> pesquisarClassificacoes() throws Exception {
		ResultSet rs = DaoFactory.getClassificacaodao().pesquisarClassificacoes();
		ArrayList<Classificacao> classificacoes = new ArrayList<>();
		while (rs.next()){
			classificacao = new Classificacao();
			classificacao.setId(rs.getInt("ID"));
			classificacao.setChave(rs.getString("CLA_CHAVE"));
			classificacao.setTipo(rs.getString("CLA_TIPO").charAt(0));
			classificacao.setAtividade(rs.getString("CLA_ATIVIDADE").charAt(0));
			classificacao.setTipoFornecedor(rs.getString("CLA_TIPOFORN").charAt(0));
			classificacao.setFase(rs.getString("CLA_FASE").charAt(0));
			classificacao.setIluminacaoPublica(rs.getString("CLA_ILUMPUB").charAt(0));
			classificacao.setTarifa(rs.getString("CLA_TARIFA"));
			classificacao.setDescricaoClasse(rs.getString("CLA_DESCCLASSE"));
			classificacao.setDescricaoAtividade(rs.getString("CLA_DESCATIVIDADE"));
			classificacao.setDescricaoTipoFornecedor(rs.getString("CLA_DESCTIPOFORN"));
			classificacao.setDescricaoFase(rs.getString("CLA_DESCFASE"));
			classificacao.setDescricaoIluminacao(rs.getString("CLA_DESCILUM"));
			classificacao.setDescricaoTarifa(rs.getString("CLA_DESCTARIFA"));
			classificacao.setAliquota(rs.getInt("CLA_ALIQ"));
			classificacao.setDesativado(rs.getBoolean("CLA_DESATIVADO"));
			classificacao.setTn(rs.getString("CLA_TN"));
			classificacao.setTn_inf(rs.getString("CLA_TN_INF"));
			classificacao.setTn_sup(rs.getString("CLA_TN_SUP"));
			classificacao.setSubgrupo(rs.getString("CLA_SUBGRUPO"));
			classificacao.setPadrao(rs.getBoolean("CLA_PADRAO"));
			classificacoes.add(classificacao);
		}
		return classificacoes;
	}

	@Override
	public Classificacao pesquisarClassificacao(int id) throws Exception {
		ResultSet rs = DaoFactory.getClassificacaodao().pesquisarClassificacao(id);
		classificacao = new Classificacao();
		while (rs.next()){
			classificacao.setId(rs.getInt("ID"));
			classificacao.setChave(rs.getString("CLA_CHAVE"));
			classificacao.setTipo(rs.getString("CLA_TIPO").charAt(0));
			classificacao.setAtividade(rs.getString("CLA_ATIVIDADE").charAt(0));
			classificacao.setTipoFornecedor(rs.getString("CLA_TIPOFORN").charAt(0));
			classificacao.setFase(rs.getString("CLA_FASE").charAt(0));
			classificacao.setIluminacaoPublica(rs.getString("CLA_ILUMPUB").charAt(0));
			classificacao.setTarifa(rs.getString("CLA_TARIFA"));
			classificacao.setDescricaoClasse(rs.getString("CLA_DESCCLASSE"));
			classificacao.setDescricaoAtividade(rs.getString("CLA_DESCATIVIDADE"));
			classificacao.setDescricaoTipoFornecedor(rs.getString("CLA_DESCTIPOFORN"));
			classificacao.setDescricaoFase(rs.getString("CLA_DESCFASE"));
			classificacao.setDescricaoIluminacao(rs.getString("CLA_DESCILUM"));
			classificacao.setDescricaoTarifa(rs.getString("CLA_DESCTARIFA"));
			classificacao.setAliquota(rs.getInt("CLA_ALIQ"));
			classificacao.setDesativado(rs.getBoolean("CLA_DESATIVADO"));
			classificacao.setTn(rs.getString("CLA_TN"));
			classificacao.setTn_inf(rs.getString("CLA_TN_INF"));
			classificacao.setTn_sup(rs.getString("CLA_TN_SUP"));
			classificacao.setSubgrupo(rs.getString("CLA_SUBGRUPO"));
			classificacao.setPadrao(rs.getBoolean("CLA_PADRAO"));
		}
		return classificacao;
	}

}
