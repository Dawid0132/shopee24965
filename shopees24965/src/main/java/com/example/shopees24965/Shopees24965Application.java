package com.example.shopees24965;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Shopees24965Application {
    ShopeService shopService;

    public Shopees24965Application(ShopeService shopService) {
        this.shopService = shopService;
        Customer customer = new Customer(1, 150.0D);
        Cart cart = new Cart(customer);
        cart.addItemToCar("milk");
        cart.addItemToCar("milk");
        cart.addItemToCar("beer");
        shopService.orderItems(cart);
    }

    public static void main(String[] args) {
        SpringApplication.run(Shopees24965Application.class, args);
    }

}
