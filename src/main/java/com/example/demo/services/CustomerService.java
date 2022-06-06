package com.example.demo.services;

import com.example.demo.entities.CustomerEntity;
import com.example.demo.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository; // Repositorio, para operaciones CRUD

    // Listar los objetos de la base de datos
    public List<CustomerEntity> find(){

        return customerRepository.findAll();
    }

    //metodo para traer un solo id
    public CustomerEntity findById(Integer id) {

        return customerRepository.findById(id).get();
    }

    // Método pa'guardar datos en la base de datos
    public CustomerEntity save(CustomerEntity customerEntity){

        return customerRepository.save(customerEntity);
    }
    //Metodo para actualizar datos
    public CustomerEntity update(Integer id, CustomerEntity customerEntity){
        CustomerEntity updatedCustomerEntity = customerEntity;
        updatedCustomerEntity.setId(id);
        return customerRepository.save(updatedCustomerEntity);
    }

    //metodo para eliminar un registro de la tabla
    public void deleteById(Integer id){

        customerRepository.deleteById(id);
    }

}