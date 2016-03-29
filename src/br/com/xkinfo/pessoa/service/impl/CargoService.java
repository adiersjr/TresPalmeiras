package br.com.xkinfo.pessoa.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.pessoa.model.Cargo;
import br.com.xkinfo.pessoa.service.ICargoService;
import br.com.xkinfo.service.ServiceFactory;

public class CargoService implements ICargoService {

	private Cargo cargo;

	@Override
	public boolean incluirCargo(String descricao) throws Exception {
		String valida = descricao.replaceAll(" ", "");
		if(valida.isEmpty()){
			JOptionPane.showMessageDialog(null, "Campo descrição do cargo é obrigatório!");
			return false;
		}else {
			if (ServiceFactory.getApoioservice().isCaracterEspecial(descricao)){
				cargo = new Cargo();
				cargo.setDescricao(descricao);
				int ret = DaoFactory.getCargoDao().incluirCargo(cargo);
				if (ret == 1){
					JOptionPane.showMessageDialog(null, "Inclusão efetuada com Sucesso!");
					return true;
				}else {
					JOptionPane.showMessageDialog(null, "Problema ocorrido durante a gravação \n Entrar em contato com o suporte");
					return false;
				}
			}else {
				JOptionPane.showMessageDialog(null, "Favor preencher o campo Descrição sem caracteres especiais!");
				return false;
			}
		}
	}

	@Override
	public boolean alterarCargo(int id, String descricao) throws Exception {
		String valida = descricao.replaceAll(" ", "");
		if(valida.isEmpty()){
			JOptionPane.showMessageDialog(null, "Campo descrição do cargo é obrigatório!");
			return false;
		} else {
			if (ServiceFactory.getApoioservice().isCaracterEspecial(descricao)){
				cargo = new Cargo();
				cargo.setId(id);
				cargo.setDescricao(descricao);
				int ret = DaoFactory.getCargoDao().alterarCargo(cargo);
				if (ret == 1){
					JOptionPane.showMessageDialog(null, "Alteração efetuada com sucesso!");
					return true;
				}else {
					JOptionPane.showMessageDialog(null, "Registro não existe, favor verificar!");
					return false;
				}
			} else {
				JOptionPane.showMessageDialog(null, "Favor preencher o campo Descrição sem caracteres especiais!");
				return false;
			}
		}
	}

	@Override
	public boolean excluirCargo(int id) throws Exception {
		cargo = pesquisaCargo(id);
		int ret = DaoFactory.getCargoDao().excluirCargo(cargo);
		if (ret == 1){
			JOptionPane.showMessageDialog(null, "Exclusão efetuada com sucesso!");
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Registro não existe, favor verificar!");
			return false;
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
			System.out.println("Campo descriï¿½ï¿½o do cargo ï¿½ obrigatï¿½rio!");
		} else {
			ResultSet rs = DaoFactory.getCargoDao().pesquisaDescricao(descricao);
			while(rs.next()){
				Cargo cargo = new Cargo();
				cargo.setId(rs.getInt("CAR_NUMERO"));
				cargo.setDescricao(rs.getString("CAR_NOME"));
				cargos.add(cargo);
			}
			if (cargos.size() == 0){
				System.out.println("Nï¿½o possui dados com esse argumento!");
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
