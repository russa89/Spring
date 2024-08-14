package com.example.demo.service;

import com.example.demo.model.Item;
import com.example.demo.repository.Basket;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
    public List<Long> getBasket() {
        return basket.getAll().stream()
                .map(Item::getItemId)
                .collect(Collectors.toList());
    }
}
