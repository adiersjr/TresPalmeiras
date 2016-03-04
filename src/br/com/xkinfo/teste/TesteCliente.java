package br.com.xkinfo.teste;

/*import java.util.Calendar;
import br.com.xkinfo.model.Estado;
import br.com.xkinfo.model.MunicipioIbge;
import br.com.xkinfo.model.Pais;
import br.com.xkinfo.model.TipoDocumento;*/
import br.com.xkinfo.service.ServiceFactory;

public class TesteCliente {

	public static void main(String[] args) {

		/*MunicipioIbge municipioIbge = null;
		Estado estado = null ;
		Pais pais = null;
		TipoDocumento tipoDocumento = null;
		Estado ufExpedidor = null;
		try {
			municipioIbge = ServiceFactory.getMunicipioibgeservice().pesquisaMunicipio(2);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			estado = ServiceFactory.getEstadoservice().pesquisaEstado(1);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			pais = ServiceFactory.getPaisservice().pesquisaPais(2);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			tipoDocumento = ServiceFactory.getTipodocumentoservice().pesquisaTipoDocumento(2);
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
		char sexo = 'F';
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
		String tipoCliente = "";*/
		int id = 11;

		try {
			ServiceFactory.getClienteservice().excluirCliente(id);
		} catch (Exception e) {
			e.printStackTrace();
		}


	}}
