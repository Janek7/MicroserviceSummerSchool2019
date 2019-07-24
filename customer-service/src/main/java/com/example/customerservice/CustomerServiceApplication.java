package com.example.customerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    private CustomerRepository customerRepository;


    @Autowired //automatically injects the repository in this class
    public CustomerServiceApplication(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @PostConstruct //this method will automatically trigger,
//once this object was constructed
    public void generateTestData() {
        customerRepository.save(new Customer("Luke", "Skywalker", "Bantha Rider Path 17", "Mos Eisley", 400.0));
        customerRepository.save(new Customer("Boba", "Fett", "Cantina Street 4", "Mos Eisley", 450.0));
        customerRepository.save(new Customer("Darth", "Vader", "Level 4, Appartment 6", "Death Star", 450.0));
    }
}
