package com.produtos.apirest.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

import com.produtos.apirest.util.Categoria;
import com.produtos.apirest.util.Prioridade;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author charles
 *
 */
@Data
@Entity
@Table(name="produto")
public class Produto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	//	  id: number;
	//	  titulo: string;
	//	  descricao: string;
	//	  conteudo: string;
	//	  categoria: categoria;
	//	  preco: number;
	//	  formData: FormData;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotNull
	private String titulo;
	
//	@NotNull
	private String descricao;

//	@NotNull
    @Enumerated(EnumType.STRING)
    @Column
    private Categoria categoria;
    
    @NotNull
    private Double preco;

    @Column
    private String foto;

}