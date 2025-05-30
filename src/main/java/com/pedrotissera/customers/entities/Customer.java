package com.pedrotissera.customers.entities;

import lombok.Data;

@Data
public class Customer {
    private Integer id;
    private String firstname;
    private String lastname;
    private String address;
    private String mail;


    public Customer(Integer id,String firstname, String lastname, String address, String mail) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.mail = mail;
    }

    public Customer(){}
}
