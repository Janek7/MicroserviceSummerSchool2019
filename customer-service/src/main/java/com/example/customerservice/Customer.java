package com.example.customerservice;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String firstname;
    private String street;
    private String city;
    private double shopCredit;

    public Customer(){

    }

    public Customer(String name, String firstname, String street, String city, double shopCredit) {
        this.name = name;
        this.firstname = firstname;
        this.street = street;
        this.city = city;
        this.shopCredit = shopCredit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getShopCredit() {
        return shopCredit;
    }

    public void setShopCredit(double shopCredit) {
        this.shopCredit = shopCredit;
    }
}
