package br.com.xkinfo.pessoa.service;

import java.util.ArrayList;

import br.com.xkinfo.pessoa.model.TipoDocumento;

public interface ITipoDocumentoService {

	public boolean incluirTipoDocumento(String descricao, boolean pessoal) throws Exception;

	public boolean alterarTipoDocumento(int id, String descricao, boolean pessoal) throws Exception;

	public boolean excluirTipoDocumento(int id) throws Exception;

	public ArrayList<TipoDocumento> pesquisaTipoDocumentos() throws Exception;

	public ArrayList<TipoDocumento> pesquisaDescricao(String descricao) throws Exception;

	public TipoDocumento pesquisaTipoDocumento(int id) throws Exception;
}
