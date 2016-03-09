package br.com.xkinfo.cadastro.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.xkinfo.cadastro.model.SituacaoCadastro;
import br.com.xkinfo.cadastro.model.Taxa;
import br.com.xkinfo.cadastro.service.ITaxaService;
import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.service.ServiceFactory;

public class TaxaService implements ITaxaService{
	
	Taxa taxa;

	@Override
	public void incluirTaxa(int numero, String descricao, char sinal, char listaOs, char fiscal, char icms, char taxado,
			char mostraOs, char reclama, int prioridade, Double valor1, Double valor2, Double valor3, Double valor4,
			String extenso, String extenso1, String extenso2, String extenso3, char contribuicao,
			SituacaoCadastro situacaoCadastro, boolean imprimir, String observacao, String unidade, String classeSped,
			boolean codigo, int parcelas) throws Exception {
		taxa = new Taxa();
		taxa.setNumero(numero);
		taxa.setDescricao(descricao);
		taxa.setSinal(sinal);
		taxa.setListaOs(listaOs);
		taxa.setFiscal(fiscal);
		taxa.setIcms(icms);
		taxa.setTaxado(taxado);
		taxa.setMostraOs(mostraOs);
		taxa.setReclama(reclama);
		taxa.setPrioridade(prioridade);
		taxa.setValor1(valor1);
		taxa.setValor2(valor2);
		taxa.setValor3(valor3);
		taxa.setValor4(valor4);
		taxa.setExtenso(extenso);
		taxa.setExtenso1(extenso1);
		taxa.setExtenso2(extenso2);
		taxa.setExtenso3(extenso3);
		taxa.setContribuicao(contribuicao);
		taxa.setSituacaoCadastro(situacaoCadastro);
		taxa.setImprimir(imprimir);
		taxa.setObservacao(observacao);
		taxa.setUnidade(unidade);
		taxa.setClasseSped(classeSped);
		taxa.setCodigo(codigo);
		taxa.setParcelas(parcelas);
		DaoFactory.getTaxadao().incluirTaxa(taxa);
	}

	@Override
	public void alterarTaxa(int id, int numero, String descricao, char sinal, char listaOs, char fiscal, char icms,
			char taxado, char mostraOs, char reclama, int prioridade, Double valor1, Double valor2, Double valor3,
			Double valor4, String extenso, String extenso1, String extenso2, String extenso3, char contribuicao,
			SituacaoCadastro situacaoCadastro, boolean imprimir, String observacao, String unidade, String classeSped,
			boolean codigo, int parcelas) throws Exception {
		taxa = new Taxa();
		taxa.setId(id);
		taxa.setNumero(numero);
		taxa.setDescricao(descricao);
		taxa.setSinal(sinal);
		taxa.setListaOs(listaOs);
		taxa.setFiscal(fiscal);
		taxa.setIcms(icms);
		taxa.setTaxado(taxado);
		taxa.setMostraOs(mostraOs);
		taxa.setReclama(reclama);
		taxa.setPrioridade(prioridade);
		taxa.setValor1(valor1);
		taxa.setValor2(valor2);
		taxa.setValor3(valor3);
		taxa.setValor4(valor4);
		taxa.setExtenso(extenso);
		taxa.setExtenso1(extenso1);
		taxa.setExtenso2(extenso2);
		taxa.setExtenso3(extenso3);
		taxa.setContribuicao(contribuicao);
		taxa.setSituacaoCadastro(situacaoCadastro);
		taxa.setImprimir(imprimir);
		taxa.setObservacao(observacao);
		taxa.setUnidade(unidade);
		taxa.setClasseSped(classeSped);
		taxa.setCodigo(codigo);
		taxa.setParcelas(parcelas);
		DaoFactory.getTaxadao().alterarTaxa(taxa);
	}

	@Override
	public void excluirTaxa(int id) throws Exception {
		taxa = pesquisarTaxa(id);
		DaoFactory.getTaxadao().excluirTaxa(taxa);
	}

