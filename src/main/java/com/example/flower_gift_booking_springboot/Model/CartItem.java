package com.example.flower_gift_booking_springboot.Model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@ToString
@Document(collection = "CartItem")
public class CartItem {
    @MongoId
    private ObjectId id;
    @DBRef
    private Product product;
    private int quantity;

    public CartItem(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    // constructor, getters, and setters
}