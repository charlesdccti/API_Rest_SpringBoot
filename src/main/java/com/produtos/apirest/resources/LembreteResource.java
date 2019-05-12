package com.produtos.apirest.resources;


import com.produtos.apirest.models.Lembrete;
import com.produtos.apirest.service.LembreteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value="/api")
public class LembreteResource {

    @Autowired
    private LembreteService lembreteService;



    @GetMapping(value="/lembretes", produces="application/json")
    public @ResponseBody List<Lembrete> listaLembretes(){
        return lembreteService.findAll();
    }


    @GetMapping(value = "/lembrete/{id}", produces="application/json")
    public @ResponseBody Lembrete findById(@PathVariable(value = "id") long id){
        return this.lembreteService.findById(id);
    }

    @PostMapping(value="/lembrete", produces="application/json")
    public @ResponseBody Lembrete salvaLembrete(@RequestBody @Valid Lembrete lembrete) {
        return lembreteService.save(lembrete);
    }


    @DeleteMapping("/lembrete")
    public void deletaLembrete(@RequestBody @Valid Lembrete lembrete) {
        lembreteService.delete(lembrete);
    }


    @PutMapping("/lembrete")
    public @ResponseBody Lembrete atualizaLembrete(@RequestBody @Valid Lembrete lembrete) {
        return lembreteService.save(lembrete);
    }

}
