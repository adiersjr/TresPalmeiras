package br.com.xkinfo.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.model.Cliente;
import br.com.xkinfo.model.Estado;
import br.com.xkinfo.model.MunicipioIbge;
import br.com.xkinfo.model.Pais;
import br.com.xkinfo.model.TipoDocumento;
import br.com.xkinfo.service.IClienteService;
import br.com.xkinfo.service.ServiceFactory;

public class ClienteService implements IClienteService{

	Cliente cliente;

	@Override
	public void incluirCliente(MunicipioIbge municipioIbge, Estado estado, Pais pais, TipoDocumento tipoDocumento, String cadastro, String nome, String cnpjCpf,
			String documento, String orgaoExpedidor, Estado ufExpedidor, String tituloEleitor, Calendar dataNascimento, String fone, Integer ramal,
			String foneComercial, Integer ramalComercial, String foneCelular, String email, String senha, char sexo, String nomePai, String nomeMae, 
			String contato, String nis, Calendar dataEmissaoNis, boolean aprovacaoNis, Calendar dataProcessamento, boolean pessoaJuridica, 
			Calendar dataCadastro, Calendar dataAutoDeclaracao, Calendar dataProc, String usuario, Calendar dataEnvioScs, String tipoCliente) throws Exception {

		cliente = new Cliente();
		cliente.setMunicipioIbge(municipioIbge);
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
	public void alterarCliente(int id, MunicipioIbge municipioIbge, Estado estado, Pais pais,
			TipoDocumento tipoDocumento, String cadastro, String nome, String cnpjCpf, String documento,
			String orgaoExpedidor, Estado ufExpedidor, String tituloEleitor, Calendar dataNascimento, String fone,
			Integer ramal, String foneComercial, Integer ramalComercial, String foneCelular, String email, String senha,
			char sexo, String nomePai, String nomeMae, String contato, String nis, Calendar dataEmissaoNis,
			boolean aprovacaoNis, Calendar dataProcessamento, boolean pessoaJuridica, Calendar dataCadastro,
			Calendar dataAutoDeclaracao, Calendar dataProc, String usuario, Calendar dataEnvioScs, String tipoCliente)
					throws Exception {
		
		cliente = new Cliente();
		cliente.setId(id);
		cliente.setMunicipioIbge(municipioIbge);
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
			DaoFactory.getClientedao().alterarCliente(cliente);
		} else {
			System.out.println("Favor preencher corretamente o Sexo!");
		}
	}

	@Override
	public void excluirCliente(int id) throws Exception {
		cliente = pesquisaCliente(id);
		DaoFactory.getClientedao().excluirCliente(cliente);
	}

