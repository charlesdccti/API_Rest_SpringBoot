/**
 * 
 */
package com.produtos.apirest.resources;

import com.produtos.apirest.models.Produto;
import com.produtos.apirest.service.ProdutoService;
import com.produtos.apirest.storage.Disco;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


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
	
	@Autowired
	private Disco disco;
	
	
	@GetMapping(value="/produtos", produces="application/json")
	public @ResponseBody List<Produto> listaProdutos(){
	 	List<Produto> listProdutos = produtoService.findAll();
        return listProdutos;
	}
	
	@GetMapping(value="/produto/{id}", produces="application/json")
	public @ResponseBody Produto listaProdutoUnico(@PathVariable(value="id") long id){
		return produtoService.findById(id);
	}
	
	@PostMapping(value="/produto", produces="application/json")
	public @ResponseBody Produto salvaProduto(@RequestBody @Valid Produto produto) {
		//disco.salvarFoto(foto);
		produto.setId(null);
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