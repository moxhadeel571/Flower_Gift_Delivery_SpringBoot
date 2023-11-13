package com.example.flower_gift_booking_springboot.Model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.MongoId;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class FlowerImages {
    @MongoId
    private ObjectId id;
    private byte[] FileData;
    private String ContentType;
    private String FileName;
}
