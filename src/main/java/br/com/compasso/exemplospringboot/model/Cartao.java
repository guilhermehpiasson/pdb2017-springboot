package br.com.compasso.exemplospringboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
	
	public Cartao() {
		
	}
	
	public Cartao(String nroCartao, String dtValidade, String bandeira, String codigoVerificador, String nomeTitular) {
		super();
		this.nroCartao = nroCartao;
		this.dtValidade = dtValidade;
		this.bandeira = bandeira;
		this.codigoVerificador = codigoVerificador;
		this.nomeTitular = nomeTitular;
	}

	public String getNroCartao() {
		return nroCartao;
	}

	public void setNroCartao(String nroCartao) {
		this.nroCartao = nroCartao;
	}

	public String getDtValidade() {
		return dtValidade;
	}

	public void setDtValidade(String dtValidade) {
		this.dtValidade = dtValidade;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public String getCodigoVerificador() {
		return codigoVerificador;
	}

	public void setCodigoVerificador(String codigoVerificador) {
		this.codigoVerificador = codigoVerificador;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

}
