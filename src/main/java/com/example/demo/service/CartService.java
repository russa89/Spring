package com.example.demo.service;

import com.example.demo.model.Item;

import java.util.List;

public interface CartService {
    void add(List<Long> itemIds);


    List<Long> getBasket();
}
