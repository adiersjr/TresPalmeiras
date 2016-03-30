package br.com.xkinfo.pessoa.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.pessoa.model.TipoDocumento;
import br.com.xkinfo.pessoa.service.ITipoDocumentoService;
import br.com.xkinfo.service.ServiceFactory;

public class TipoDocumentoService implements ITipoDocumentoService{

	TipoDocumento tipoDocumento;

	@Override
	public boolean incluirTipoDocumento(String descricao, boolean pessoal) throws Exception {
		String valida = descricao.replaceAll(" ", "");
		if(valida.isEmpty()){
			JOptionPane.showMessageDialog(null, "Campo descrição do cargo é obrigatório!");
			return false;
		}else {
			if (ServiceFactory.getApoioservice().isCaracterEspecial(descricao)){
				tipoDocumento = new TipoDocumento();
				tipoDocumento.setDescricao(descricao);
				tipoDocumento.setPessoal(pessoal);
				int ret = DaoFactory.getTipodocumentoDao().incluirTipoDocumento(tipoDocumento);
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
	public boolean alterarTipoDocumento(int id, String descricao, boolean pessoal) throws Exception {
		String valida = descricao.replaceAll(" ", "");
		if(valida.isEmpty()){
			JOptionPane.showMessageDialog(null, "Campo descrição do cargo é obrigatório!");
			return false;
		}else {
			if (ServiceFactory.getApoioservice().isCaracterEspecial(descricao)){
			tipoDocumento = new TipoDocumento();
			tipoDocumento.setId(id);
			tipoDocumento.setDescricao(descricao);
			tipoDocumento.setPessoal(pessoal);
			int ret = DaoFactory.getTipodocumentoDao().alterarTipoDocumento(tipoDocumento);
			if (ret == 1){
				JOptionPane.showMessageDialog(null, "Alteração efetuada com sucesso!");
				return true;
			} else {
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
	public boolean excluirTipoDocumento(int id) throws Exception {
		tipoDocumento = pesquisaTipoDocumento(id);
		int ret = DaoFactory.getTipodocumentoDao().excluirTipoDocumento(tipoDocumento);
		if (ret == 1){
			JOptionPane.showMessageDialog(null, "Exclusão efetuada com sucesso!");
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Registro não existe, favor verificar!");
			return false;
		}
	}

	@Override
	public ArrayList<TipoDocumento> pesquisaTipoDocumentos() throws Exception {
		ResultSet rs = DaoFactory.getTipodocumentoDao().pesquisaTipoDocumentos();
		ArrayList<TipoDocumento> tipoDocumentos = new ArrayList<>();
		while(rs.next()){
			tipoDocumento = new TipoDocumento();
			tipoDocumento.setId(rs.getInt("TPD_NUMERO"));
			tipoDocumento.setDescricao(rs.getString("TPD_DESCRICAO"));
			tipoDocumento.setPessoal(rs.getBoolean("TPD_PESSOAL"));
			tipoDocumentos.add(tipoDocumento);
		}
		return tipoDocumentos; 
	}

	@Override
	public ArrayList<TipoDocumento> pesquisaDescricao(String descricao) throws Exception {
		String valida = descricao.replaceAll(" ", "");
		ArrayList<TipoDocumento> tipoDocumentos = new ArrayList<>();
		if(valida.isEmpty()){
			System.out.println("Campo descriï¿½ï¿½o do cargo ï¿½ obrigatï¿½rio!");
		} else {
			ResultSet rs = DaoFactory.getTipodocumentoDao().pesquisaDescricao(descricao);
			while(rs.next()){
				tipoDocumento = new TipoDocumento();
				tipoDocumento.setId(rs.getInt("TPD_NUMERO"));
				tipoDocumento.setDescricao(rs.getString("TPD_DESCRICAO"));
				tipoDocumento.setPessoal(rs.getBoolean("TPD_PESSOAL"));
				tipoDocumentos.add(tipoDocumento);
			}
			if (tipoDocumentos.size() == 0){
				System.out.println("Nï¿½o possui dados com esse argumento!");
			} else {
				return tipoDocumentos;
			}
		}
		return tipoDocumentos; 
	}

	@Override
	public TipoDocumento pesquisaTipoDocumento(int id) throws Exception {
		ResultSet rs = DaoFactory.getTipodocumentoDao().pesquisaTipoDocumento(id);
		tipoDocumento = new TipoDocumento();
		while(rs.next()){
			tipoDocumento = new TipoDocumento();
			tipoDocumento.setId(rs.getInt("TPD_NUMERO"));
			tipoDocumento.setDescricao(rs.getString("TPD_DESCRICAO"));
			tipoDocumento.setPessoal(rs.getBoolean("TPD_PESSOAL"));
		}
		return tipoDocumento;
	}
}
