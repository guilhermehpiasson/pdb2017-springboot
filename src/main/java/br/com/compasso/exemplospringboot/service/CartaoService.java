package br.com.compasso.exemplospringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.compasso.exemplospringboot.model.Cartao;
import br.com.compasso.exemplospringboot.repository.CartaoRepository;

/**
 * Classe com o objetivo de prover m�todos de opera��o aos Cartoes, como uma espe�cie de servi�o.
 * @author guilherme.piasson
 */
@Service
public class CartaoService {
	
	@Autowired
	private CartaoRepository repository;
	
	/**
	 * Utiliza o m�todo findAll() da interface CrudRepository
	 * @return Iterador com os cart�es existentes na entidade de cart�es
	 */
	public Iterable<Cartao> obterTodos(){
		
		Iterable<Cartao> cartoes = repository.findAll();
		
		return cartoes;
	}
	
	/**
	 * Utiliza o m�todo save() da interface CrudRepository
	 */
	public void salvar(Cartao cartao) {
		repository.save(cartao);	
	}
	

}
