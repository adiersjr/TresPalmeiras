package br.com.xkinfo.cadastro.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.xkinfo.cadastro.dao.ITaxaDao;
import br.com.xkinfo.cadastro.model.Taxa;
import br.com.xkinfo.service.ServiceFactory;
import br.com.xkinfo.util.Conexao;

public class TaxaDao implements ITaxaDao{

	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirTaxa(Taxa taxa) throws Exception {
		int result = -1;
		String query = "INSERT INTO TAXAS (TAX_NUMERO, TAX_DESC, TAX_SINAL, TAX_LISTAOS, TAX_FISCAL, TAX_ICMS, TAX_TAXADO, TAX_MOSTRAOS, TAX_RECLAMA, "
				+ " TAX_PRIORIDADE, TAX_VALOR1, TAX_VALOR2, TAX_VALOR3, TAX_VALOR4, TAX_EXTENSO, TAX_EXTENSO1, TAX_EXTENSO2, TAX_EXTENSO3, TAX_CONTRIBUICAO, "
				+ " SIT_CODIGO, TAX_IMPRIMIR, TAX_OBS, TAX_UNIDADE, TAX_CLASSESPED, TAX_COD, TAX_PARCELAS) "
				+ " VALUES ("+taxa.getNumero()+", '"+taxa.getDescricao()+"', '"+taxa.getSinal()+"', '"+taxa.getListaOs()+"', '"+taxa.getFiscal()+"', "
				+ " '"+taxa.getIcms()+"', '"+taxa.getTaxado()+"', '"+taxa.getMostraOs()+"', '"+taxa.getReclama()+"', "+taxa.getPrioridade()+", "
				+ " "+taxa.getValor1()+", "+taxa.getValor2()+", "+taxa.getValor3()+", "+taxa.getValor4()+", '"+taxa.getExtenso()+"', "
				+ " '"+taxa.getExtenso1()+"', '"+taxa.getExtenso2()+"', '"+taxa.getExtenso3()+"', '"+taxa.getContribuicao()+"', "
				+ " "+taxa.getSituacaoCadastro().getId()+", "+ServiceFactory.getApoioservice().converteBoolean(taxa.isImprimir())+","
				+ " '"+taxa.getObservacao()+"', '"+taxa.getUnidade()+"', '"+taxa.getClasseSped()+"', "
				+ " "+ServiceFactory.getApoioservice().converteBoolean(taxa.isCodigo())+", "+taxa.getParcelas()+") ";
		try {
			st = conexao.connect().createStatement();
			result = st.executeUpdate(query);
			conexao.connect().close();
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int alterarTaxa(Taxa taxa) throws Exception {
		int result = -1;
		String query = "UPDATE TAXAS SET TAX_NUMERO = "+taxa.getNumero()+", TAX_DESC = '"+taxa.getDescricao()+"', TAX_SINAL = '"+taxa.getSinal()+"', "
				+ " TAX_LISTAOS = '"+taxa.getListaOs()+"', TAX_FISCAL = '"+taxa.getFiscal()+"', TAX_ICMS = '"+taxa.getIcms()+"', "
				+ " TAX_TAXADO = '"+taxa.getTaxado()+"', TAX_MOSTRAOS = '"+taxa.getMostraOs()+"', TAX_RECLAMA = '"+taxa.getReclama()+"', "
				+ " TAX_PRIORIDADE = "+taxa.getPrioridade()+", TAX_VALOR1 = "+taxa.getValor1()+", TAX_VALOR2 = "+taxa.getValor2()+", "
				+ " TAX_VALOR3 = "+taxa.getValor3()+", TAX_VALOR4 = "+taxa.getValor4()+", TAX_EXTENSO = '"+taxa.getExtenso()+"', "
				+ " TAX_EXTENSO1 = '"+taxa.getExtenso1()+"', TAX_EXTENSO2 = '"+taxa.getExtenso2()+"', TAX_EXTENSO3 = '"+taxa.getExtenso3()+"', "
				+ " TAX_CONTRIBUICAO = '"+taxa.getContribuicao()+"', SIT_CODIGO = "+taxa.getSituacaoCadastro().getId()+", "
				+ " TAX_IMPRIMIR = "+ServiceFactory.getApoioservice().converteBoolean(taxa.isImprimir())+", TAX_OBS = '"+taxa.getObservacao()+"', "
				+ " TAX_UNIDADE = '"+taxa.getUnidade()+"', TAX_CLASSESPED = '"+taxa.getClasseSped()+"', "
				+ " TAX_COD = "+ServiceFactory.getApoioservice().converteBoolean(taxa.isCodigo())+", TAX_PARCELAS = "+taxa.getParcelas()+" "
				+ " WHERE TAX_CODIGO = "+taxa.getId()+" ";
		try {
			st = conexao.connect().createStatement();
			result = st.executeUpdate(query);
			conexao.connect().close();
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int excluirTaxa(Taxa taxa) throws Exception {
		int result = -1;
		String query = "DELETE FROM TAXAS WHERE TAX_CODIGO = "+taxa.getId()+" ";
		try {
			st = conexao.connect().createStatement();
			result = st.executeUpdate(query);
			conexao.connect().close();
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public ResultSet pesquisaTaxas() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM TAXAS";
		try {
			st = conexao.connect().createStatement();
			rs = st.executeQuery(query);
			conexao.connect().close();
			return rs;
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public ResultSet pesquisaTaxa(int id) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM TAXAS WHERE TAX_CODIGO = "+id+" ";
		try {
			st = conexao.connect().createStatement();
			rs = st.executeQuery(query);
			conexao.connect().close();
			return rs;
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		return rs;
	}

}
