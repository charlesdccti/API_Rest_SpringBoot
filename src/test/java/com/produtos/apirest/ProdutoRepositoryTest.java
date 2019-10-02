package com.produtos.apirest;

import com.produtos.apirest.repository.ProdutoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

//import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ProdutoRepositoryTest {

    @Autowired
    private ProdutoRepository produtoRepository;

    //Produto produto01;

//    @Before
//    public void setUp() {
////        produto01 = new Produto();
////        produto01.setNome("carro");
////        produto01.setCor("RED");
////        produtoRepository.save(produto01);
////
////        produto01 = new Produto();
////        produto01.setNome("Moto");
////        produto01.setCor("Vermelha");
////        produtoRepository.save(produto01);
//    }

    @Test
    public void sizeListAll() {
        System.out.println("teste de charles");
        //int size = produtoRepository.findAll().size();
        //assertThat(produtoRepository.findAll().size()).isEqualTo(size);
    }

//    @Test
//    public void findOneByName() {
//        Produto result = produtoRepository.findOneByName("carro");
//        assertEquals(result.toString(), user01.toString());
//    }

}
