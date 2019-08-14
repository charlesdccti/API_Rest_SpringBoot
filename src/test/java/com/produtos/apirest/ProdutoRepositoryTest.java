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
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import javax.validation.ConstraintViolationException;
import javax.validation.UnexpectedTypeException;


@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ProdutoRepositoryTest {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    
    @Test
    public void sizeListAll() {
    	int size = produtoRepository.findAll().size();
    	
        Produto produto = new Produto("sapateste", 1, 1);
        produtoRepository.save(produto);
        
    	assertThat(produtoRepository.findAll().size()).isEqualTo(size+1);
	}
    
    
    @Test
    public void create_Should_PersistData() {
        // User user = new User("Charles", "charlesdccti@gmail.com");
        Produto produto = new Produto(1, "sapato", 10, 400);
        this.produtoRepository.save(produto);
        Assertions.assertThat(produto.getNome()).isEqualTo("sapato");
        Assertions.assertThat(produto.getValor()).isNull();
    }

    
    @Test
    public void update_Should_ChangeAndPersistData() {
        Produto produto = new Produto("sapato", 1, 1);
        this.produtoRepository.save(produto);
        
        produto.setNome("sapatenis");
        produto.setValor(500);
        this.produtoRepository.save(produto);
        
        Assertions.assertThat(produto.getId()).isNotNull();
        Assertions.assertThat(produto.getNome()).isEqualTo("sapatenis");
        Assertions.assertThat(produto.getValor()).isNotNull();
    }

    /**
     * O resto é 3, pois é feito um carregamento de 3 produtos ao executar a aplicacao
     */
    @Test
    public void delete_should_removeData() {
        Produto produto = new Produto("sapato", 2, 100);
        
        this.produtoRepository.save(produto);
        assertThat(produtoRepository.findAll().size()).isEqualTo(4);
       
        this.produtoRepository.delete(produto);
        assertThat(produtoRepository.findAll().size()).isEqualTo(3); // removido com sucesso
    }
    
    
    @Test
    public void save_WhenNameIsNull_Should_Throw_ConstraintViolationException() {
		
    	thrown.expect(ConstraintViolationException.class);
		thrown.expectMessage("O campo nome do produto é obrigatório");
		
		this.produtoRepository.save(new Produto());
		
	}
    
    
    @Test
    public void save_WhenValorIsNull_Should_Throw_ConstraintViolationException() {
		
    	thrown.expect(ConstraintViolationException.class);
		thrown.expectMessage("O campo valor do produto é obrigatório");
		
		this.produtoRepository.save(new Produto());
		
	}
    
    
    @Test
    public void save_WhenQuantidadeIsNull_Should_Throw_ConstraintViolationException() {
		
    	thrown.expect(ConstraintViolationException.class);
		thrown.expectMessage("O campo quantidade do produto é obrigatório");
		
		this.produtoRepository.save(new Produto());
		
	}
    
    @Test
    public void save_WhenQuantidadeIsNegative_Should_Throw_ConstraintViolationException() {
		
    	thrown.expect(ConstraintViolationException.class);
		thrown.expectMessage("Quantidade deve ser um valor positivo");
		
		this.produtoRepository.save(new Produto("sapato", -2, 2));
		
	}
    
    @Test
    public void save_WhenValorIsNegative_Should_Throw_ConstraintViolationException() {
		
    	thrown.expect(ConstraintViolationException.class);
		thrown.expectMessage("Valor deve ser um numero positivo");
		
		this.produtoRepository.save(new Produto("sapato", 2, -2));
		
	}
};






















