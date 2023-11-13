package com.example.flower_gift_booking_springboot.Repository;

import com.example.flower_gift_booking_springboot.Model.Product;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product, ObjectId> {
    List<Product> findByProductName(String productName);
}
