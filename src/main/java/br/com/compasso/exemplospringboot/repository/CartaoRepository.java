package br.com.compasso.exemplospringboot.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.compasso.exemplospringboot.model.Cartao;

/**
 * Interface com o objetivo de promover CRUD da entidade Cartao 
 * @author guilherme.piasson
 */
public interface CartaoRepository extends CrudRepository<Cartao, Long>{
	
	

}
