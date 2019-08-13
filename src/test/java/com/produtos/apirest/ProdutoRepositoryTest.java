package com.produtos.apirest;

import com.produtos.apirest.models.Produto;
import com.produtos.apirest.repository.ProdutoRepository;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ProdutoRepositoryTest {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void create_Should_PersistData() {
        // User user = new User("Charles", "charlesdccti@gmail.com");
        Produto produto = new Produto();
        this.produtoRepository.save(produto);
//        Assertions.assertThat(produto.getNome()).isEqualTo("sapato");
//        Assertions.assertThat(produto.getValor()).isNull();
    }

    
//    @Test
//    public void update_Should_ChangeAndPersistData() {
//        Produto produto = new Produto("sapato", BigDecimal.valueOf(1), BigDecimal.valueOf(1));
//        this.produtoRepository.save(produto);
//        produto.setNome("sapatenis");
//        produto.setValor(BigDecimal.valueOf(500));
//        this.produtoRepository.save(produto);
//        Assertions.assertThat(produto.getId()).isNotNull();
//        Assertions.assertThat(produto.getNome()).isEqualTo("sapatenis");
//        Assertions.assertThat(produto.getValor()).isNotNull();
//    }
//
//    @Test
//    public void delete() {
//        Produto produto = new Produto("sapato", BigDecimal.valueOf(2), BigDecimal.valueOf(1000));
//        this.produtoRepository.save(produto);
//        this.produtoRepository.delete(produto);
//        Assertions.assertThat(produtoRepository.findById(produto.getId())).isNull();
//    }
//    
//    @Test
//    public void sizeListAll() {
//        Produto produto = new Produto("sapateste", BigDecimal.valueOf(1), BigDecimal.valueOf(1));
//        produtoRepository.save(produto);
//        
//    	//Assertions.assertThat(produtoRepository.findAll().size()).isNotNull();
//    	
//	}
    
    
};






















