package br.com.compasso.exemplospringboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe com objetivo de modelar o objeto cartão
 * Nessa classe existem dois construtores e os respectivos getters and setters desse objeto
 * Também existe uma anotation de @Entity com o objetivo de definir uma entidade na base, com base nos atributos dessa classe
 * @author guilherme.piasson
 */
@Entity(name="cartao")
public class Cartao {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nroCartao;
	private String dtValidade;
	private String bandeira;
	private String codigoVerificador;
	private String nomeTitular;
	
	/**
	 * Construtor
	 */
	public Cartao() {
		
	}
	
	/**
	 * Construtor
	 * 
	 * @param nroCartao - Número do cartão
	 * @param dtValidade - Data de validade
	 * @param bandeira - Bandeira do cartão
	 * @param codigoVerificador - Código de segurança do cartão
	 * @param nomeTitular - Nome do titular do cartão
	 */
	public Cartao(String nroCartao, String dtValidade, String bandeira, String codigoVerificador, String nomeTitular) {
		super();
		this.nroCartao = nroCartao;
		this.dtValidade = dtValidade;
		this.bandeira = bandeira;
		this.codigoVerificador = codigoVerificador;
		this.nomeTitular = nomeTitular;
	}
	/**
	 * @return número do cartão
	 */
	public String getNroCartao() {
		return nroCartao;
	}
	/**
	 * @param nroCartao - Novo valor do número do cartão
	 */
	public void setNroCartao(String nroCartao) {
		this.nroCartao = nroCartao;
	}
	/**
	 * @return a data de validade do cartão
	 */
	public String getDtValidade() {
		return dtValidade;
	}
	/**
	 * @param dtValidade - Novo valor da data de validade do cartão
	 */
	public void setDtValidade(String dtValidade) {
		this.dtValidade = dtValidade;
	}
	/**
	 * @return bandeira do cartão
	 */
	public String getBandeira() {
		return bandeira;
	}
	/**
	 * @param bandeira - Novo valor da bandeira do cartão
	 */
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	/**
	 * @return código de segurança do cartão
	 */
	public String getCodigoVerificador() {
		return codigoVerificador;
	}
	/**
	 * @param codigoVerificador - Novo valor do código de segurança do cartão
	 */
	public void setCodigoVerificador(String codigoVerificador) {
		this.codigoVerificador = codigoVerificador;
	}
	/**
	 * @return nome o titular do cartão
	 */
	public String getNomeTitular() {
		return nomeTitular;
	}
	/**
	 * @param nomeTitular - Novo valor do nome do titular do cartão
	 */
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

}
