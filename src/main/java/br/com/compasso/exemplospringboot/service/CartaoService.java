package br.com.compasso.exemplospringboot.service;

import javax.xml.namespace.QName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.compasso.exemplospringboot.model.Cartao;
import br.com.compasso.exemplospringboot.repository.CartaoRepository;
import br.com.compasso.exemplospringboot.soap.cartaows.CartaoDeCredito;
import br.com.compasso.exemplospringboot.soap.cartaows.CartaoWS;
import br.com.compasso.exemplospringboot.soap.cartaows.CartaoWSService;
import br.com.compasso.exemplospringboot.soap.cartaows.RetornoCartaoDeCredito;

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
		if(validaCartao(cartao)) {
			repository.save(cartao);
		}
	}
	
	/**
	 * Método utilizado para a chamada de um WebService para validação de Cartões
	 * @param cartao - Objeto passado pelo formulário
	 * @return Se o cartão informado é valido ou não
	 */
	public boolean validaCartao(Cartao cartao) {
		CartaoWSService cartaoService = new CartaoWSService();
		CartaoWS cartaoWS = cartaoService.getPort(new QName("http://ws.programabolsas.compasso.com.br", "CartaoWS"), CartaoWS.class);
		
		CartaoDeCredito cartaoDeCredito = new CartaoDeCredito();
		
		cartaoDeCredito.setNroCartao(cartao.getNroCartao());
		cartaoDeCredito.setDtValidade(cartao.getDtValidade());
		cartaoDeCredito.setBandeira(cartao.getBandeira());
		cartaoDeCredito.setCodigoVerificador(cartao.getCodigoVerificador());
		cartaoDeCredito.setNomeTitular(cartao.getNomeTitular());
		
		RetornoCartaoDeCredito retorno = cartaoWS.validaCartao(cartaoDeCredito);
		
		return retorno.isValido();
	}
	

}
