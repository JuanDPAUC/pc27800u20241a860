package com.andeslogistics.platform.u20241a860.shared.domain.valueobjects;

import java.math.BigDecimal;
import java.math.RoundingMode;

public record Money(BigDecimal value, String currency) {
    public Money {
        if (value == null || value.compareTo(BigDecimal.ZERO) < 0)
            throw new IllegalArgumentException("money.value.error.zero");
        if (currency == null || currency.isBlank())
            throw new IllegalArgumentException("currency.error.blank");
    }
    public Money applyPercentageDiscount(BigDecimal percentage) {
        var discount = value.multiply(percentage).
                divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_EVEN);

        return new Money(value.subtract(discount), currency);
    }
}
