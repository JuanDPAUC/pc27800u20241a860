package com.andeslogistics.platform.u20241a860.logistics.domain.model;

public record DeliveryCode(String value) {

    public DeliveryCode {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Delivery code cannot be null or blank");
        }
    }
}
