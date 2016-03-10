package br.com.xkinfo.cadastro.dao;

import java.sql.ResultSet;
import br.com.xkinfo.cadastro.model.Proprietario;

public interface IProprietarioDao {
	
	public int incluirProprietario(Proprietario proprietario) throws Exception;
	
	public int alterarProprietario(Proprietario proprietario) throws Exception;
	
	public int excluirProprietario(Proprietario proprietario) throws Exception;
	
	public ResultSet pesquisarProprietarios() throws Exception;
	
	public ResultSet pesquisarProprietario(int id) throws Exception;

}
