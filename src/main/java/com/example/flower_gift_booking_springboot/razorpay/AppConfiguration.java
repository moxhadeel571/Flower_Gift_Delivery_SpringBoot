package com.example.flower_gift_booking_springboot.razorpay;

import org.springframework.context.annotation.Configuration;

@org.springframework.context.annotation.Configuration

public abstract class AppConfiguration implements Configuration {

  private String apiKey;

  private String secretKey;

  public String getApiKey() {
    return "rzp_test_BGPTgqrkVagzn6";
  }

  public String getSecretKey() {
    return "l48xX7CnwytQmBn5twVyiavo";
  }

}
