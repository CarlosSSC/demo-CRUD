package com.example.demo.services;

import com.example.demo.entities.ProductsEntity;
import com.example.demo.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
    @Autowired
    private ProductsRepository productsRepository;

    public List<ProductsEntity> find(){
        return productsRepository.findAll();
    }
}
