package br.com.xkinfo.pessoa.dao;

import java.sql.ResultSet;

import br.com.xkinfo.pessoa.model.TipoDocumento;

public interface ITipoDocumentoDao {

	public int incluirTipoDocumento(TipoDocumento tipoDocumento) throws Exception;

	public int alterarTipoDocumento(TipoDocumento tipoDocumento) throws Exception;

	public int excluirTipoDocumento(TipoDocumento tipoDocumento) throws Exception;

	public ResultSet pesquisaTipoDocumentos() throws Exception;

	public ResultSet pesquisaDescricao(String descricao) throws Exception;

	public ResultSet pesquisaTipoDocumento(int id) throws Exception;

}
