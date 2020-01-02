package com.produtos.apirest.service;

import com.produtos.apirest.models.Produto;
import com.produtos.apirest.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    public Produto findById(long id) {
        Produto produto = produtoRepository.findById(id);
        return produto;
    }

    @Transactional(readOnly = false)
    public Produto save(Produto entity) {
    	Integer indexInicio = "C:\fakepath\\".length()+1;
    	String foto = entity.getFoto().substring(indexInicio, entity.getFoto().length());
    	entity.setFoto(foto);
        return produtoRepository.save(entity);
    }

    @Transactional(readOnly = false)
    public void delete(Produto entity) {
        produtoRepository.delete(entity);
    }

    @Transactional(readOnly = false)
    public void deleteById(long id) {
        produtoRepository.deleteById(id);
    }

}
