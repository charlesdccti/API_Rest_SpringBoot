package com.produtos.apirest.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author charles
 *
 */
@Entity
@Table(name="produto")
public class Produto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private BigDecimal quantidade;
	
	@NotNull
	private BigDecimal valor;

	@NotNull
	private BigDecimal numeroUsuarios;

	@NotNull
	private String cor;
	
	

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public BigDecimal getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}


	public BigDecimal getValor() {
		return valor;
	}


	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public BigDecimal getNumeroUsuarios() {
		return numeroUsuarios;
	}

	public void setNumeroUsuarios(BigDecimal numeroUsuarios) {
		this.numeroUsuarios = numeroUsuarios;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
}