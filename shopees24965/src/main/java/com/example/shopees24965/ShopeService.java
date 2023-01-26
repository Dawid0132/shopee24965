package com.example.shopees24965;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShopeService {
    ShopeeStorage shopeeStorage;

    public ShopeService(ShopeeStorage shopeeStorage) {
        this.shopeeStorage = shopeeStorage;
    }

    public List<Item> getAllItems() {
        return this.shopeeStorage.getItems();
    }

    public void orderItems(Cart cart) {
        double sum = 0.0D;
        for (Item item : getAllItems()) {
            for (String nazwa : cart.getKoszyk()) {
                if (item.getNazwa().equals(nazwa)){
                    sum += item.getCena();
                }
            }

        }

        if (cart.getCustomer().getBalance() >= sum) {
            cart.getCustomer().setBalance(cart.getCustomer().getBalance() - sum);
            System.out.println("Udało ci się zakupić przedmioty które miałeś w koszyku");
        } else {
            System.out.println("Nie masz wystarczającej kwoty na te zakupy");
        }

    }
}
