package com.ecommerce.customer;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Builder
public class Customer {

    @Id
    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private Address address;
}
