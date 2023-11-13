package com.example.flower_gift_booking_springboot.Implementation;

import com.example.flower_gift_booking_springboot.Model.CartItem;
import com.example.flower_gift_booking_springboot.Model.Product;
import com.example.flower_gift_booking_springboot.Repository.CartRepository;
import com.example.flower_gift_booking_springboot.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CartServiceImplementation implements CartService {
    @Autowired
    private CartRepository cartRepository;

    private final List<CartItem> cartItems = new ArrayList<>();
    @Override
    public void addToCart(Product product, Integer quantity) {
        // Retrieve existing cart item if it exists
        CartItem existingCartItem = cartRepository.findById(product.getId()).orElse(null);

        if (existingCartItem != null) {
            // Update quantity if the item is already in the cart
            if (quantity != null) {
                existingCartItem.setQuantity(existingCartItem.getQuantity() + quantity);
                cartRepository.save(existingCartItem);
            }
        } else {
            // If the item is not in the cart, add a new CartItem
            if (quantity != null) {
                CartItem newCartItem = new CartItem(product, quantity);
                cartRepository.save(newCartItem);
            }
        }
    }


}
