package br.com.compasso.exemplospringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.compasso.exemplospringboot.model.Cartao;
import br.com.compasso.exemplospringboot.service.CartaoService;

/**
 * Classe com o objetivo de definir as rotas relacionadas disponíveis na aplicação, relacionadas ao objeto Cartao
 * @author guilherme.piasson
 */
@Controller
public class CartaoController {
	
	@Autowired
	private CartaoService  service;
	
	/**
	 * Rota utilizada na tela inicial da aplicação
	 * @return String com o nome do template (view) a ser carregado
	 */
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	/**
	 * Rota utilizada para a listagem de cartões
	 * @param model - Objeto onde será populado valores e disponibilizado para a utilização na view
	 * @return String com o nome do template (view) a ser carregado 
	 */
	@RequestMapping("listacartoes")
	public String listaCartoes(Model model) {
		
		populaModelComCartoes(model, obtemTodosOsCartoes());
		return "listacartoes";
	}
	
	/**
	 * Rota utilizada para o salvamento de novos cartões
	 * @param nroCartao - Número do cartão preenchido no formulário
	 * @param dtValidade - Data de validade do cartão preenchida no formulário
	 * @param bandeira - Bandeira do cartão preenchida no formulário
	 * @param codigoVerificador - Código de segurança do cartão preenchido no formulário
	 * @param nomeTitular - Nome do titular do cartão preenchido no formulário
	 * @param model - Objeto onde será populado valores e disponibilizado para a utilização na view
	 * @return String com o nome do template (view) a ser carregado
	 */
	@RequestMapping(value = "salvar", method = RequestMethod.POST)
	public String salvar(	@RequestParam("nroCartao") String nroCartao, 
							@RequestParam("dtValidade") String dtValidade, 
							@RequestParam("bandeira") String bandeira,
							@RequestParam("codigoVerificador") String codigoVerificador,
							@RequestParam("nomeTitular") String nomeTitular,
							Model model){
		
		Cartao novoCartao =  new Cartao(nroCartao, dtValidade, bandeira, codigoVerificador, nomeTitular);
		service.salvar(novoCartao);
		
		populaModelComCartoes(model, obtemTodosOsCartoes());
		return "listacartoes";
	}
	
	/**
	 * Método que obtem todos os cartoes existentes na entidade de cartões
	 * @return Um iterador com os cartoes encontrados na entidade de cartões
	 */
	private Iterable<Cartao> obtemTodosOsCartoes() {
		Iterable<Cartao> cartoes = service.obterTodos();
		return cartoes;
	}
	
	/**
	 * Método que popula o objeto Model, o qual será disponibilizado para manipulação dentro da view.
	 */
	private void populaModelComCartoes(Model model, Iterable<Cartao> cartoes) {
		model.addAttribute("cartoes", cartoes);
	}
}
