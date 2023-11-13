package com.example.flower_gift_booking_springboot.Service;

import com.example.ecommerce.ecommerce.Entity.UserInfo;
import org.bson.types.ObjectId;

import java.util.Optional;

public interface UserInfoService {
    void saveCheckout(UserInfo userInfo);


}
