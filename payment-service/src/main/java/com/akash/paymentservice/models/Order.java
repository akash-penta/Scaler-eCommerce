package com.akash.paymentservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Order {
    // Add required order details
    String orderId;
    String currency;
    long amount;
}
