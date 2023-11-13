package com.example.flower_gift_booking_springboot.Repository;

import com.example.flower_gift_booking_springboot.Model.CartItem;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends MongoRepository<CartItem, ObjectId> {
}
