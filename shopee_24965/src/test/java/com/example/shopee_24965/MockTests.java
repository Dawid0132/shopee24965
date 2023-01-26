package com.example.shopee_24965;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MockTests {

    @Mock
    ShopeeStorage shopeeStorage;

    @InjectMocks
    ShopService shopService;

    @Test
    public void shouldMockStorage(){

        when(shopeeStorage.getItems()).thenReturn(List.of(new Item("apple",1.5d)));

        assertThat(shopService.getAllItems()).isNotNull();
    }

    @Test
    public void shouldMockMethod(){

        Customer customer = new Customer(1,10d);
        Cart cart = new Cart(customer);

        cart.addItemToCar("milk");
        cart.addItemToCar("beer");

        shopService.orderItems(cart);

        verify(shopeeStorage,times(1)).getItems();
    }

}
