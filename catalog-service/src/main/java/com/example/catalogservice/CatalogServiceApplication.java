package com.example.catalogservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableDiscoveryClient
public class CatalogServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatalogServiceApplication.class, args);
    }

    private ItemRepository itemRepository;
    @Autowired
    public CatalogServiceApplication(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
    @PostConstruct
    public void generateTestData(){
        itemRepository.save(new Item("Energy Cells", 43.0, 500));
        itemRepository.save(new Item("Laser Sword (blue)", 521.0, 1000));
        itemRepository.save(new Item("Droid", 340.0, 500));
    }

}
