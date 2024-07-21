package com.akash.paymentservice.services.strategies.paymentgateway;

import com.akash.paymentservice.models.Order;
import org.springframework.stereotype.Component;

@Component
public class RazorpayPaymentGateway implements PaymentGateway{
    @Override
    public String getPaymentLink(Order order) {
        return "DUMMY RAZORPAY PAYMENT LINK";
    }
}
