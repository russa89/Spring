package com.example.demo.controller;


import com.example.demo.model.Item;
import com.example.demo.repository.Basket;
import com.example.demo.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/order")

public class CartController {
private Basket basket;
    private final CartService service;

    public CartController(CartService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public void add(@RequestParam("itemIds") List<Long> itemIds) {
        service.add(itemIds);
    }

    @GetMapping("/get")
    public List<Long> getBasket() {
        return service.getBasket();
    }
}

