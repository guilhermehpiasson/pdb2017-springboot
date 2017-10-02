package br.com.compasso.exemplospringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.compasso.exemplospringboot.model.Cartao;
import br.com.compasso.exemplospringboot.repository.CartaoRepository;

/**
 * Classe com o objetivo de prover métodos de operação aos Cartoes, como uma espeécie de serviço.
 * @author guilherme.piasson
 */
@Service
public class CartaoService {
	
	@Autowired
	private CartaoRepository repository;
	
	/**
	 * Utiliza o método findAll() da interface CrudRepository
	 * @return Iterador com os cartões existentes na entidade de cartões
	 */
	public Iterable<Cartao> obterTodos(){
		
		Iterable<Cartao> cartoes = repository.findAll();
		
		return cartoes;
	}
	
	/**
	 * Utiliza o método save() da interface CrudRepository
	 */
	public void salvar(Cartao cartao) {
		repository.save(cartao);	
	}
	

}
