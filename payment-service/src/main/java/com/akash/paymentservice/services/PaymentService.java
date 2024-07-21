package com.akash.paymentservice.services;

import com.akash.paymentservice.dtos.PaymentResponseDto;
import com.akash.paymentservice.models.Order;
import com.akash.paymentservice.services.strategies.PaymentGatewayStrategy;
import com.akash.paymentservice.services.strategies.paymentgateway.PaymentGateway;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    final private PaymentGatewayStrategy paymentGatewayStrategy;

    PaymentService(PaymentGatewayStrategy paymentGatewayStrategy) {
        this.paymentGatewayStrategy = paymentGatewayStrategy;
    }

    public PaymentResponseDto initiatePayment(String orderId) {
        PaymentGateway paymentGateway = paymentGatewayStrategy.getBestPaymentGateway();
        PaymentResponseDto paymentResponseDto = new PaymentResponseDto();
        // Dummy order
        Order order = new Order(orderId,
                "INR",
                1000);

        paymentResponseDto.setPaymentLink(paymentGateway.getPaymentLink(order));
        paymentResponseDto.setOrderId(orderId);
        return paymentResponseDto;
    }
}
