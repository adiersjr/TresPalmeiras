package br.com.xkinfo.dao.impl;

import java.sql.SQLException;
import java.sql.Statement;

import br.com.xkinfo.model.Cargo;
import br.com.xkinfo.dao.ICargoDao;
import br.com.xkinfo.util.Conexao;

public class CargoDao implements ICargoDao{
	
	Conexao conexao = new Conexao();

	@Override
	public int incluirCargo(Cargo cargo) throws Exception {
		Statement st;
		int result = -1;
		String query = "INSERT INTO CARGOS (CAR_NOME) VALUES (' " + cargo.getDescricao() + " ') ";
		try {
			st = conexao.connect().createStatement();
			result = st.executeUpdate(query);
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public void alterarCargo() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirCargo() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listaCargo() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
