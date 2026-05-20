package br.edu.fiec.market.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//faz todos os gets e sets:
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private Integer id;

    private Double price;

    private String tittle;

    private String description;

    private String brand;
}
