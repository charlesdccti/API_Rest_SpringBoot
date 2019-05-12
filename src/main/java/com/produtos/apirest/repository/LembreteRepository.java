package com.produtos.apirest.repository;

import com.produtos.apirest.models.Lembrete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Charles Ferreira
 */
@Repository
public interface LembreteRepository extends JpaRepository<Lembrete, Long> {

    Lembrete findById(long id);
}
