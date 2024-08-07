package com.example.demo.service;

import com.example.demo.model.Item;
import com.example.demo.repository.Basket;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.*;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    private final Basket basket;

    public CartServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void add(List<Long> itemIds) {
basket.addAll(itemIds.stream()
        .map(Item::new)
        .toList());

    }


    @Override
    public List<Item> get() {
return basket.getAll();
    }
}
