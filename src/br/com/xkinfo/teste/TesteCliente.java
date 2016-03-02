package br.com.xkinfo.teste;

import java.util.Calendar;

import br.com.xkinfo.model.Estado;
import br.com.xkinfo.model.Municipio;
import br.com.xkinfo.model.Pais;
import br.com.xkinfo.model.TipoDocumento;
import br.com.xkinfo.service.ServiceFactory;

public class TesteCliente {

	public static void main(String[] args) {

		Municipio municipio = null;
		Estado estado = null ;
		Pais pais = null;
		TipoDocumento tipoDocumento = null;
		Estado ufExpedidor = null;
		try {
			municipio = ServiceFactory.getMunicpioservice().pesquisaMunicipio(2);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			estado = ServiceFactory.getEstadoservice().pesquisaEstado(1);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			pais = ServiceFactory.getPaisservice().pesquisaPais(1);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			tipoDocumento = ServiceFactory.getTipodocumentoservice().pesquisaTipoDocumento(1);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			ufExpedidor = ServiceFactory.getEstadoservice().pesquisaEstado(1);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String cadastro = "cad";
		String nome = "nome";
		String cnpjCpf = "cnpjCpf";
		String documento = "";
		String orgaoExpedidor = "";
		String tituloEleitor = "";
		Calendar dataNascimento = Calendar.getInstance();;
		String fone = "";
		Integer ramal = 1;
		String foneComercial = "";
		Integer ramalComercial = 1;
		String foneCelular = "";
		String email = "";
		String senha = "";
		char sexo = 'M';
		String nomePai = "";
		String nomeMae = "";
		String contato = "";
		String nis = "";
		Calendar dataEmissaoNis = Calendar.getInstance();;
		boolean aprovacaoNis = true;
		Calendar dataProcessamento = Calendar.getInstance();;
		boolean pessoaJuridica = true;
		Calendar dataCadastro = Calendar.getInstance();;
		Calendar dataAutoDeclaracao = Calendar.getInstance();;
		Calendar dataProc = Calendar.getInstance();;
		String usuario = "";
		Calendar dataEnvioScs = Calendar.getInstance();;
		String tipoCliente = "";

		try {
			ServiceFactory.getClienteservice().incluirCliente(municipio, estado, pais, tipoDocumento, cadastro, nome, cnpjCpf, documento, orgaoExpedidor, ufExpedidor, tituloEleitor, dataNascimento, fone, ramal, foneComercial, ramalComercial, foneCelular, email, senha, sexo, nomePai, nomeMae, contato, nis, dataEmissaoNis, aprovacaoNis, dataProcessamento, pessoaJuridica, dataCadastro, dataAutoDeclaracao, dataProc, usuario, dataEnvioScs, tipoCliente);
		} catch (Exception e) {
			e.printStackTrace();
		}


	}}
