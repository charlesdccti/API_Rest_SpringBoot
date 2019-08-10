/**
 * 
 */
package com.produtos.apirest.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apirest.models.Produto;
import com.produtos.apirest.repository.ProdutoRepository;
import com.produtos.apirest.service.ProdutoService;
/**
 * @author charles
 *
 */
@RestController
@RequestMapping(value="/api")
public class ProdutoResource {
	
	@Autowired
	ProdutoService produtoService;
	//ProdutoRepository produtoRepository;
	
	
	
	@GetMapping(value="/produtos", produces="application/json")
	public @ResponseBody List<Produto> listaProdutos(){
		return produtoService.findAll();
	}
	
	@GetMapping(value="/produto/{id}", produces="application/json")
	public @ResponseBody Produto listaProdutoUnico(@PathVariable(value="id") long id){
		return produtoService.findById(id);
	}
	
	@PostMapping(value="/produto", produces="application/json")
	public @ResponseBody Produto salvaProduto(@RequestBody @Valid Produto produto) {
		return produtoService.save(produto);
	}
	
	@DeleteMapping("/produto")
	public void deletaProduto(@RequestBody @Valid Produto produto) {
		produtoService.delete(produto);
	}
	
	@PutMapping("/produto")
	public @ResponseBody Produto atualizaProduto(@RequestBody @Valid Produto produto) {
		return produtoService.save(produto);
	}


}