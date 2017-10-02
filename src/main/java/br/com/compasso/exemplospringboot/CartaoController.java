package br.com.compasso.exemplospringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.compasso.exemplospringboot.model.Cartao;
import br.com.compasso.exemplospringboot.service.CartaoService;

@Controller
public class CartaoController {
	
	@Autowired
	private CartaoService  service;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("listacartoes")
	public String listaCartoes(Model model) {
		Iterable<Cartao> cartoes = service.obterTodos();
		model.addAttribute("cartoes", cartoes);
		
		return "listacartoes";
	}
	
	@RequestMapping(value = "salvar", method = RequestMethod.POST)
	public String salvar(@RequestParam("nroCartao") String nroCartao, 
			@RequestParam("dtValidade") String dtValidade, 
			@RequestParam("bandeira") String bandeira,
			@RequestParam("codigoVerificador") String codigoVerificador,
			@RequestParam("nomeTitular") String nomeTitular,
			Model model){
		
		Cartao novoCartao =  new Cartao(nroCartao, dtValidade, bandeira, codigoVerificador, nomeTitular);
		
		service.salvar(novoCartao);
		
		Iterable<Cartao> cartoes = service.obterTodos();
		model.addAttribute("cartoes", cartoes);
		
		return "listacartoes";
	}
	
	
	

}
