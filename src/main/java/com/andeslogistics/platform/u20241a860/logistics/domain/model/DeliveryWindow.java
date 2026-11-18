package com.andeslogistics.platform.u20241a860.logistics.domain.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record DeliveryWindow(LocalDateTime startDate, LocalDateTime endDate) {
    public DeliveryWindow {
        if (startDate == null || endDate == null) {
            throw new IllegalArgumentException("Start and end dates cannot be null");
        }
        if (startDate.isAfter(endDate)) {
            throw new IllegalArgumentException("Start date cannot be after end date");
        }

    }
    public boolean include(LocalDate checkDate){
        return (checkDate.isEqual(startDate.toLocalDate()) || checkDate.isEqual(endDate.toLocalDate()) || (checkDate.isAfter(startDate.toLocalDate()) && checkDate.isBefore(endDate.toLocalDate())));
    }


}
