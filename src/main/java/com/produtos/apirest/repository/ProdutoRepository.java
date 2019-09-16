/**
 * 
 */
package com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apirest.models.Produto;

/**
 * @author charles
 *
 */
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	Produto findById(long id);

	//Produto findOneByName(String nome);
}
