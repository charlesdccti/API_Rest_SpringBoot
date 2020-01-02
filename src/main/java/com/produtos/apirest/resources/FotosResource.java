package com.produtos.apirest.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.produtos.apirest.storage.Disco;


@CrossOrigin("*")
@RestController
@RequestMapping(value="/v1/api")
public class FotosResource {
	
	@Autowired
	private Disco disco;
	
	@PostMapping("/fotos")
	public void upload(@RequestParam MultipartFile foto) {
		disco.salvarFoto(foto);
	}

}
