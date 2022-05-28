package com.example.demo.restcontrollers;

import com.example.demo.entities.CustomerEntity;
import com.example.demo.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerRestController {
    @Autowired
    private CustomerService customerService;

    @GetMapping()
    public List<CustomerEntity> find(){
        return customerService.find();
    }
}
