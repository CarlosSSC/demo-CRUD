package com.example.demo.restcontrollers;

import com.example.demo.entities.CustomerEntity;
import com.example.demo.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Ejemplo de RestController
 * Se agrega el servicio UserService :)
 */
@RestController
@RequestMapping("/customers")
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;

    @GetMapping()
    public List<CustomerEntity> find(){
        return customerService.find();
    }

    @GetMapping("/{id}")
    public CustomerEntity findById(@PathVariable("id")Integer id){
        return customerService.findById(id);
    }

    @PostMapping()
    public CustomerEntity save(@RequestBody CustomerEntity customerEntity){
        return customerService.save(customerEntity);
    }

    @PutMapping("/{id}")
    public CustomerEntity update(@PathVariable("id")Integer id, @RequestBody CustomerEntity customerEntity){
        return customerService.update(id, customerEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")Integer id){
        customerService.deleteById(id);
    }

}