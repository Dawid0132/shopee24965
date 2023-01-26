package com.example.shopees24965;

public class Item {
    private String nazwa;
    private double cena;

    public Item(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setCena(float cena) {
        this.cena = (double)cena;
    }

    public String getNazwa() {
        return this.nazwa;
    }

    public double getCena() {
        return this.cena;
    }
}
