package com.andeslogistics.platform.u20241a860.logistics.domain.events;

import com.andeslogistics.platform.u20241a860.shared.domain.events.DomainEvent;

import java.time.Instant;
import java.util.UUID;

public record DeliveryOrderCreatedEvent(String deliveryCode, UUID warehouseId, Instant ocurredAt) implements DomainEvent {

}
