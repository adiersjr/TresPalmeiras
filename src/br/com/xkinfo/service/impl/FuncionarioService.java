package br.com.xkinfo.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.model.Cargo;
import br.com.xkinfo.model.Funcionario;
import br.com.xkinfo.service.IFuncionarioService;
import br.com.xkinfo.service.ServiceFactory;

public class FuncionarioService implements IFuncionarioService{

	private Funcionario funcionario;

	@Override
	public void incluirFuncionario(String nome, boolean situacao, String usuario, String senha, String pathFoto,
			Calendar dataNascimento, Cargo cargo, boolean controleAcesso) throws Exception {
		String validaNome = nome.replaceAll(" ", "");
		String validaUsuario = usuario.replaceAll(" ", "");
		String validaSenha = senha.replaceAll(" ", "");
		String validaPath = pathFoto.replaceAll(" ", "");
		String valida = "";;

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
		if (dataNascimento.equals(null)) {
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
			funcionario.setDataNascimento(dataNascimento);
			funcionario.setCargo(cargo);
			funcionario.setControleAcesso(controleAcesso);
			int ret = DaoFactory.getFuncionariodao().incluirFuncionario(funcionario);
			if (ret == 1){
				System.out.println("Inclusão efetuada com Sucesso!");
			}
		} else {
			System.out.println("Favor preencher os seguintes campos: \n" + valida);
		}
	}

	@Override
	public void alterarFuncionario(int id, String nome, boolean situacao, String usuario, String senha, String pathFoto,
			Calendar dataNascimento, Cargo cargo, boolean controleAcesso) throws Exception {
		String validaNome = nome.replaceAll(" ", "");
		String validaUsuario = usuario.replaceAll(" ", "");
		String validaSenha = senha.replaceAll(" ", "");
		String validaPath = pathFoto.replaceAll(" ", "");
		String valida = "";;

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
		if (dataNascimento.equals(null)) {
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
			funcionario.setDataNascimento(dataNascimento);
			funcionario.setCargo(cargo);
			funcionario.setControleAcesso(controleAcesso);
			int ret = DaoFactory.getFuncionariodao().alterarFuncionario(funcionario);
			if (ret == 1){
				System.out.println("Alteração efetuada com Sucesso!");
			}
		} else {
			System.out.println("Favor preencher os seguintes campos: \n" + valida);
		}
	}

	@Override
	public void excluirFuncionario(int id) throws Exception {
		Funcionario funcionario = pesquisaFuncionario(id);
		int ret = DaoFactory.getFuncionariodao().excluirFuncionario(funcionario);
		if (ret == 1){
			System.out.println("Exclusão efetuada com sucesso!");
		}
		if (ret == 0){
			System.out.println("Registro não existe, favor verificar!");
		}
	}

	@Override
	public ArrayList<Funcionario> pesquisaFuncionarios() throws Exception {
		ResultSet rs = DaoFactory.getFuncionariodao().pesquisaFuncionarios();
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		while(rs.next()){
			Funcionario funcionario = new Funcionario();
			funcionario.setId(rs.getInt("FUN_NUMERO"));
			funcionario.setNome(rs.getString("FUN_NOME"));
			funcionario.setSituacao(rs.getBoolean("FUN_SITUACAO"));
			funcionario.setUsuario(rs.getString("FUN_USUARIO"));
			funcionario.setSenha(rs.getString("FUN_SENHA"));
			funcionario.setPathFoto(rs.getString("FUN_PATHFOTO"));
			Date nascimento = rs.getDate("FUN_DATNASC");
			Calendar cal = Calendar.getInstance();
			cal.setTime(nascimento);
			funcionario.setDataNascimento(cal);
			Cargo cargo = ServiceFactory.getCargoservice().pesquisaCargo(rs.getInt("CAR_NUMERO"));
			funcionario.setCargo(cargo);
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
			System.out.println("Campo nome é obrigatório!");
		} else {
			ResultSet rs = DaoFactory.getFuncionariodao().pesquisaNome(nome);
			while(rs.next()){
				Funcionario funcionario = new Funcionario();
				funcionario.setId(rs.getInt("FUN_NUMERO"));
				funcionario.setNome(rs.getString("FUN_NOME"));
				funcionario.setSituacao(rs.getBoolean("FUN_SITUACAO"));
				funcionario.setUsuario(rs.getString("FUN_USUARIO"));
				funcionario.setSenha(rs.getString("FUN_SENHA"));
				funcionario.setPathFoto(rs.getString("FUN_PATHFOTO"));
				Date nascimento = rs.getDate("FUN_DATNASC");
				Calendar cal = Calendar.getInstance();
				cal.setTime(nascimento);
				funcionario.setDataNascimento(cal);
				Cargo cargo = ServiceFactory.getCargoservice().pesquisaCargo(rs.getInt("CAR_NUMERO"));
				funcionario.setCargo(cargo);
				funcionario.setControleAcesso(rs.getBoolean("FUN_CONTROLEACESSO"));
				funcionarios.add(funcionario);
			}
			if (funcionarios.size() == 0){
				System.out.println("Não possui dados com esse argumento!");
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
			System.out.println("Campo nome é obrigatório!");
		} else {
			ResultSet rs = DaoFactory.getFuncionariodao().pesquisaUsuario(usuario);
			while(rs.next()){
				Funcionario funcionario = new Funcionario();
				funcionario.setId(rs.getInt("FUN_NUMERO"));
				funcionario.setNome(rs.getString("FUN_NOME"));
				funcionario.setSituacao(rs.getBoolean("FUN_SITUACAO"));
				funcionario.setUsuario(rs.getString("FUN_USUARIO"));
				funcionario.setSenha(rs.getString("FUN_SENHA"));
				funcionario.setPathFoto(rs.getString("FUN_PATHFOTO"));
				Date nascimento = rs.getDate("FUN_DATNASC");
				Calendar cal = Calendar.getInstance();
				cal.setTime(nascimento);
				funcionario.setDataNascimento(cal);
				Cargo cargo = ServiceFactory.getCargoservice().pesquisaCargo(rs.getInt("CAR_NUMERO"));
				funcionario.setCargo(cargo);
				funcionario.setControleAcesso(rs.getBoolean("FUN_CONTROLEACESSO"));
				funcionarios.add(funcionario);
			}
			if (funcionarios.size() == 0){
				System.out.println("Não possui dados com esse argumento!");
			}
			return funcionarios;
		}
		return funcionarios;
	}

	@Override
	public Funcionario pesquisaFuncionario(int id) throws Exception {
		ResultSet rs = DaoFactory.getFuncionariodao().pesquisaFuncionario(id);
		Funcionario funcionario = new Funcionario();
		while(rs.next()){
			funcionario.setId(rs.getInt("FUN_NUMERO"));
			funcionario.setNome(rs.getString("FUN_NOME"));
			funcionario.setSituacao(rs.getBoolean("FUN_SITUACAO"));
			funcionario.setUsuario(rs.getString("FUN_USUARIO"));
			funcionario.setSenha(rs.getString("FUN_SENHA"));
			funcionario.setPathFoto(rs.getString("FUN_PATHFOTO"));
			Date nascimento = rs.getDate("FUN_DATNASC");
			Calendar cal = Calendar.getInstance();
			cal.setTime(nascimento);
			funcionario.setDataNascimento(cal);
			Cargo cargo = ServiceFactory.getCargoservice().pesquisaCargo(rs.getInt("CAR_NUMERO"));
			funcionario.setCargo(cargo);
			funcionario.setControleAcesso(rs.getBoolean("FUN_CONTROLEACESSO"));
		}
		return funcionario; 
	}
}
