package com.akash.paymentservice.services.strategies.paymentgateway;

import com.akash.paymentservice.models.Order;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentLink;
import com.stripe.model.Price;
import com.stripe.param.PaymentLinkCreateParams;
import com.stripe.param.PriceCreateParams;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StripePaymentGateway implements PaymentGateway{
    @Value("${stripe.secret.key}")
    private String stripeSecretKey;
    @Override
    public String getPaymentLink(Order order) {
//        Stripe.apiKey = stripeSecretKey;
//
//        PriceCreateParams paramsPrice =
//                PriceCreateParams.builder()
//                        .setCurrency(order.getCurrency())
//                        .setUnitAmount(order.getAmount())
//                        .build();
//
//        Price price = null;
//        try {
//            price = Price.create(paramsPrice);
//        } catch (StripeException e) {
//            throw new RuntimeException(e);
//        }
//
//        PaymentLinkCreateParams paramsPayLink =
//                PaymentLinkCreateParams.builder()
//                        .addLineItem(
//                                PaymentLinkCreateParams.LineItem.builder()
//                                        .setPrice(price.getId())
//                                        .setQuantity(1L)
//                                        .build()
//                        )
//                        .build();
//
//        PaymentLink paymentLink = null;
//        try {
//            paymentLink = PaymentLink.create(paramsPayLink);
//        } catch (StripeException e) {
//            throw new RuntimeException(e);
//        }
//
//        return paymentLink.getUrl();
        return "DUMMY STRIPE PAYMENT LINK";
    }
}
