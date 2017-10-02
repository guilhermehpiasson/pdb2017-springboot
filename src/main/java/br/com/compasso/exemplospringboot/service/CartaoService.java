package br.com.compasso.exemplospringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.compasso.exemplospringboot.model.Cartao;
import br.com.compasso.exemplospringboot.repository.CartaoRepository;

@Service
public class CartaoService {
	
	@Autowired
	private CartaoRepository repository;
	
	public Iterable<Cartao> obterTodos(){
		
		Iterable<Cartao> cartoes = repository.findAll();
		
		return cartoes;
	}
	
	public void salvar(Cartao cartao) {
		repository.save(cartao);	
	}
	

}
