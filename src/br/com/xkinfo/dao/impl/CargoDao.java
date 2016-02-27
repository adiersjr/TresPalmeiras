package br.com.xkinfo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.xkinfo.model.Cargo;
import br.com.xkinfo.dao.ICargoDao;
import br.com.xkinfo.util.Conexao;

public class CargoDao implements ICargoDao{

	Conexao conexao = new Conexao();
	private Statement st;

	@Override
	public int incluirCargo(Cargo cargo) throws Exception {
		int result = -1;
		String query = "INSERT INTO CARGOS (CAR_NOME) VALUES (' " + cargo.getDescricao() + " ') ";
		try {
			st = conexao.connect().createStatement();
			result = st.executeUpdate(query);
			conexao.connect().close();
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int alterarCargo(Cargo cargo) throws Exception {
		int result = -1;
		String query = "UPDATE CARGOS SET CAR_NOME = ' " + cargo.getDescricao() + " ' WHERE CAR_NUMERO = " + cargo.getId() + " ";
		try {
			st = conexao.connect().createStatement();
			result = st.executeUpdate(query);
			conexao.connect().close();
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int excluirCargo(Cargo cargo) throws Exception {
		int result = -1;
		String query = "DELETE FROM CARGOS WHERE CAR_NUMERO = " + cargo.getId() + " ";
		try {
			st = conexao.connect().createStatement();
			result = st.executeUpdate(query);
			conexao.connect().close();
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public ResultSet listaCargos() throws Exception {
		ResultSet rs = null;
		String query = "SELECT * FROM CARGOS";
		try {
			st = conexao.connect().createStatement();
			rs = st.executeQuery(query);
			conexao.connect().close();
			return rs;
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		return rs;
	}

	public ResultSet listaDescricao(String descricao) throws Exception{
		ResultSet rs = null;
		String query = "SELECT * FROM CARGOS WHERE CAR_NOME LIKE '%" + descricao + "%' ";
		try {
			st = conexao.connect().createStatement();
			rs = st.executeQuery(query);
			conexao.connect().close();
			return rs;
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		return rs;
	};

	public ResultSet listaCargo(int id) throws Exception{
		ResultSet rs = null;
		String query = "SELECT * FROM CARGOS WHERE CAR_NUMERO = " + id;
		try {
			st = conexao.connect().createStatement();
			rs = st.executeQuery(query);
			conexao.connect().close();
			return rs;
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		return rs;
	};
}
