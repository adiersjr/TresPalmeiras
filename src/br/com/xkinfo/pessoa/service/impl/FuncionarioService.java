package br.com.xkinfo.pessoa.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.pessoa.model.Cargo;
import br.com.xkinfo.pessoa.model.Funcionario;
import br.com.xkinfo.pessoa.service.IFuncionarioService;
import br.com.xkinfo.service.ServiceFactory;

public class FuncionarioService implements IFuncionarioService{

	private Funcionario funcionario;

	@Override
	public boolean incluirFuncionario(String nome, boolean situacao, String usuario, String senha, String pathFoto,
			String dataNascimento, Cargo cargo, boolean controleAcesso) throws Exception {
		String validaNome = nome.replaceAll(" ", "");
		String validaUsuario = usuario.replaceAll(" ", "");
		String validaSenha = senha.replaceAll(" ", "");
		String validaPath = pathFoto.replaceAll(" ", "");
		String valida = "";
		String validaNascimento = dataNascimento.replaceAll(" ", "");

		if (validaNome.isEmpty()) {
			valida = "Nome \n";
		}
		if (validaUsuario.isEmpty()) {
			valida = valida + "Usuario \n";
		}
		if (validaSenha.isEmpty()) {
			valida = valida + "Senha \n";
		}
		if (validaPath.isEmpty()) {
			valida = valida + "PathFoto \n";
		}
		if (dataNascimento.equals(null) || validaNascimento.isEmpty()) {
			valida = valida + "Data Nascimento \n";
		}
		if (cargo.equals(null)) {
			valida = valida + "Cargo \n";
		}
		

		if (valida.isEmpty()) {
			funcionario = new Funcionario();
			funcionario.setNome(nome);
			funcionario.setSituacao(situacao);
			funcionario.setUsuario(usuario);
			funcionario.setSenha(senha);
			funcionario.setPathFoto(pathFoto);
			funcionario.setDataNascimento(ServiceFactory.getApoioservice().converteStringCalendar(dataNascimento));
			funcionario.setCargo(cargo);
			funcionario.setControleAcesso(controleAcesso);
			int ret = DaoFactory.getFuncionarioDao().incluirFuncionario(funcionario);
			if (ret == 1){
				System.out.println("Inclusão efetuada com Sucesso!");
			}
		} else {
			System.out.println("Favor preencher os seguintes campos: \n" + valida);
		}
		return false;
	}

	@Override
	public boolean alterarFuncionario(int id, String nome, boolean situacao, String usuario, String senha, String pathFoto,
			String dataNascimento, Cargo cargo, boolean controleAcesso) throws Exception {
		String validaNome = nome.replaceAll(" ", "");
		String validaUsuario = usuario.replaceAll(" ", "");
		String validaSenha = senha.replaceAll(" ", "");
		String validaPath = pathFoto.replaceAll(" ", "");
		String valida = "";
		String validaNascimento = dataNascimento.replaceAll(" ", "");

		if (validaNome.isEmpty()) {
			valida = "Nome \n";
		}
		if (validaUsuario.isEmpty()) {
			valida = valida + "Usuario \n";
		}
		if (validaSenha.isEmpty()) {
			valida = valida + "Senha \n";
		}
		if (validaPath.isEmpty()) {
			valida = valida + "PathFoto \n";
		}
		if (dataNascimento.equals(null) || validaNascimento.isEmpty()) {
			valida = valida + "Data Nascimento \n";
		}
		if (cargo.equals(null)) {
			valida = valida + "Cargo \n";
		}

		if (valida.isEmpty()) {
			funcionario = new Funcionario();
			funcionario.setId(id);
			funcionario.setNome(nome);
			funcionario.setSituacao(situacao);
			funcionario.setUsuario(usuario);
			funcionario.setSenha(senha);
			funcionario.setPathFoto(pathFoto);
			funcionario.setDataNascimento(ServiceFactory.getApoioservice().converteStringCalendar(dataNascimento));
			funcionario.setCargo(cargo);
			funcionario.setControleAcesso(controleAcesso);
			int ret = DaoFactory.getFuncionarioDao().alterarFuncionario(funcionario);
			if (ret == 1){
				System.out.println("Alteraï¿½ï¿½o efetuada com Sucesso!");
			}
		} else {
			System.out.println("Favor preencher os seguintes campos: \n" + valida);
		}
		return false;
	}

	@Override
	public boolean excluirFuncionario(int id) throws Exception {
		Funcionario funcionario = pesquisaFuncionario(id);
		int ret = DaoFactory.getFuncionarioDao().excluirFuncionario(funcionario);
		if (ret == 1){
			System.out.println("Exclusï¿½o efetuada com sucesso!");
		}
		if (ret == 0){
			System.out.println("Registro nï¿½o existe, favor verificar!");
		}
		return false;
	}

