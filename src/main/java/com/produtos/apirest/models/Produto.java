package com.produtos.apirest.models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * @author charles
 *
 */
//@Entity
@Data
public class Produto {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@NotNull
	private String nome;
	@NotNull
	private BigDecimal quantidade;
	@NotNull
	private BigDecimal valor;
	

}