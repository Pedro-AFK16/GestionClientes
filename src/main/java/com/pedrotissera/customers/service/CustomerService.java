package com.pedrotissera.customers.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.pedrotissera.customers.entities.Customer;

@Service
public class CustomerService {
    private List<Customer> list = new ArrayList<>();

    public CustomerService(){
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
    

    public List<Customer> getAllCustomers(){
        return list;
    } 

    public Customer getCustomer(Integer id){
        for (Customer c : list){
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public void addCustomer (Customer customer){
        list.add(customer);
    }

    public void deleteCustomer(Integer id){
        for (Customer c : list){
            if (c.getId() == id) {
                list.remove(c);
                break;
                }
            }

    }

    public void updateCustomer(Integer id, Customer customer){
        for (Customer c : list){
            if (c.getId() == id) {
                list.remove(c);
                customer.setId(id);
                list.add(customer);
                break;  
            }
        }        for (Customer c : list){
            if (c.getId() == id) {
                list.remove(c);
                customer.setId(id);
                list.add(customer);
                break;  
            }
        }
    }

    public List<Customer> searchCustomers(String lastname){
        List<Customer> search = new ArrayList<>();
        for (Customer c : list){
            if (c.getLastname().equals(lastname)){
                search.add(c);
            }
        }
        return search;
}}
