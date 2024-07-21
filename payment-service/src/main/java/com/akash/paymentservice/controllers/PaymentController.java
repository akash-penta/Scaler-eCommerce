package com.akash.paymentservice.controllers;

import com.akash.paymentservice.dtos.PaymentRequestDto;
import com.akash.paymentservice.dtos.PaymentResponseDto;
import com.akash.paymentservice.services.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/payments")
public class PaymentController {
    final private PaymentService paymentService;

    PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @RequestMapping(
            method = RequestMethod.POST,
            path = "/initiatePay"
    )
    public PaymentResponseDto initiatePayment(@RequestBody PaymentRequestDto paymentRequest) {
        return paymentService.initiatePayment(paymentRequest.getOrderId());
    }
}
