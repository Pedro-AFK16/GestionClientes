package com.pedrotissera.customers.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pedrotissera.customers.entities.Customer;

@RestController
public class CustomerController {
    private List<Customer> list = new ArrayList<>();

        public CustomerController(){
            Customer c1 = new Customer();
            Customer c2 = new Customer();
            Customer c3 = new Customer();

            c1.setFirstname("pepe");
            c2.setFirstname("juan");
            c3.setFirstname("titi");

            c1.setAddress("ancona123");
            c2.setAddress("cali123");
            c3.setAddress("mina123");

            c1.setMail("pepe@gmail.com");
            c2.setMail("juan@gmail.com");
            c3.setMail("titi@gmail.com");

            c1.setId(0);
            c2.setId(1);
            c3.setId(2);

            c1.setLastname("tissera");
            c2.setLastname("gutierrez");
            c3.setLastname("ramirez");
            
            list.add(c3);
            list.add(c2);
            list.add(c1);


        }

    @GetMapping("/customer")
    public List<Customer> getAllCustomers(){
        return list;
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable Integer id){
        for (Customer c : list){
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    @PostMapping("")
    public void addCustomer (Customer customer){

    }

    @DeleteMapping("")
    public void deleteCustoemr (){

    }

    @PutMapping("")
    public void updateCustomer(){

    }

    /*
     * Buscar por algun criterio que lo vamos a especificar
     */

    public List<Customer> searchCustomers(){
        return null;
    }

    /*public List<Customer> createListCustomers()[]*/
}
