package com.andeslogistics.platform.u20241a860.logistics.domain.model;

public record PackageLoad(int quantity, String unit) {
    public PackageLoad {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero");
        }
        if (unit == null || unit.isBlank()) {
            throw new IllegalArgumentException("Unit cannot be null or blank");
        }
    }
    public PackageLoad increaseBy(int additionalQuantity) {
        var increasedQuantity = this.quantity + additionalQuantity;
        if (additionalQuantity <= 0 || increasedQuantity > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Additional quantity must be greater than zero");
        }
        return new PackageLoad(this.quantity + additionalQuantity, this.unit);
    }
}

