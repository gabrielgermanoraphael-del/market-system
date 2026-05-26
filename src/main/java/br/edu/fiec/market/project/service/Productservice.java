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

    public Product getById(Integer id){
        return productList.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void deleteById(Integer id){
        this.productList.remove(
                this.productList.stream()
                        .filter(product -> product.getId().equals(id))
                        .findFirst()
                        .orElse(null)
        );
    }

    public void updateById(Integer id, Product productToUpdate){
        Product productFind = this.productList.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElse(null);

        if (productFind != null){
            this.productList.remove(productFind);
                productFind.setTittle(productToUpdate.getTittle());
                productFind.setDescription(productToUpdate.getDescription());
                productToUpdate.setBrand(productToUpdate.getBrand());
                productToUpdate.setPrice(productToUpdate.getPrice());

                this.productList.add(productFind);
            }
        }
    }




