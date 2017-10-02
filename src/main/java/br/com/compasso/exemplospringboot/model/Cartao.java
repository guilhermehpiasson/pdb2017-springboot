package br.com.compasso.exemplospringboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe com objetivo de modelar o objeto cart�o
 * Nessa classe existem dois construtores e os respectivos getters and setters desse objeto
 * Tamb�m existe uma anotation de @Entity com o objetivo de definir uma entidade na base, com base nos atributos dessa classe
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
	 * @param nroCartao - N�mero do cart�o
	 * @param dtValidade - Data de validade
	 * @param bandeira - Bandeira do cart�o
	 * @param codigoVerificador - C�digo de seguran�a do cart�o
	 * @param nomeTitular - Nome do titular do cart�o
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
	 * @return n�mero do cart�o
	 */
	public String getNroCartao() {
		return nroCartao;
	}
	/**
	 * @param nroCartao - Novo valor do n�mero do cart�o
	 */
	public void setNroCartao(String nroCartao) {
		this.nroCartao = nroCartao;
	}
	/**
	 * @return a data de validade do cart�o
	 */
	public String getDtValidade() {
		return dtValidade;
	}
	/**
	 * @param dtValidade - Novo valor da data de validade do cart�o
	 */
	public void setDtValidade(String dtValidade) {
		this.dtValidade = dtValidade;
	}
	/**
	 * @return bandeira do cart�o
	 */
	public String getBandeira() {
		return bandeira;
	}
	/**
	 * @param bandeira - Novo valor da bandeira do cart�o
	 */
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	/**
	 * @return c�digo de seguran�a do cart�o
	 */
	public String getCodigoVerificador() {
		return codigoVerificador;
	}
	/**
	 * @param codigoVerificador - Novo valor do c�digo de seguran�a do cart�o
	 */
	public void setCodigoVerificador(String codigoVerificador) {
		this.codigoVerificador = codigoVerificador;
	}
	/**
	 * @return nome o titular do cart�o
	 */
	public String getNomeTitular() {
		return nomeTitular;
	}
	/**
	 * @param nomeTitular - Novo valor do nome do titular do cart�o
	 */
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

}
