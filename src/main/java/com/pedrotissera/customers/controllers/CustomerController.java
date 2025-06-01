package com.pedrotissera.customers.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.pedrotissera.customers.entities.Customer;
import com.pedrotissera.customers.service.CustomerService;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping("/customer")
    public List<Customer> getAllCustomers(){
        return service.getAllCustomers();
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable Integer id){
        return service.getCustomer(id);
    }

    @PostMapping("/customer")
    public void addCustomer (@RequestBody Customer customer){
        service.addCustomer(customer);
    }

    @DeleteMapping("/customer/{id}")
    public void deleteCustomer(@PathVariable Integer id){
        service.deleteCustomer(id);
    }

    @PutMapping("/customer/{id}")
    public void updateCustomer(@PathVariable Integer id, @RequestBody Customer customer){
        service.updateCustomer(id, customer);
    }

    @GetMapping("/customer/search")
    public List<Customer> searchCustomers(@RequestParam("lastname") String lastname){
        return searchCustomers(lastname);
    }
}
