package br.com.xkinfo.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.model.Cargo;
import br.com.xkinfo.service.ICargoService;

public class CargoService implements ICargoService {
	
	private Cargo cargo;

	@Override
	public void incluirCargo(String descricao) throws Exception {
		String valida = descricao.replaceAll(" ", "");
		if(valida.isEmpty()){
			System.out.println("Campo descrição do cargo é obrigatório!");
		}else {
			cargo = new Cargo();
			cargo.setDescricao(descricao);
			int ret = DaoFactory.getCargodao().incluirCargo(cargo);
			if (ret == 1){
				System.out.println("Inclusão efetuada com Sucesso!");
			}		
		}
	}

	@Override
	public void alterarCargo(int id, String descricao) throws Exception {
		String valida = descricao.replaceAll(" ", "");
		if(valida.isEmpty()){
			System.out.println("Campo descrição do cargo é obrigatório!");
		} else {
			cargo = new Cargo();
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
	}

	@Override
	public void excluirCargo(int id) throws Exception {
		cargo = pesquisaCargo(id);
		int ret = DaoFactory.getCargodao().excluirCargo(cargo);
		if (ret == 1){
			System.out.println("Exclusão efetuada com sucesso!");
		}
		if (ret == 0){
			System.out.println("Registro não existe, favor verificar!");
		}
	}

	@Override
	public ArrayList<Cargo> pesquisaCargos() throws Exception {
		ResultSet rs = DaoFactory.getCargodao().pesquisaCargos();
		ArrayList<Cargo> cargos = new ArrayList<>();
		while(rs.next()){
			Cargo cargo = new Cargo();
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
			System.out.println("Campo descrição do cargo é obrigatório!");
		} else {
			ResultSet rs = DaoFactory.getCargodao().pesquisaDescricao(descricao);
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
		}
		return cargos; 
	};

	@Override
	public Cargo pesquisaCargo(int id) throws Exception{
		ResultSet rs = DaoFactory.getCargodao().pesquisaCargo(id);
		cargo = new Cargo();
		while(rs.next()){
			cargo.setId(rs.getInt("CAR_NUMERO"));
			cargo.setDescricao(rs.getString("CAR_NOME"));
		}
		return cargo; 
	};
}