	@Override
	public ArrayList<Cliente> pesquisaClientes() throws Exception {
		ResultSet rs = DaoFactory.getClientedao().pesquisaClientes();
		ArrayList<Cliente> clientes = new ArrayList<>();
		while(rs.next()) {
			cliente = new Cliente();
			cliente.setId(rs.getInt("CLI_NUMERO"));
			cliente.setMunicipioIbge(ServiceFactory.getMunicipioibgeservice().pesquisaMunicipio(rs.getInt("MUI_CODIGO")));
			cliente.setEstado(ServiceFactory.getEstadoservice().pesquisaEstado(rs.getInt("EST_SIGLA")));
			cliente.setPais(ServiceFactory.getPaisservice().pesquisaPais(rs.getInt("PAI_NUMERO")));
			cliente.setTipoDocumento(ServiceFactory.getTipodocumentoservice().pesquisaTipoDocumento(rs.getInt("TPD_NUMERO")));
			cliente.setCadastro(rs.getString("CAD_CHAVE"));
			cliente.setNome(rs.getString("CLI_NOME"));
			cliente.setCnpjCpf(rs.getString("CLI_CNPJCPF"));
			cliente.setDocumento(rs.getString("CLI_DOCUMENTO"));
			cliente.setOrgaoExpedidor(rs.getString("CLI_ORGAOEXPEDIDOR"));
			cliente.setUfExpedidor(ServiceFactory.getEstadoservice().pesquisaSigla(rs.getString("CLI_UFEXPEDIDOR")));
			cliente.setTituloEleitor(rs.getString("CLI_TITULOELEITOR"));
			cliente.setDataNascimento(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CLI_DTANASCIMENTO")));
			cliente.setFone(rs.getString("CLI_FONE"));
			cliente.setRamal(rs.getInt("CLI_RAMAL"));
			cliente.setFoneComercial(rs.getString("CLI_FONECOMERCIAL"));
			cliente.setRamalComercial(rs.getInt("CLI_RAMALCOMERCIAL"));
			cliente.setFoneCelular(rs.getString("CLI_FONECELULAR"));
			cliente.setEmail(rs.getString("CLI_EMAIL"));
			cliente.setSenha(rs.getString("CLI_SENHA"));
			cliente.setSexo(rs.getString("CLI_SEXO").charAt(0));
			cliente.setNomePai(rs.getString("CLI_NOMEPAI"));
			cliente.setNomeMae(rs.getString("CLI_NOMEMAE"));
			cliente.setContato(rs.getString("CLI_CONTATO"));
			cliente.setNis(rs.getString("CLI_NIS"));
			cliente.setDataEmissaoNis(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CLI_DTAEMISSAONIS")));
			cliente.setAprovacaoNis(rs.getBoolean("CLI_APROVACAONIS"));
			cliente.setDataProcessamento(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CLI_DTAPROCESSAMENTO")));
			cliente.setPessoaJuridica(rs.getBoolean("CLI_PESSOAJURIDICA"));
			cliente.setDataCadastro(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CLI_DATACAD")));
			cliente.setDataAutoDeclaracao(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CLI_DATAAUTODECL")));
			cliente.setDataProc(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CLI_DATAPROC")));
			cliente.setUsuario(rs.getString("CLI_USUARIO"));
			cliente.setDataEnvioScs(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CLI_DATA_ENVIO_SCS")));
			cliente.setTipoCliente(rs.getString("CLI_TIPO_CLIENTE"));
			clientes.add(cliente);
		}
		return clientes;
	}

	@Override
	public Cliente pesquisaCliente(int id) throws Exception {
		ResultSet rs = DaoFactory.getClientedao().pesquisaCliente(id);
		cliente = new Cliente();
		while(rs.next()) {
			cliente.setId(rs.getInt("CLI_NUMERO"));
			cliente.setMunicipioIbge(ServiceFactory.getMunicipioibgeservice().pesquisaMunicipio(rs.getInt("MUI_CODIGO")));
			cliente.setEstado(ServiceFactory.getEstadoservice().pesquisaEstado(rs.getInt("EST_SIGLA")));
			cliente.setPais(ServiceFactory.getPaisservice().pesquisaPais(rs.getInt("PAI_NUMERO")));
			cliente.setTipoDocumento(ServiceFactory.getTipodocumentoservice().pesquisaTipoDocumento(rs.getInt("TPD_NUMERO")));
			cliente.setCadastro(rs.getString("CAD_CHAVE"));
			cliente.setNome(rs.getString("CLI_NOME"));
			cliente.setCnpjCpf(rs.getString("CLI_CNPJCPF"));
			cliente.setDocumento(rs.getString("CLI_DOCUMENTO"));
			cliente.setOrgaoExpedidor(rs.getString("CLI_ORGAOEXPEDIDOR"));
			cliente.setUfExpedidor(ServiceFactory.getEstadoservice().pesquisaSigla(rs.getString("CLI_UFEXPEDIDOR")));
			cliente.setTituloEleitor(rs.getString("CLI_TITULOELEITOR"));
			cliente.setDataNascimento(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CLI_DTANASCIMENTO")));
			cliente.setFone(rs.getString("CLI_FONE"));
			cliente.setRamal(rs.getInt("CLI_RAMAL"));
			cliente.setFoneComercial(rs.getString("CLI_FONECOMERCIAL"));
			cliente.setRamalComercial(rs.getInt("CLI_RAMALCOMERCIAL"));
			cliente.setFoneCelular(rs.getString("CLI_FONECELULAR"));
			cliente.setEmail(rs.getString("CLI_EMAIL"));
			cliente.setSenha(rs.getString("CLI_SENHA"));
			cliente.setSexo(rs.getString("CLI_SEXO").charAt(0));
			cliente.setNomePai(rs.getString("CLI_NOMEPAI"));
			cliente.setNomeMae(rs.getString("CLI_NOMEMAE"));
			cliente.setContato(rs.getString("CLI_CONTATO"));
			cliente.setNis(rs.getString("CLI_NIS"));
			cliente.setDataEmissaoNis(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CLI_DTAEMISSAONIS")));
			cliente.setAprovacaoNis(rs.getBoolean("CLI_APROVACAONIS"));
			cliente.setDataProcessamento(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CLI_DTAPROCESSAMENTO")));
			cliente.setPessoaJuridica(rs.getBoolean("CLI_PESSOAJURIDICA"));
			cliente.setDataCadastro(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CLI_DATACAD")));
			cliente.setDataAutoDeclaracao(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CLI_DATAAUTODECL")));
			cliente.setDataProc(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CLI_DATAPROC")));
			cliente.setUsuario(rs.getString("CLI_USUARIO"));
			cliente.setDataEnvioScs(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("CLI_DATA_ENVIO_SCS")));
			cliente.setTipoCliente(rs.getString("CLI_TIPO_CLIENTE"));
		}
		return cliente;
		
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
