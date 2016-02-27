package br.com.xkinfo.service;

import java.util.ArrayList;
import java.util.Calendar;

import br.com.xkinfo.model.Cargo;
import br.com.xkinfo.model.Funcionario;

public interface IFuncionarioService {

	public void incluirFuncionario(String nome, boolean situacao, String usuario, String senha, String pathFoto,
			Calendar dataNascimento, Cargo cargo, boolean controleAcesso) throws Exception;

	public void alterarFuncionario(int id, String nome, boolean situacao, String usuario, String senha, String pathFoto,
			Calendar dataNascimento, Cargo cargo, boolean controleAcesso) throws Exception;

	public void excluirFuncionario(int id) throws Exception;

	public ArrayList<Funcionario> pesquisaFuncionarios() throws Exception;

	public ArrayList<Funcionario> pesquisaNome(String nome) throws Exception;
	
	public ArrayList<Funcionario> pesquisaUsuario(String usuario) throws Exception;

	public Funcionario pesquisaFuncionario(int id) throws Exception;
}
