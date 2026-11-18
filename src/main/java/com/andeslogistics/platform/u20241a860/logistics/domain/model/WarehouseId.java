package com.andeslogistics.platform.u20241a860.logistics.domain.model;

import java.util.UUID;

public record WarehouseId(UUID value) {

    public WarehouseId {
        if (value == null) {
            throw new IllegalArgumentException("Warehouse ID cannot be null");
        }
    }
}
