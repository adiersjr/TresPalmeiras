package br.com.xkinfo.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.model.Cargo;
import br.com.xkinfo.service.ICargoService;

public class CargoService implements ICargoService {

	@Override
	public void incluirCargo(String descricao) throws Exception {
		Cargo cargo = new Cargo();
		cargo.setDescricao(descricao);
		int ret = DaoFactory.getCargodao().incluirCargo(cargo);
		if (ret == 1){
			System.out.println("Inclusão efetuada com Sucesso!");
		}
	}

	@Override
	public void alterarCargo(int id, String descricao) throws Exception {
		Cargo cargo = new Cargo();
		cargo.setId(id);
		cargo.setDescricao(descricao);
		int ret = DaoFactory.getCargodao().alterarCargo(cargo);
		if (ret == 1){
			System.out.println("Alteração efetuada com sucesso!");
		}
		if (ret == 0){
			System.out.println("Registro não existe, favor verificar!");
		}
	}

	@Override
	public void excluirCargo(int id) throws Exception {
		Cargo cargo = listaCargo(id);
		int ret = DaoFactory.getCargodao().excluirCargo(cargo);
		if (ret == 1){
			System.out.println("Exclusão efetuada com sucesso!");
		}
		if (ret == 0){
			System.out.println("Registro não existe, favor verificar!");
		}
	}

	@Override
	public ArrayList<Cargo> listaCargos() throws Exception {
		ResultSet rs = DaoFactory.getCargodao().listaCargos();
		ArrayList<Cargo> cargos = new ArrayList<>();
		while(rs.next()){
			Cargo cargo = new Cargo();
			cargo.setId(rs.getInt("CAR_NUMERO"));
			cargo.setDescricao(rs.getString("CAR_NOME"));
			cargos.add(cargo);
		}
		return cargos; 
	}

	public ArrayList<Cargo> listaDescricao(String descricao) throws Exception{
		ResultSet rs = DaoFactory.getCargodao().listaDescricao(descricao);
		ArrayList<Cargo> cargos = new ArrayList<>();
		while(rs.next()){
			Cargo cargo = new Cargo();
			cargo.setId(rs.getInt("CAR_NUMERO"));
			cargo.setDescricao(rs.getString("CAR_NOME"));
			cargos.add(cargo);
		}
		if (cargos.size() == 0){
			System.out.println("Não possui dados com esse argumento!");
		}
		return cargos; 
	};

	public Cargo listaCargo(int id) throws Exception{
		ResultSet rs = DaoFactory.getCargodao().listaCargo(id);
		Cargo cargo = new Cargo();
		while(rs.next()){
			cargo.setId(rs.getInt("CAR_NUMERO"));
			cargo.setDescricao(rs.getString("CAR_NOME"));
		}
		return cargo; 
	};
}
