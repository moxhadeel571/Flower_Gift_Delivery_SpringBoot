package com.example.flower_gift_booking_springboot.Service;

import com.example.flower_gift_booking_springboot.Model.Product;

public interface CartService {
    void addToCart(Product product, Integer quantity);
}
