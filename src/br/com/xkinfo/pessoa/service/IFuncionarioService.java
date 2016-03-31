package br.com.xkinfo.pessoa.service;

import java.util.ArrayList;

import br.com.xkinfo.pessoa.model.Cargo;
import br.com.xkinfo.pessoa.model.Funcionario;

public interface IFuncionarioService {

	public boolean incluirFuncionario(String nome, boolean situacao, String usuario, String senha, String pathFoto,
			String dataNascimento, Cargo cargo, boolean controleAcesso) throws Exception;

	public boolean alterarFuncionario(int id, String nome, boolean situacao, String usuario, String senha, String pathFoto,
			String dataNascimento, Cargo cargo, boolean controleAcesso) throws Exception;

	public boolean excluirFuncionario(int id) throws Exception;

	public ArrayList<Funcionario> pesquisaFuncionarios() throws Exception;

	public ArrayList<Funcionario> pesquisaNome(String nome) throws Exception;
	
	public ArrayList<Funcionario> pesquisaUsuario(String usuario) throws Exception;

	public Funcionario pesquisaFuncionario(int id) throws Exception;
}
