package com.example.ecommerce.ecommerce.razorpay;

import io.dropwizard.views.View;

public class SuccessView extends View {

  private String razorpayPaymentID;
  private String razorpayOrderId;
  private String message;

  public SuccessView(String razorpayPaymentID, String razorpayOrderId, String message) {
    super("/users/shop");
    this.razorpayPaymentID = razorpayPaymentID;
    this.razorpayOrderId = razorpayOrderId;
    this.message = message;
  }

  public String getRazorpayPaymentID() {
    return razorpayPaymentID;
  }

  public String getMessage() {
    return message;
  }

  public String getRazorpayOrderId() {
    return razorpayOrderId;
  }
}
