package br.com.xkinfo.pessoa.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.pessoa.model.Cargo;
import br.com.xkinfo.pessoa.service.ICargoService;

public class CargoService implements ICargoService {
	
	private Cargo cargo;

	@Override
	public void incluirCargo(String descricao) throws Exception {
		String valida = descricao.replaceAll(" ", "");
		if(valida.isEmpty()){
			System.out.println("Campo descri��o do cargo � obrigat�rio!");
		}else {
			cargo = new Cargo();
			cargo.setDescricao(descricao);
			int ret = DaoFactory.getCargoDao().incluirCargo(cargo);
			if (ret == 1){
				System.out.println("Inclus�o efetuada com Sucesso!");
			}		
		}
	}

	@Override
	public void alterarCargo(int id, String descricao) throws Exception {
		String valida = descricao.replaceAll(" ", "");
		if(valida.isEmpty()){
			System.out.println("Campo descri��o do cargo � obrigat�rio!");
		} else {
			cargo = new Cargo();
			cargo.setId(id);
			cargo.setDescricao(descricao);
			int ret = DaoFactory.getCargoDao().alterarCargo(cargo);
			if (ret == 1){
				System.out.println("Altera��o efetuada com sucesso!");
			}
			if (ret == 0){
				System.out.println("Registro n�o existe, favor verificar!");
			}
		}
	}

	@Override
	public void excluirCargo(int id) throws Exception {
		cargo = pesquisaCargo(id);
		int ret = DaoFactory.getCargoDao().excluirCargo(cargo);
		if (ret == 1){
			System.out.println("Exclus�o efetuada com sucesso!");
		}
		if (ret == 0){
			System.out.println("Registro n�o existe, favor verificar!");
		}
	}

	@Override
	public ArrayList<Cargo> pesquisaCargos() throws Exception {
		ResultSet rs = DaoFactory.getCargoDao().pesquisaCargos();
		ArrayList<Cargo> cargos = new ArrayList<>();
		while(rs.next()){
			cargo = new Cargo();
			cargo.setId(rs.getInt("CAR_NUMERO"));
			cargo.setDescricao(rs.getString("CAR_NOME"));
			cargos.add(cargo);
		}
		return cargos; 
	}

	@Override
	public ArrayList<Cargo> pesquisaDescricao(String descricao) throws Exception{
		String valida = descricao.replaceAll(" ", "");
		ArrayList<Cargo> cargos = new ArrayList<>();
		if(valida.isEmpty()){
			System.out.println("Campo descri��o do cargo � obrigat�rio!");
		} else {
			ResultSet rs = DaoFactory.getCargoDao().pesquisaDescricao(descricao);
			while(rs.next()){
				Cargo cargo = new Cargo();
				cargo.setId(rs.getInt("CAR_NUMERO"));
				cargo.setDescricao(rs.getString("CAR_NOME"));
				cargos.add(cargo);
			}
			if (cargos.size() == 0){
				System.out.println("N�o possui dados com esse argumento!");
			} else {
				return cargos;
			}
		}
		return cargos; 
	};

	@Override
	public Cargo pesquisaCargo(int id) throws Exception{
		ResultSet rs = DaoFactory.getCargoDao().pesquisaCargo(id);
		cargo = new Cargo();
		while(rs.next()){
			cargo.setId(rs.getInt("CAR_NUMERO"));
			cargo.setDescricao(rs.getString("CAR_NOME"));
		}
		return cargo; 
	};

	

}
