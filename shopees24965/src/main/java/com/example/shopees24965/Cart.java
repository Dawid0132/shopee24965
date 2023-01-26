package com.example.shopees24965;

import java.util.ArrayList;
import java.util.List;
public class Cart {
    Customer customer;
    List<String> koszyk = new ArrayList();

    public Cart(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public List<String> getKoszyk() {
        return this.koszyk;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setKoszyk(List<String> koszyk) {
        this.koszyk = koszyk;
    }

    public void addItemToCar(String nazwa) {
        this.koszyk.add(nazwa);
    }
}
