package com.example.demo.restcontrollers;

import com.example.demo.entities.ProductsEntity;
import com.example.demo.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Ejemplo de RestController
 * Se agrega el servicio UserService :)
 */
@RestController
@RequestMapping("/products")
public class ProductsRestController {

    @Autowired
    private ProductsService productsService;

    @GetMapping()
    public List<ProductsEntity> find(){
        return productsService.find();
    }

    @GetMapping("/{id}")
    public ProductsEntity findById(@PathVariable("id")Integer id){
        return productsService.findById(id);
    }

    @PostMapping()
    public ProductsEntity save(@RequestBody ProductsEntity productsEntity){
        return productsService.save(productsEntity);
    }

    @PutMapping("/{id}")
    public ProductsEntity update(@PathVariable("id")Integer id, @RequestBody ProductsEntity productsEntity){
        return productsService.update(id, productsEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")Integer id){
        productsService.deleteById(id);
    }

}