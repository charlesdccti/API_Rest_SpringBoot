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

    
    
};
























