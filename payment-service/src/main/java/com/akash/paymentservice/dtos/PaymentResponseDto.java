package com.akash.paymentservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentResponseDto {
    private String orderId;
    private String paymentLink;
    private double amount;
}
