package com.example.demo.restcontrollers;

import com.example.demo.entities.ProductsEntity;
import com.example.demo.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsRestController {
    @Autowired
    private ProductsService productsService;

    @GetMapping()
    public List<ProductsEntity> find(){
        return productsService.find();

    }
}
