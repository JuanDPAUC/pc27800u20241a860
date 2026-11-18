package com.andeslogistics.platform.u20241a860.logistics.domain.exceptions;

public class DuplicateDeliveryCode extends RuntimeException {
    public DuplicateDeliveryCode(Throwable cause) {
        super("Delivery code already exists", cause);
    }
}
