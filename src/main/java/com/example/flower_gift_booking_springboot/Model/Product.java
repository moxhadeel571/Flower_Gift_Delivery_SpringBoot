package com.example.flower_gift_booking_springboot.Model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Document(collection="flowers")
public class Product {
    @MongoId
    private ObjectId id;
    private String productsName;
    private Double productsPrice;
    private String productsDescription;
    private List<FlowerImages> productsImages;

}
