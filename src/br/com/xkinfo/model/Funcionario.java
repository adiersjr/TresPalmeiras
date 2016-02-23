package br.com.xkinfo.model;

import java.util.Calendar;

public class Funcionario {

	private int id;
	private String nome;
	private boolean situacao;
	private String usuario;
	private String senha;
	private String pathFoto;
	private Calendar dataNascimento;
	private Cargo cargo;
	private boolean controleAcesso;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getPathFoto() {
		return pathFoto;
	}
	public void setPathFoto(String pathFoto) {
		this.pathFoto = pathFoto;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public boolean isControleAcesso() {
		return controleAcesso;
	}
	public void setControleAcesso(boolean controleAcesso) {
		this.controleAcesso = controleAcesso;
	}
}
