package com.andeslogistics.platform.u20241a860.logistics.infrastructure.persistence.jpa.entities;

import jakarta.persistence.*;


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

}
