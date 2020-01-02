package com.produtos.apirest.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.produtos.apirest.service.ProdutoService;

import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

@RestController
@CrossOrigin
@RequestMapping("api/v1/test")
public class MyController {
	
	@Autowired
	private ProdutoService produtoService;

    @PutMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveFile(@RequestPart("myFile") MultipartFile myFile,
                            @RequestPart("myFile") byte[] isFile,
                            @RequestPart("myFile") Part myPart,
                            @RequestParam("myFile") MultipartFile multipartFile2,
                            @RequestParam("myFile") Part partFile) {
        /*
         * There are three ways we can obtain this value, but in all cases we need to use
         * @RequestPart annotation.
         * 1. Byte Array ( byte [] )
         * 2. MultipartFile ( Spring way )
         * 3. Part ( Java EE way )
         */

        System.out.println(isFile);
        System.out.println(myPart.getSubmittedFileName());

        System.out.println("================================");

        /**
         * It is important to note that you can also use @RequestParam annotation if you need
         * But with that you can't retrieve the data as a byte array
         */

        System.out.println(multipartFile2.getOriginalFilename());
        System.out.println(partFile.getSubmittedFileName());

        try {
            // Let's get the project location
            String projectPath = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getAbsolutePath();
            // Let's create a folder there for uploading purposes, if not exists
            File uploadsDir = new File(projectPath + "/uploads");
            uploadsDir.mkdir();
            // It is time to transfer the file into the newly created dir
            myFile.transferTo(new File(uploadsDir.getAbsolutePath() + "/" + myFile.getOriginalFilename()));
            return true;
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

}
