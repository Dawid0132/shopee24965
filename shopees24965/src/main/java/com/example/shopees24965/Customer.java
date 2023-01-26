package com.example.shopees24965;

public class Customer {
    private int id;
    private double balance;

    public Customer(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }
}
