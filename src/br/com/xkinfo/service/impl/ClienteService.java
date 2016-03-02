package br.com.xkinfo.service.impl;

import java.util.ArrayList;
import java.util.Calendar;

import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.model.Cliente;
import br.com.xkinfo.model.Estado;
import br.com.xkinfo.model.Municipio;
import br.com.xkinfo.model.Pais;
import br.com.xkinfo.model.TipoDocumento;
import br.com.xkinfo.service.IClienteService;

public class ClienteService implements IClienteService{
	
	Cliente cliente;

	@Override
	public void incluirCliente(Municipio municipio, Estado estado, Pais pais, TipoDocumento tipoDocumento, String cadastro, String nome, String cnpjCpf,
			String documento, String orgaoExpedidor, Estado ufExpedidor, String tituloEleitor, Calendar dataNascimento, String fone, Integer ramal,
			String foneComercial, Integer ramalComercial, String foneCelular, String email, String senha, char sexo, String nomePai, String nomeMae, 
			String contato, String nis, Calendar dataEmissaoNis, boolean aprovacaoNis, Calendar dataProcessamento, boolean pessoaJuridica, 
			Calendar dataCadastro, Calendar dataAutoDeclaracao, Calendar dataProc, String usuario, Calendar dataEnvioScs, String tipoCliente) throws Exception {
		
		cliente = new Cliente();
		cliente.setMunicipio(municipio);
		cliente.setEstado(estado);
		cliente.setPais(pais);
		cliente.setTipoDocumento(tipoDocumento);
		cliente.setCadastro(cadastro);
		cliente.setNome(nome);
		cliente.setCnpjCpf(cnpjCpf);
		cliente.setDocumento(documento);
		cliente.setOrgaoExpedidor(orgaoExpedidor);
		cliente.setUfExpedidor(ufExpedidor);
		cliente.setTituloEleitor(tituloEleitor);
		cliente.setDataNascimento(dataNascimento);
		cliente.setFone(fone);
		cliente.setRamal(ramal);
		cliente.setFoneComercial(foneComercial);
		cliente.setRamalComercial(ramalComercial);
		cliente.setFoneCelular(foneCelular);
		cliente.setEmail(email);
		cliente.setSenha(senha);
		cliente.setSexo(sexo);
		cliente.setNomePai(nomePai);
		cliente.setNomeMae(nomeMae);
		cliente.setContato(contato);
		cliente.setNis(nis);
		cliente.setDataEmissaoNis(dataEmissaoNis);
		cliente.setAprovacaoNis(aprovacaoNis);
		cliente.setDataProcessamento(dataProcessamento);
		cliente.setPessoaJuridica(pessoaJuridica);
		cliente.setDataCadastro(dataCadastro);
		cliente.setDataAutoDeclaracao(dataAutoDeclaracao);
		cliente.setDataProc(dataProc);
		cliente.setUsuario(usuario);
		cliente.setDataEnvioScs(dataEnvioScs);
		cliente.setTipoCliente(tipoCliente);
		
		if(validaSexo(cliente.getSexo())){
			DaoFactory.getClientedao().incluirCliente(cliente);
		} else {
			System.out.println("Favor preencher corretamente o Sexo!");
		}
	}

	@Override
	public void alterarCliente(int id, String descricao) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirCliente(int id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Cliente> pesquisaClientes() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean validaSexo(char sexo){
		boolean ret = false;
		if(sexo == 'M' || sexo == 'm' || sexo == 'F' || sexo == 'f')
			ret = true;
		else
			ret = false;
		return ret;
	}

}
