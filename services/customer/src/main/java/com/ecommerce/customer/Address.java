package com.ecommerce.customer;

import lombok.Builder;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
@Builder
public class Address {

    private String street;
    private String houseNumber;
    private String zipCode;
}