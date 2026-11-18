package com.andeslogistics.platform.u20241a860.logistics.domain.aggregates;

import com.andeslogistics.platform.u20241a860.logistics.domain.events.DeliveryOrderCreatedEvent;
import com.andeslogistics.platform.u20241a860.logistics.domain.model.DeliveryCode;
import com.andeslogistics.platform.u20241a860.logistics.domain.model.DeliveryWindow;
import com.andeslogistics.platform.u20241a860.logistics.domain.model.WarehouseId;
import com.andeslogistics.platform.u20241a860.shared.domain.aggregates.AbstractDomainAggregateRoot;
import com.andeslogistics.platform.u20241a860.shared.domain.valueobjects.DeliveryStatus;

import java.time.Instant;
import java.util.Objects;

public final class DeliveryOrder extends AbstractDomainAggregateRoot {

    private final Long id;
    private final DeliveryCode deliveryCode;
    private final WarehouseId warehouseId;
    private final DeliveryWindow deliveryWindow;
    private final int priorityLevel;
    private final DeliveryStatus deliveryStatus;
    private final String deliveryNotes;
    private final Instant createdAt;
    private final Instant updatedAt;


    public DeliveryOrder(Long id, DeliveryCode deliveryCode, WarehouseId warehouseId, DeliveryWindow deliveryWindow, int priorityLevel, DeliveryStatus deliveryStatus, String deliveryNotes, Instant createdAt, Instant updatedAt) {
        this.id = id;
        this.deliveryCode = Objects.requireNonNull(deliveryCode);
        this.warehouseId = Objects.requireNonNull(warehouseId);
        this.deliveryWindow = Objects.requireNonNull(deliveryWindow);
        this.priorityLevel = priorityLevel;
        this.deliveryStatus = deliveryStatus;
        this.deliveryNotes = deliveryNotes;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public static DeliveryOrder create(DeliveryCode deliveryCode, WarehouseId warehouseId, DeliveryWindow deliveryWindow, int priorityLevel, DeliveryStatus deliveryStatus, String deliveryNotes, Instant createdAt, Instant updatedAt) {

        var deliveryOrder = new DeliveryOrder(null, deliveryCode, warehouseId, deliveryWindow, priorityLevel, deliveryStatus, deliveryNotes, createdAt, updatedAt);
        deliveryOrder.registerEvent(new DeliveryOrderCreatedEvent(deliveryCode.value(), warehouseId.value(), createdAt()));
        return deliveryOrder;
    }

    private static Instant createdAt() {
    }

    public static DeliveryOrder rehydrate(Long id, DeliveryCode deliveryCode, WarehouseId warehouseId, DeliveryWindow deliveryWindow, int priorityLevel, DeliveryStatus deliveryStatus, String deliveryNotes, Instant createdAt, Instant updatedAt) {
        if (id == null || id <=0)  throw new IllegalArgumentException("Invalid delivery order ID");
        return new DeliveryOrder(id, deliveryCode, warehouseId, deliveryWindow, priorityLevel, deliveryStatus, deliveryNotes, createdAt, updatedAt);
    }


    public Long getId() {
        return id;
    }

    public DeliveryCode getDeliveryCode() {
        return deliveryCode;
    }

    public WarehouseId getWarehouseId() {
        return warehouseId;
    }

    public DeliveryWindow getDeliveryWindow() {
        return deliveryWindow;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public String getDeliveryNotes() {
        return deliveryNotes;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }



}
