package br.com.xkinfo.cadastro.service;

import java.util.ArrayList;
import br.com.xkinfo.cadastro.model.SituacaoCadastro;

public interface ISituacaoCadastroService {
	
	public void incluirSituacaoCadastro(int numero, String descricao) throws Exception;

	public void alterarSituacaoCadastro(int id, int numero, String descricao) throws Exception;
	
	public void excluirSituacaoCadastro(int id) throws Exception;
	
	public ArrayList<SituacaoCadastro> pesquisarSituacaoCadastros() throws Exception;
	
	public SituacaoCadastro pesquisarSituacaoCadastro(int id) throws Exception;
}
