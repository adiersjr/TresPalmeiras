package br.com.xkinfo.pessoa.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.pessoa.model.TipoDocumento;
import br.com.xkinfo.pessoa.service.ITipoDocumentoService;

public class TipoDocumentoService implements ITipoDocumentoService{
	
	TipoDocumento tipoDocumento;

	@Override
	public void incluirTipoDocumento(String descricao, boolean pessoal) throws Exception {
		String valida = descricao.replaceAll(" ", "");
		if(valida.isEmpty()){
			System.out.println("Campo descrição do cargo é obrigatório!");
		}else {
			tipoDocumento = new TipoDocumento();
			tipoDocumento.setDescricao(descricao);
			tipoDocumento.setPessoal(pessoal);
			int ret = DaoFactory.getTipodocumentodao().incluirTipoDocumento(tipoDocumento);
			if (ret == 1){
				System.out.println("Inclusão efetuada com Sucesso!");
			}		
		}
	}

	@Override
	public void alterarTipoDocumento(int id, String descricao, boolean pessoal) throws Exception {
		String valida = descricao.replaceAll(" ", "");
		int ide = id;
		if(valida.isEmpty()){
			System.out.println("Campo descrição do cargo é obrigatório!");
		}else {
			tipoDocumento = new TipoDocumento();
			tipoDocumento.setId(ide);
			tipoDocumento.setDescricao(descricao);
			tipoDocumento.setPessoal(pessoal);
			int ret = DaoFactory.getTipodocumentodao().alterarTipoDocumento(tipoDocumento);
			if (ret == 1){
				System.out.println("Alteração efetuada com Sucesso!");
			}		
		}
	}

	@Override
	public void excluirTipoDocumento(int id) throws Exception {
		tipoDocumento = pesquisaTipoDocumento(id);
		int ret = DaoFactory.getTipodocumentodao().excluirTipoDocumento(tipoDocumento);
		if (ret == 1){
			System.out.println("Exclusão efetuada com sucesso!");
		}
		if (ret == 0){
			System.out.println("Registro não existe, favor verificar!");
		}
	}

	@Override
	public ArrayList<TipoDocumento> pesquisaTipoDocumentos() throws Exception {
		ResultSet rs = DaoFactory.getTipodocumentodao().pesquisaTipoDocumentos();
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
			System.out.println("Campo descrição do cargo é obrigatório!");
		} else {
			ResultSet rs = DaoFactory.getTipodocumentodao().pesquisaDescricao(descricao);
			while(rs.next()){
				tipoDocumento = new TipoDocumento();
				tipoDocumento.setId(rs.getInt("TPD_NUMERO"));
				tipoDocumento.setDescricao(rs.getString("TPD_DESCRICAO"));
				tipoDocumento.setPessoal(rs.getBoolean("TPD_PESSOAL"));
				tipoDocumentos.add(tipoDocumento);
			}
			if (tipoDocumentos.size() == 0){
				System.out.println("Não possui dados com esse argumento!");
			} else {
				return tipoDocumentos;
			}
		}
		return tipoDocumentos; 
	}

	@Override
	public TipoDocumento pesquisaTipoDocumento(int id) throws Exception {
		ResultSet rs = DaoFactory.getTipodocumentodao().pesquisaTipoDocumento(id);
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
