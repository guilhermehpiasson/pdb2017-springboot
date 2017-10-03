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
 * Classe com o objetivo de definir as rotas relacionadas dispon�veis na aplica��o, relacionadas ao objeto Cartao
 * @author guilherme.piasson
 */
@Controller
public class CartaoController {
	
	@Autowired
	private CartaoService  service;
	
	/**
	 * Rota utilizada na tela inicial da aplica��o
	 * @return String com o nome do template (view) a ser carregado
	 */
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	/**
	 * Rota utilizada para a listagem de cart�es
	 * @param model - Objeto onde ser� populado valores e disponibilizado para a utiliza��o na view
	 * @return String com o nome do template (view) a ser carregado 
	 */
	@RequestMapping("listacartoes")
	public String listaCartoes(Model model) {
		
		populaModelComCartoes(model, obtemTodosOsCartoes());
		return "listacartoes";
	}
	
	/**
	 * Rota utilizada para o salvamento de novos cart�es
	 * @param nroCartao - N�mero do cart�o preenchido no formul�rio
	 * @param dtValidade - Data de validade do cart�o preenchida no formul�rio
	 * @param bandeira - Bandeira do cart�o preenchida no formul�rio
	 * @param codigoVerificador - C�digo de seguran�a do cart�o preenchido no formul�rio
	 * @param nomeTitular - Nome do titular do cart�o preenchido no formul�rio
	 * @param model - Objeto onde ser� populado valores e disponibilizado para a utiliza��o na view
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
	 * M�todo que obtem todos os cartoes existentes na entidade de cart�es
	 * @return Um iterador com os cartoes encontrados na entidade de cart�es
	 */
	private Iterable<Cartao> obtemTodosOsCartoes() {
		Iterable<Cartao> cartoes = service.obterTodos();
		return cartoes;
	}
	
	/**
	 * M�todo que popula o objeto Model, o qual ser� disponibilizado para manipula��o dentro da view.
	 */
	private void populaModelComCartoes(Model model, Iterable<Cartao> cartoes) {
		model.addAttribute("cartoes", cartoes);
	}
}
