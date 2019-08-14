package com.produtos.apirest.models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author charles
 *
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	//@NotNull
	private String nome;
	
	@NotEmpty
	private Integer quantidade;
	private Integer valor;
	
	
	public Produto( String nome,  Integer quantidade,  Integer valor) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
	}

}