package br.com.xkinfo.arrecadacao.service.impl;

import java.util.ArrayList;

import br.com.xkinfo.arrecadacao.model.Agencia;
import br.com.xkinfo.arrecadacao.model.Banco;
import br.com.xkinfo.arrecadacao.service.IAgenciaService;
import br.com.xkinfo.dao.DaoFactory;
import br.com.xkinfo.model.Bairro;
import br.com.xkinfo.pessoa.model.Estado;

public class AgenciaService implements IAgenciaService{
	
	Agencia agencia;

	@Override
	public int incluirAgencia(String chave, Banco banco, int numero, String nome, String convenioF, String convenioG,
			int nsr, String digito, String endereco, String complemento, Bairro bairro, String cep, String municipio,
			Estado estado, String ddd, String telefone) throws Exception {
		agencia = new Agencia();
		agencia.setChave(chave);
		agencia.setBanco(banco);
		agencia.setNumero(numero);
		agencia.setNome(nome);
		agencia.setConvenioF(convenioF);
		agencia.setConvenioG(convenioG);
		agencia.setNsr(nsr);
		agencia.setDigito(digito);
		agencia.setEndereco(endereco);
		agencia.setComplemento(complemento);
		agencia.setBairro(bairro);
		agencia.setCep(cep);
		agencia.setMunicipio(municipio);
		agencia.setEstado(estado);
		agencia.setDdd(ddd);
		agencia.setTelefone(telefone);
		int ret = DaoFactory.getAgenciadao().incluirAgencia(agencia);
		return ret;
	}

	@Override
	public int alterarAgencia(int id, String chave, Banco banco, int numero, String nome, String convenioF,
			String convenioG, int nsr, String digito, String endereco, String complemento, Bairro bairro, String cep,
			String municipio, Estado estado, String ddd, String telefone) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int excluirAgencia(int id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Agencia> pesquisaAgencias() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Agencia pesquisaAgencia(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
