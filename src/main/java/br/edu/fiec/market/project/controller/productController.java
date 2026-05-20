package br.edu.fiec.market.project.controller;

import br.edu.fiec.market.project.model.Product;
import br.edu.fiec.market.project.service.Productservice;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("project")
@AllArgsConstructor


public class productController {

    private final Productservice productservice ;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void create(@RequestBody Product product){
        productservice.create(product);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<Product> getall(){
        return productservice.getall();
    }

}
