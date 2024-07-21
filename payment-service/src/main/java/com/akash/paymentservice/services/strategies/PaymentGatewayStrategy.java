package com.akash.paymentservice.services.strategies;

import com.akash.paymentservice.services.strategies.paymentgateway.PaymentGateway;
import com.akash.paymentservice.services.strategies.paymentgateway.RazorpayPaymentGateway;
import com.akash.paymentservice.services.strategies.paymentgateway.StripePaymentGateway;
import org.springframework.stereotype.Service;

@Service
public class PaymentGatewayStrategy {
    final private RazorpayPaymentGateway razorpayPaymentGateway;
    final private StripePaymentGateway stripePaymentGateway;

    PaymentGatewayStrategy(RazorpayPaymentGateway razorpayPaymentGateway,
                           StripePaymentGateway stripePaymentGateway) {
        this.razorpayPaymentGateway = razorpayPaymentGateway;
        this.stripePaymentGateway = stripePaymentGateway;
    }

    public PaymentGateway getBestPaymentGateway() {
        // TODO : need to update the logic to select payment gateway
        return razorpayPaymentGateway;
    }
}
