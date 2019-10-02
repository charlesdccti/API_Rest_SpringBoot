/**
 * 
 */
package com.produtos.apirest.resources;

import com.produtos.apirest.models.Produto;
import com.produtos.apirest.service.ProdutoService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author charles
 *
 */
@CrossOrigin
@RestController
@RequestMapping(value="/v1/api")
public class ProdutoResource {
	
	@Autowired
	private ProdutoService produtoService;
	
	
	
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