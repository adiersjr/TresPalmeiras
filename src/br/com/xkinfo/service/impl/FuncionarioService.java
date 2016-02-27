package br.com.xkinfo.service.impl;

import java.util.ArrayList;
import java.util.Calendar;

import br.com.xkinfo.model.Cargo;
import br.com.xkinfo.model.Funcionario;
import br.com.xkinfo.service.IFuncionarioService;

public class FuncionarioService implements IFuncionarioService{
	
	private Funcionario funcionario;

	@Override
	public void incluirFuncionario(String nome, boolean situacao, String usuario, String senha, String pathFoto,
			Calendar dataNascimento, Cargo cargo, boolean controleAcesso) throws Exception {
		funcionario = new Funcionario();
		funcionario.setNome(nome);
		funcionario.setSituacao(situacao);
		funcionario.setUsuario(usuario);
		funcionario.setSenha(senha);
		funcionario.setPathFoto(pathFoto);
		funcionario.setDataNascimento(dataNascimento);
		funcionario.setCargo(cargo);
		funcionario.setControleAcesso(controleAcesso);
		
	}

	@Override
	public void alterarFuncionario(int id, String nome, boolean situacao, String usuario, String senha, String pathFoto,
			Calendar dataNascimento, Cargo cargo, boolean controleAcesso) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirFuncionario(int id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Funcionario> pesquisaFuncionarios() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Funcionario> pesquisaNome(String nome) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Funcionario> pesquisaUsuario(String usuario) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Funcionario pesquisaFuncionario(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
