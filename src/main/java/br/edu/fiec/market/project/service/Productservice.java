package br.edu.fiec.market.project.service;

import br.edu.fiec.market.project.model.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class Productservice {
    private final List<Product> productList;

    public void create(Product product){
        this.productList.add(product);
    }

    public List<Product> getall(){
        return this.productList;
    }



}
