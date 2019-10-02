package com.produtos.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ApirestApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ApirestApplication.class, args);
	}


	@RequestMapping(value="/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	String index() {
		return "Acesse a interface da API: http://localhost:8080/swagger-ui.html#/produto45resource";
	}
}

