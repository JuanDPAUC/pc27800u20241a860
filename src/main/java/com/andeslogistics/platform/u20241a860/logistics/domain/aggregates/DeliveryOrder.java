package com.andeslogistics.platform.u20241a860.logistics.domain.aggregates;

import com.andeslogistics.platform.u20241a860.logistics.domain.events.DeliveryOrderCreatedEvent;
import com.andeslogistics.platform.u20241a860.logistics.domain.model.DeliveryCode;
import com.andeslogistics.platform.u20241a860.logistics.domain.model.DeliveryWindow;
import com.andeslogistics.platform.u20241a860.logistics.domain.model.PackageLoad;
import com.andeslogistics.platform.u20241a860.logistics.domain.model.WarehouseId;
import com.andeslogistics.platform.u20241a860.logistics.infrastructure.persistence.jpa.entities.DeliveryOrderJpaEntity;
import com.andeslogistics.platform.u20241a860.shared.domain.aggregates.AbstractDomainAggregateRoot;
import com.andeslogistics.platform.u20241a860.shared.domain.valueobjects.DeliveryStatus;

import java.time.Instant;
import java.util.Objects;

public final class DeliveryOrder extends AbstractDomainAggregateRoot {

    private final Long id;
    private final DeliveryCode deliveryCode;
    private final WarehouseId warehouseId;
    private final DeliveryWindow deliveryWindow;
    private final PackageLoad packageLoad;
    private final int priorityLevel;
    private final DeliveryStatus deliveryStatus;
    private final String deliveryNotes;
    private final Instant createdAt;
    private final Instant updatedAt;


    public DeliveryOrder(Long id, DeliveryCode deliveryCode, WarehouseId warehouseId, DeliveryWindow deliveryWindow, PackageLoad packageLoad, int priorityLevel, DeliveryStatus deliveryStatus, String deliveryNotes, Instant createdAt, Instant updatedAt) {
        this.id = id;
        this.deliveryCode = Objects.requireNonNull(deliveryCode);
        this.warehouseId = Objects.requireNonNull(warehouseId);
        this.deliveryWindow = Objects.requireNonNull(deliveryWindow);
        this.packageLoad = packageLoad;
        this.priorityLevel = priorityLevel;
        this.deliveryStatus = deliveryStatus;
        this.deliveryNotes = deliveryNotes;
        this.createdAt = Objects.requireNonNull(createdAt);
        this.updatedAt = Objects.requireNonNull(updatedAt);
    }

    public static DeliveryOrder create(DeliveryCode deliveryCode, WarehouseId warehouseId, DeliveryWindow deliveryWindow, int priorityLevel, DeliveryStatus deliveryStatus, String deliveryNotes, Instant now) {

        var deliveryOrder = new DeliveryOrder(null, deliveryCode, warehouseId, deliveryWindow, null, priorityLevel, deliveryStatus, deliveryNotes, now, now);
        deliveryOrder.registerEvent(new DeliveryOrderCreatedEvent(deliveryCode.value(), now));
        return deliveryOrder;
    }

    private static Instant createdAt() {
        return Instant.now();
    }

    public static DeliveryOrder rehydrate(Long id, DeliveryCode deliveryCode, WarehouseId warehouseId, DeliveryWindow deliveryWindow, PackageLoad packageLoad, int priorityLevel, DeliveryStatus deliveryStatus, String deliveryNotes, Instant createdAt, Instant updatedAt) {
        if (id == null || id <=0)  throw new IllegalArgumentException("Invalid delivery order ID");
        return new DeliveryOrder(id, deliveryCode, warehouseId, deliveryWindow, packageLoad, priorityLevel, deliveryStatus, deliveryNotes, createdAt, updatedAt);
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
    public PackageLoad getPackageLoad() {
        return packageLoad;
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


    public DeliveryOrderJpaEntity getPackageLoad() {
    }
}
