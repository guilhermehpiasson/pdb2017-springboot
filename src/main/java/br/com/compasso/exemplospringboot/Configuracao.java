package br.com.compasso.exemplospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe com a finalidade de executar as configura��es da aplica��o e deix�-la dispon�vel para o acesso
 * @author guilherme.piasson
 */
@SpringBootApplication
public class Configuracao {
	
	public static void main(String[] args) {
		SpringApplication.run(Configuracao.class, args);
	}

}
