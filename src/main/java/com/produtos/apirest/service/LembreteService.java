package com.produtos.apirest.service;

import com.produtos.apirest.models.Lembrete;
import com.produtos.apirest.repository.LembreteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class LembreteService {

    @Autowired
    private LembreteRepository lembreteRepository;



    public List<Lembrete> findAll() {
        return lembreteRepository.findAll();
    }

    public Lembrete findById(long id) {
        Lembrete lembrete = lembreteRepository.findById(id);
        return lembrete;
    }

        @Transactional(readOnly = false)
        public Lembrete save(Lembrete entity) {
            return lembreteRepository.save(entity);
        }

        @Transactional(readOnly = false)
        public void delete(Lembrete entity) {
            lembreteRepository.delete(entity);
        }

    @Transactional(readOnly = false)
    public void deleteById(long id) {
        lembreteRepository.deleteById(id);
    }
}
