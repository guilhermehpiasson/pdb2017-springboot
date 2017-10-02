package br.com.compasso.exemplospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe com a finalidade de executar as configurações da aplicação e deixá-la disponível para o acesso
 * @author guilherme.piasson
 */
@SpringBootApplication
public class Configuracao {
	
	public static void main(String[] args) {
		SpringApplication.run(Configuracao.class, args);
	}

}
