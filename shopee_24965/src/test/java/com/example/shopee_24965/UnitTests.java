package com.example.shopee_24965;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class UnitTests {

    ShopeeStorage shopeeStorage = new ShopeeStorage();

    ShopService shopService = new ShopService(shopeeStorage);

    @Test
    public void shouldNotOrderItems(){
        Customer customer = new Customer(1,1d);
        Cart cart = new Cart(customer);

        cart.addItemToCar("milk");
        cart.addItemToCar("beer");

        assertThat(customer.getBalance()).isEqualTo(1d);
    }

    @Test
    public void shouldAddItems(){
        Customer customer = new Customer(1,1d);
        Cart cart = new Cart(customer);

        cart.addItemToCar("milk");
        cart.addItemToCar("beer");

        assertThat(cart.getKoszyk().size()).isEqualTo(2);
    }

    @Test
    public void shouldGetCorrectBalance(){
        Customer customer = new Customer(1,10d);
        Cart cart = new Cart(customer);

        cart.addItemToCar("milk");
        cart.addItemToCar("beer");

        shopService.orderItems(cart);

        assertThat(customer.getBalance()).isEqualTo(2d);
    }
}