	@Override
	public ArrayList<Funcionario> pesquisaFuncionarios() throws Exception {
		ResultSet rs = DaoFactory.getFuncionarioDao().pesquisaFuncionarios();
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		while(rs.next()){
			Funcionario funcionario = new Funcionario();
			funcionario.setId(rs.getInt("FUN_NUMERO"));
			funcionario.setNome(rs.getString("FUN_NOME"));
			funcionario.setSituacao(rs.getBoolean("FUN_SITUACAO"));
			funcionario.setUsuario(rs.getString("FUN_USUARIO"));
			funcionario.setSenha(rs.getString("FUN_SENHA"));
			funcionario.setPathFoto(rs.getString("FUN_PATHFOTO"));
			funcionario.setDataNascimento(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("FUN_DATNASC")));
			funcionario.setCargo(ServiceFactory.getCargoservice().pesquisaCargo(rs.getInt("CAR_NUMERO")));
			funcionario.setControleAcesso(rs.getBoolean("FUN_CONTROLEACESSO"));
			funcionarios.add(funcionario);
		}
		return funcionarios;
	}

	@Override
	public ArrayList<Funcionario> pesquisaNome(String nome) throws Exception {
		String valida = nome.replaceAll(" ", "");
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		if(valida.isEmpty()){
			System.out.println("Campo nome ï¿½ obrigatï¿½rio!");
		} else {
			ResultSet rs = DaoFactory.getFuncionarioDao().pesquisaNome(nome);
			while(rs.next()){
				Funcionario funcionario = new Funcionario();
				funcionario.setId(rs.getInt("FUN_NUMERO"));
				funcionario.setNome(rs.getString("FUN_NOME"));
				funcionario.setSituacao(rs.getBoolean("FUN_SITUACAO"));
				funcionario.setUsuario(rs.getString("FUN_USUARIO"));
				funcionario.setSenha(rs.getString("FUN_SENHA"));
				funcionario.setPathFoto(rs.getString("FUN_PATHFOTO"));
				funcionario.setDataNascimento(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("FUN_DATNASC")));
				funcionario.setCargo(ServiceFactory.getCargoservice().pesquisaCargo(rs.getInt("CAR_NUMERO")));
				funcionario.setControleAcesso(rs.getBoolean("FUN_CONTROLEACESSO"));
				funcionarios.add(funcionario);
			}
			if (funcionarios.size() == 0){
				System.out.println("Nï¿½o possui dados com esse argumento!");
			}
			return funcionarios;
		}
		return funcionarios;
	}

	@Override
	public ArrayList<Funcionario> pesquisaUsuario(String usuario) throws Exception {
		String valida = usuario.replaceAll(" ", "");
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		if(valida.isEmpty()){
			System.out.println("Campo nome ï¿½ obrigatï¿½rio!");
		} else {
			ResultSet rs = DaoFactory.getFuncionarioDao().pesquisaUsuario(usuario);
			while(rs.next()){
				Funcionario funcionario = new Funcionario();
				funcionario.setId(rs.getInt("FUN_NUMERO"));
				funcionario.setNome(rs.getString("FUN_NOME"));
				funcionario.setSituacao(rs.getBoolean("FUN_SITUACAO"));
				funcionario.setUsuario(rs.getString("FUN_USUARIO"));
				funcionario.setSenha(rs.getString("FUN_SENHA"));
				funcionario.setPathFoto(rs.getString("FUN_PATHFOTO"));
				funcionario.setDataNascimento(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("FUN_DATNASC")));
				funcionario.setCargo(ServiceFactory.getCargoservice().pesquisaCargo(rs.getInt("CAR_NUMERO")));
				funcionario.setControleAcesso(rs.getBoolean("FUN_CONTROLEACESSO"));
				funcionarios.add(funcionario);
			}
			if (funcionarios.size() == 0){
				System.out.println("Nï¿½o possui dados com esse argumento!");
			}
			return funcionarios;
		}
		return funcionarios;
	}

	@Override
	public Funcionario pesquisaFuncionario(int id) throws Exception {
		ResultSet rs = DaoFactory.getFuncionarioDao().pesquisaFuncionario(id);
		Funcionario funcionario = new Funcionario();
		while(rs.next()){
			funcionario.setId(rs.getInt("FUN_NUMERO"));
			funcionario.setNome(rs.getString("FUN_NOME"));
			funcionario.setSituacao(rs.getBoolean("FUN_SITUACAO"));
			funcionario.setUsuario(rs.getString("FUN_USUARIO"));
			funcionario.setSenha(rs.getString("FUN_SENHA"));
			funcionario.setPathFoto(rs.getString("FUN_PATHFOTO"));
			funcionario.setDataNascimento(ServiceFactory.getApoioservice().converteCalendar(rs.getDate("FUN_DATNASC")));
			funcionario.setCargo(ServiceFactory.getCargoservice().pesquisaCargo(rs.getInt("CAR_NUMERO")));
			funcionario.setControleAcesso(rs.getBoolean("FUN_CONTROLEACESSO"));
		}
		return funcionario; 
	}
}
