package br.com.compasso.exemplospringboot.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.compasso.exemplospringboot.model.Cartao;

public interface CartaoRepository extends CrudRepository<Cartao, Long>{
	
	

}
