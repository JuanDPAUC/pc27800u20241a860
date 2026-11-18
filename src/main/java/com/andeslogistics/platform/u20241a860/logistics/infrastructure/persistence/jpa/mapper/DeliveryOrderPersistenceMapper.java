package com.andeslogistics.platform.u20241a860.logistics.infrastructure.persistence.jpa.mapper;

import com.andeslogistics.platform.u20241a860.logistics.domain.aggregates.DeliveryOrder;
import com.andeslogistics.platform.u20241a860.logistics.infrastructure.persistence.jpa.entities.DeliveryOrderJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class DeliveryOrderPersistenceMapper {
    public DeliveryOrderJpaEntity toEntity(DeliveryOrder deliveryOrder) {
        return new DeliveryOrderJpaEntity(
                deliveryOrder.id(),
                deliveryOrder.deliveryCode(),
                deliveryOrder.warehouseId(),
                deliveryOrder.deliveryWindow(),
                deliveryOrder.priorityLevel(),
                deliveryOrder.deliveryStatus(),
                deliveryOrder.deliveryNotes(),
                deliveryOrder.createdAt(),
                deliveryOrder.updatedAt()
        );
    }

}