	@Override
	public ArrayList<Taxa> pesquisarTaxas() throws Exception {
		ResultSet rs = DaoFactory.getTaxadao().pesquisaTaxas();
		ArrayList<Taxa> taxas = new ArrayList<>();
		while(rs.next()){
			taxa = new Taxa();
			taxa.setId(rs.getInt("TAX_CODIGO"));
			taxa.setNumero(rs.getInt("TAX_NUMERO"));
			taxa.setDescricao(rs.getString("TAX_DESCRICAO"));
			taxa.setSinal(rs.getString("TAX_sinal").charAt(0));
			taxa.setListaOs(rs.getString("TAX_LISTAOS").charAt(0));
			taxa.setFiscal(rs.getString("TAX_FISCAL").charAt(0));
			taxa.setIcms(rs.getString("TAX_ICMS").charAt(0));
			taxa.setTaxado(rs.getString("TAX_TAXADO").charAt(0));
			taxa.setMostraOs(rs.getString("TAX_MOSTRAOS").charAt(0));
			taxa.setReclama(rs.getString("TAX_RECLAMA").charAt(0));
			taxa.setPrioridade(rs.getInt("TAX_PRIORIDADE"));
			taxa.setValor1(rs.getDouble("TAX_VALOR1"));
			taxa.setValor2(rs.getDouble("TAX_VALOR2"));
			taxa.setValor3(rs.getDouble("TAX_VALOR3"));
			taxa.setValor4(rs.getDouble("TAX_VALOR4"));
			taxa.setExtenso(rs.getString("TAX_EXTENSO"));
			taxa.setExtenso1(rs.getString("TAX_EXTENSO1"));
			taxa.setExtenso2(rs.getString("TAX_EXTENSO2"));
			taxa.setExtenso3(rs.getString("TAX_EXTENSO3"));
			taxa.setContribuicao(rs.getString("TAX_CONTRIBUICAO").charAt(0));
			taxa.setSituacaoCadastro(ServiceFactory.getSituacaocadastroservice().pesquisarSituacaoCadastro(rs.getInt("SIT_CODIGO")));
			taxa.setImprimir(rs.getBoolean("TAX_IMPRIMIR"));
			taxa.setObservacao(rs.getString("TAX_OBS"));
			taxa.setUnidade(rs.getString("TAX_UNIDADE"));
			taxa.setClasseSped(rs.getString("TAX_CLASSESPED"));
			taxa.setCodigo(rs.getBoolean("TAX_COD"));
			taxa.setParcelas(rs.getInt("TAX_PARCELAS"));
			taxas.add(taxa);
		}
		return taxas;
	}

	@Override
	public Taxa pesquisarTaxa(int id) throws Exception {
		ResultSet rs = DaoFactory.getTaxadao().pesquisaTaxa(id);
		taxa = new Taxa();
		while(rs.next()){
			taxa.setId(rs.getInt("TAX_CODIGO"));
			taxa.setNumero(rs.getInt("TAX_NUMERO"));
			taxa.setDescricao(rs.getString("TAX_DESCRICAO"));
			taxa.setSinal(rs.getString("TAX_sinal").charAt(0));
			taxa.setListaOs(rs.getString("TAX_LISTAOS").charAt(0));
			taxa.setFiscal(rs.getString("TAX_FISCAL").charAt(0));
			taxa.setIcms(rs.getString("TAX_ICMS").charAt(0));
			taxa.setTaxado(rs.getString("TAX_TAXADO").charAt(0));
			taxa.setMostraOs(rs.getString("TAX_MOSTRAOS").charAt(0));
			taxa.setReclama(rs.getString("TAX_RECLAMA").charAt(0));
			taxa.setPrioridade(rs.getInt("TAX_PRIORIDADE"));
			taxa.setValor1(rs.getDouble("TAX_VALOR1"));
			taxa.setValor2(rs.getDouble("TAX_VALOR2"));
			taxa.setValor3(rs.getDouble("TAX_VALOR3"));
			taxa.setValor4(rs.getDouble("TAX_VALOR4"));
			taxa.setExtenso(rs.getString("TAX_EXTENSO"));
			taxa.setExtenso1(rs.getString("TAX_EXTENSO1"));
			taxa.setExtenso2(rs.getString("TAX_EXTENSO2"));
			taxa.setExtenso3(rs.getString("TAX_EXTENSO3"));
			taxa.setContribuicao(rs.getString("TAX_CONTRIBUICAO").charAt(0));
			taxa.setSituacaoCadastro(ServiceFactory.getSituacaocadastroservice().pesquisarSituacaoCadastro(rs.getInt("SIT_CODIGO")));
			taxa.setImprimir(rs.getBoolean("TAX_IMPRIMIR"));
			taxa.setObservacao(rs.getString("TAX_OBS"));
			taxa.setUnidade(rs.getString("TAX_UNIDADE"));
			taxa.setClasseSped(rs.getString("TAX_CLASSESPED"));
			taxa.setCodigo(rs.getBoolean("TAX_COD"));
			taxa.setParcelas(rs.getInt("TAX_PARCELAS"));
		}
		return taxa;
	}

}
