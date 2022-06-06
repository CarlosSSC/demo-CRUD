package com.example.demo.services;

import com.example.demo.entities.CustomerEntity;
import com.example.demo.entities.ProductsEntity;
import com.example.demo.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    // Listar los objetos de la base de datos
    public List<ProductsEntity> find(){

        return productsRepository.findAll();
    }
    //metodo para traer un solo id
    public ProductsEntity findById(Integer id) {

        return productsRepository.findById(id).get();
    }

    // Método pa'guardar datos en la base de datos
    public ProductsEntity save(ProductsEntity productsEntity){

        return productsRepository.save(productsEntity);
    }
    //Metodo para actualizar datos
    public ProductsEntity update(Integer id, ProductsEntity productsEntity){
        ProductsEntity updatedProductEntity = productsEntity;
        updatedProductEntity.setId(id);
        return productsRepository.save(updatedProductEntity);
    }

    //metodo para eliminar un registro de la tabla
    public void deleteById(Integer id){

        productsRepository.deleteById(id);
    }

}
