package br.com.xkinfo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.xkinfo.dao.IClienteDao;
import br.com.xkinfo.model.Cliente;
import br.com.xkinfo.service.ServiceFactory;
import br.com.xkinfo.util.Conexao;

public class ClienteDao implements IClienteDao {

	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirCliente(Cliente cliente) throws Exception {
		int result = -1;
		String envioScs = ServiceFactory.getApoioservice().converteDataBanco(cliente.getDataEnvioScs());
		String dataProcessamento = ServiceFactory.getApoioservice().converteDataBanco(cliente.getDataProcessamento());
		String dataNascimento = ServiceFactory.getApoioservice().converteDataBanco(cliente.getDataNascimento());
		String dataEmissaoNis = ServiceFactory.getApoioservice().converteDataBanco(cliente.getDataEmissaoNis());
		String dataCadastro = ServiceFactory.getApoioservice().converteDataBanco(cliente.getDataCadastro());
		String dataAutoDeclaracao = ServiceFactory.getApoioservice().converteDataBanco(cliente.getDataAutoDeclaracao());
		String dataProc = ServiceFactory.getApoioservice().converteDataBanco(cliente.getDataProc());
		
		int aprovacaoNis = ServiceFactory.getApoioservice().converteBoolean(cliente.isAprovacaoNis());
		int pessoaJuridica = ServiceFactory.getApoioservice().converteBoolean(cliente.isPessoaJuridica());
		
		System.out.println(cliente.getCadastro());
		String query = "INSERT INTO CLIENTES (MUI_CODIGO, EST_SIGLA, PAI_NUMERO, TPD_NUMERO, CAD_CHAVE, CLI_NOME, CLI_CNPJCPF, CLI_DOCUMENTO, "
				+ " CLI_ORGAOEXPEDIDOR, CLI_UFEXPEDIDOR, CLI_TITULOELEITOR, CLI_DTANASCIMENTO, CLI_FONE, CLI_RAMAL, CLI_FONECOMERCIAL, "
				+ " CLI_RAMALCOMERCIAL, CLI_FONECELULAR, CLI_EMAIL, CLI_SENHA, CLI_SEXO, CLI_NOMEPAI, CLI_NOMEMAE, CLI_CONTATO, CLI_NIS, "
				+ " CLI_DTAEMISSAONIS, CLI_APROVACAONIS, CLI_DTAPROCESSAMENTO, CLI_PESSOAJURIDICA, CLI_DATACAD, CLI_DATAAUTODECL, CLI_DATAPROC, "
				+ " CLI_USUARIO, CLI_DATA_ENVIO_SCS, CLI_TIPO_CLIENTE) "
				+ "VALUES ("+cliente.getMunicipioIbge().getId()+", "+cliente.getEstado().getSigla()+", "+cliente.getPais().getId()+", "
				+ "  "+cliente.getTipoDocumento().getId()+", '"+cliente.getCadastro()+"', '"+cliente.getNome()+"', '"+cliente.getCnpjCpf()+"', "
				+ " '"+cliente.getDocumento()+"', '"+cliente.getOrgaoExpedidor()+"', "+cliente.getUfExpedidor().getSigla()+", "
				+ " '"+cliente.getTituloEleitor()+"', "+dataNascimento+", '"+cliente.getFone()+"', "+cliente.getRamal()+", "
				+ " '"+cliente.getFoneComercial()+"', "+cliente.getRamalComercial()+", '"+cliente.getFoneCelular()+"', '"+cliente.getEmail()+"', "
				+ " '"+cliente.getSenha()+"', '"+cliente.getSexo()+"', '"+cliente.getNomePai()+"', '"+cliente.getNomeMae()+"', "
				+ " '"+cliente.getContato()+"', '"+cliente.getNis()+"', "+dataEmissaoNis+", "+aprovacaoNis+", "
				+ "  "+dataProcessamento+", "+pessoaJuridica+", "+dataCadastro+", "+dataAutoDeclaracao+", "
				+ "  "+dataProc+", '"+cliente.getUsuario()+"', '"+envioScs+"','"+cliente.getTipoCliente()+"') ";
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
	public int alterarCliente(Cliente cliente) throws Exception {
		int result = -1;
		String envioScs = ServiceFactory.getApoioservice().converteDataBanco(cliente.getDataEnvioScs());
		String dataProcessamento = ServiceFactory.getApoioservice().converteDataBanco(cliente.getDataProcessamento());
		String dataNascimento = ServiceFactory.getApoioservice().converteDataBanco(cliente.getDataNascimento());
		String dataEmissaoNis = ServiceFactory.getApoioservice().converteDataBanco(cliente.getDataEmissaoNis());
		String dataCadastro = ServiceFactory.getApoioservice().converteDataBanco(cliente.getDataCadastro());
		String dataAutoDeclaracao = ServiceFactory.getApoioservice().converteDataBanco(cliente.getDataAutoDeclaracao());
		String dataProc = ServiceFactory.getApoioservice().converteDataBanco(cliente.getDataProc());
		
		int aprovacaoNis = ServiceFactory.getApoioservice().converteBoolean(cliente.isAprovacaoNis());
		int pessoaJuridica = ServiceFactory.getApoioservice().converteBoolean(cliente.isPessoaJuridica());
		
		System.out.println(cliente.getCadastro());
		String query = "UPDATE CLIENTES SET MUI_CODIGO = "+cliente.getMunicipioIbge().getId()+", EST_SIGLA = "+cliente.getEstado().getSigla()+", "
				+ " PAI_NUMERO = "+cliente.getPais().getId()+", TPD_NUMERO = "+cliente.getTipoDocumento().getId()+", CAD_CHAVE = '"+cliente.getCadastro()+"', "
				+ " CLI_NOME = '"+cliente.getNome()+"', CLI_CNPJCPF = '"+cliente.getCnpjCpf()+"', CLI_DOCUMENTO = '"+cliente.getDocumento()+"', "
				+ " CLI_ORGAOEXPEDIDOR = '"+cliente.getOrgaoExpedidor()+"', CLI_UFEXPEDIDOR = "+cliente.getUfExpedidor().getSigla()+", "
				+ " CLI_TITULOELEITOR = '"+cliente.getTituloEleitor()+"', CLI_DTANASCIMENTO = "+dataNascimento+" , CLI_FONE = '"+cliente.getFone()+"', "
				+ " CLI_RAMAL = "+cliente.getRamal()+", CLI_FONECOMERCIAL = '"+cliente.getFoneComercial()+"', CLI_RAMALCOMERCIAL = "+cliente.getRamalComercial()+", "
				+ " CLI_FONECELULAR = '"+cliente.getFoneCelular()+"', CLI_EMAIL = '"+cliente.getEmail()+"', CLI_SENHA = '"+cliente.getSenha()+"', "
				+ " CLI_SEXO = '"+cliente.getSexo()+"', CLI_NOMEPAI = '"+cliente.getNomePai()+"', CLI_NOMEMAE = '"+cliente.getNomeMae()+"', "
				+ " CLI_CONTATO = '"+cliente.getContato()+"', CLI_NIS = '"+cliente.getNis()+"', CLI_DTAEMISSAONIS = "+dataEmissaoNis+", "
				+ " CLI_APROVACAONIS = "+aprovacaoNis+", CLI_DTAPROCESSAMENTO = "+dataProcessamento+", CLI_PESSOAJURIDICA = "+pessoaJuridica+", "
				+ " CLI_DATACAD = "+dataCadastro+", CLI_DATAAUTODECL = "+dataAutoDeclaracao+", CLI_DATAPROC = "+dataProc+", CLI_USUARIO = '"+cliente.getUsuario()+"' "
				+ " CLI_DATA_ENVIO_SCS = '"+envioScs+"', CLI_TIPO_CLIENTE = '"+cliente.getTipoCliente()+"' WHERE CLI_NUMERO = " + cliente.getId() + " ";
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
	public int excluirCliente(Cliente cliente) throws Exception {
		int result = -1;
		String query = "DELETE FROM CLIENTES WHERE CLI_NUMERO = " + cliente.getId() + " ";
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
	public ResultSet pesquisaClientes() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM CLIENTES";
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
	public ResultSet pesquisaCliente(int id) throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM CLIENTESWHERE CLI_NUMERO = " + id + " ";
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
