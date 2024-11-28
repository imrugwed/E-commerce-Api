package com.ecommerce.customer;

import java.util.Map;

public record ErrorResponse(
        Map<String, String> errors
) {

}
