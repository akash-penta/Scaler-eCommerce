package com.akash.paymentservice.services.strategies.paymentgateway;

import com.akash.paymentservice.models.Order;

public interface PaymentGateway {
    String getPaymentLink(Order order);
}
