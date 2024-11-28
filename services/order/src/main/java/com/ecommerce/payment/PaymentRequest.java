package com.ecommerce.payment;

import com.ecommerce.order.PaymentMethod;
import com.ecommerce.customer.CustomerResponse;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
