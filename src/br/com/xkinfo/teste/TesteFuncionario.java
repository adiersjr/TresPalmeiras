package br.com.xkinfo.teste;

import java.util.ArrayList;
import br.com.xkinfo.model.Funcionario;
import br.com.xkinfo.service.ServiceFactory;

public class TesteFuncionario {

	public static void main(String[] args) {

		// TESTE DE INCLUSAO
		/*String nome = "Alexandre";
		boolean situacao = true;
		String usuario = "j";
		String senha = "123";
		String pathFoto = "null"; 
		Calendar dataNascimento = Calendar.getInstance();
		Cargo cargo = null;
		try {
			cargo = ServiceFactory.getCargoservice().pesquisaCargo(1);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		boolean controleAcesso = false;

		try {
			ServiceFactory.getFuncionarioservice().incluirFuncionario(nome, situacao, usuario, senha, pathFoto, dataNascimento, cargo, controleAcesso);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		// TESTE DE ALTERACAO
		/*String nome = "Alexandre";
		boolean situacao = true;
		String usuario = "japones";
		String senha = "123";
		String pathFoto = "null"; 
		Calendar dataNascimento = Calendar.getInstance();
		Cargo cargo = null;
		int id = 23;
		try {
			cargo = ServiceFactory.getCargoservice().pesquisaCargo(1);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		boolean controleAcesso = false;
		try {
			ServiceFactory.getFuncionarioservice().alterarFuncionario(id, nome, situacao, usuario, senha, pathFoto, dataNascimento, cargo, controleAcesso);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		// TESTE DE EXCLUSÃO
		/*int idDelete = 17;
		try {
			ServiceFactory.getFuncionarioservice().excluirFuncionario(idDelete);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		// TESTE DE PESQUISA GERAL
		try {
			ArrayList<Funcionario> funcionarios = ServiceFactory.getFuncionarioservice().pesquisaFuncionarios();
			for (Funcionario funcionario : funcionarios) {
				String dia = ServiceFactory.getApoioservice().converteDataBrasil(funcionario.getDataNascimento());
				System.out.println(funcionario.getId() + " " + funcionario.getNome() + " " +  dia);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// TESTE DE PESQUISA PARCIAL PELO NOME
		/*try {
			ArrayList<Funcionario> funcionarios = ServiceFactory.getFuncionarioservice().pesquisaNome("and");
			for (Funcionario funcionario : funcionarios) {
				System.out.println(funcionario.getId() + " " + funcionario.getNome());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		// TESTE DE PESQUISA PARCIAL PELO USUARIO
		/*try {
			ArrayList<Funcionario> funcionarios = ServiceFactory.getFuncionarioservice().pesquisaUsuario("es");
			for (Funcionario funcionario : funcionarios) {
				System.out.println(funcionario.getId() + " " + funcionario.getNome());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}

}
