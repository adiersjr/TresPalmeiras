package br.com.xkinfo.pessoa.service;

import java.util.ArrayList;
import java.util.Calendar;

import br.com.xkinfo.endereco.model.Estado;
import br.com.xkinfo.endereco.model.MunicipioIbge;
import br.com.xkinfo.endereco.model.Pais;
import br.com.xkinfo.pessoa.model.Cliente;
import br.com.xkinfo.pessoa.model.TipoDocumento;

public interface IClienteService {

	public void incluirCliente(MunicipioIbge municipioIbge, Estado estado, Pais pais, TipoDocumento tipoDocumento, String cadastro, String nome, String cnpjCpf,
			String documento, String orgaoExpedidor, Estado ufExpedidor, String tituloEleitor, Calendar dataNascimento, String fone, Integer ramal,
			String foneComercial, Integer ramalComercial, String foneCelular, String email, String senha, char sexo, String nomePai, String nomeMae, 
			String contato, String nis, Calendar dataEmissaoNis, boolean aprovacaoNis, Calendar dataProcessamento, boolean pessoaJuridica, 
			Calendar dataCadastro, Calendar dataAutoDeclaracao, Calendar dataProc, String usuario, Calendar dataEnvioScs, String tipoCliente) throws Exception;

	public void alterarCliente(int id, MunicipioIbge municipioIbge, Estado estado, Pais pais, TipoDocumento tipoDocumento, String cadastro, String nome, String cnpjCpf,
			String documento, String orgaoExpedidor, Estado ufExpedidor, String tituloEleitor, Calendar dataNascimento, String fone, Integer ramal,
			String foneComercial, Integer ramalComercial, String foneCelular, String email, String senha, char sexo, String nomePai, String nomeMae, 
			String contato, String nis, Calendar dataEmissaoNis, boolean aprovacaoNis, Calendar dataProcessamento, boolean pessoaJuridica, 
			Calendar dataCadastro, Calendar dataAutoDeclaracao, Calendar dataProc, String usuario, Calendar dataEnvioScs, String tipoCliente) throws Exception;

	public void excluirCliente(int id) throws Exception;

	public ArrayList<Cliente> pesquisaClientes() throws Exception;
	
	public Cliente pesquisaCliente(int id) throws Exception;
	
	public boolean validaSexo(char sexo);

}
