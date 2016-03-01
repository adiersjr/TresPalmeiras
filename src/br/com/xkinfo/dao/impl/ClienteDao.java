package br.com.xkinfo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.xkinfo.dao.IClienteDao;
import br.com.xkinfo.model.Cliente;
import br.com.xkinfo.util.Conexao;

public class ClienteDao implements IClienteDao {
	
	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirCliente(Cliente cliente) throws Exception {
		int result = -1;
		String query = "INSERT INTO CLIENTES (MUI_CODIGO, EST_SIGLA, PAI_NUMERO, TPD_NUMERO, CAD_CHAVE, CLI_NOME, CLI_CNPJCPF, CLI_DOCUMENTO, "
				+ " CLI_ORGAOEXPEDIDOR, CLI_UFEXPEDIDOR, CLI_TITULOELEITOR, CLI_DTANASCIMENTO, CLI_FONE, CLI_RAMAL, CLI_FONECOMERCIAL, "
				+ " CLI_RAMALCOMERCIAL, CLI_FONECELULAR, CLI_EMAIL, CLI_SENHA, CLI_SEXO, CLI_NOMEPAI, CLI_NOMEMAE, CLI_CONTATO, CLI_NIS, "
				+ " DTAEMISSAONIS, CLI_APROVACAONIS, CLI_DTAPROCESSAMENTO, CLI_PESSOAJURIDICA, CLI_DATACAD, CLI_DATAAUTODECL, CLI_DATAPROC, "
				+ " CLI_USUARIO, CLI_DATA_ENVIO_SCS, CLI_TIPO_CLIENTE) "
				+ "VALUES ("+cliente.getMunicipio().getId()+", "+cliente.getEstado().getSigla()+", "+cliente.getPais().getId()+", "
				+ " "+cliente.getTipoDocumento().getId()+", '"+cliente.getCadastro()+"', '"+cliente.getNome()+"', '"+cliente.getCnpjCpf()+"', "
				+ " '"+cliente.getDocumento()+"', '"+cliente.getOrgaoExpedidor()+"', '"+cliente.getUfExpedidor().getSigla()+"', "
				+ " '"+cliente.getTituloEleitor()+"', '"+cliente.getDataNascimento()+"', '"+cliente.getFone()+"', '"+cliente.getRamal()+"' "
						+ " '"+cliente.getFoneComercial()+""',    "
				+ ") ";
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int excluirCliente(Cliente cliente) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ResultSet pesquisaClientes() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet pesquisarNome(String nome) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet pesquisaCnpjCpj(String cnpjCpf) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}
