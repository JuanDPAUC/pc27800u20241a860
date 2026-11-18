package com.andeslogistics.platform.u20241a860.logistics.infrastructure.persistence.jpa.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.time.LocalDate;


@Entity
@Table(name = "delivery_orders", uniqueConstraints = @UniqueConstraint(name = "uk_delivery_order_delivery_code", columnNames = "delivery_code"))
public class DeliveryOrderJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "delivery_code", nullable = false)
    private String deliveryCode;
    @Column(name = "warehouse_id", nullable = false)
    private String warehouseId;
    @Column(name = "package_low_quantity", nullable = false)
    private String packageLowQuantity;
    @Column(name = "package_low_unit", nullable = false)
    private String packageLowUnit;
    @Column(name = "delivery_window_start", nullable = false)
    private LocalDate deliveryWindowStart;
    @Column(name = "delivery_window_end", nullable = false)
    private LocalDate deliveryWindowEnd;
    @Column(name = "priority_level", nullable = false)
    private int priorityLevel;
    @Enumerated(EnumType.STRING)
    @Column(name = "delivery_status", nullable = false)
    private String deliveryStatus;
    @Column(name = "delivery_notes", length = 500)
    private String deliveryNotes;
    @Column(name = "created_at", nullable = false, updatable = false)
    private java.time.Instant createdAt;
    @Column(name = "updated_at", nullable = false)
    private java.time.Instant updatedAt;


    protected DeliveryOrderJpaEntity() {}

    public Long getId() {
        return id;
    }

    public String getDeliveryCode() {
        return deliveryCode;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public String getPackageLowQuantity() {
        return packageLowQuantity;
    }

    public String getPackageLowUnit() {
        return packageLowUnit;
    }

    public LocalDate getDeliveryWindowStart() {
        return deliveryWindowStart;
    }

    public LocalDate getDeliveryWindowEnd() {
        return deliveryWindowEnd;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public String getDeliveryStatus() {
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

    public DeliveryOrderJpaEntity(Long id, String deliveryCode, String warehouseId, String packageLowQuantity, String packageLowUnit, LocalDate deliveryWindowStart, LocalDate deliveryWindowEnd, int priorityLevel, String deliveryStatus, String deliveryNotes) {
        this.id = id;
        this.deliveryCode = deliveryCode;
        this.warehouseId = warehouseId;
        this.packageLowQuantity = packageLowQuantity;
        this.packageLowUnit = packageLowUnit;
        this.deliveryWindowStart = deliveryWindowStart;
        this.deliveryWindowEnd = deliveryWindowEnd;
        this.priorityLevel = priorityLevel;
        this.deliveryStatus = deliveryStatus;
        this.deliveryNotes = deliveryNotes;
    }


}
