package com.andeslogistics.platform.u20241a860.logistics.infrastructure.persistence.jpa.mapper;

import com.andeslogistics.platform.u20241a860.logistics.domain.aggregates.DeliveryOrder;
import com.andeslogistics.platform.u20241a860.logistics.infrastructure.persistence.jpa.entities.DeliveryOrderJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class DeliveryOrderPersistenceMapper {
    public DeliveryOrderJpaEntity toEntity(DeliveryOrder deliveryOrder) {
        return new DeliveryOrderJpaEntity(
                deliveryOrder.getId(),
                deliveryOrder.getDeliveryCode().value().toString(),
                deliveryOrder.getWarehouseId().value().toString(),
                deliveryOrder.getPackageLoad() != null ? deliveryOrder.getPackageLoad().getPackageLowQuantity().value().toString() : null,
                deliveryOrder.getPackageLoad() != null ? deliveryOrder.getPackageLoad().getPackageLowUnit().value().toString() : null,
                deliveryOrder.getDeliveryWindow().getDeliveryWindowStart(),
                deliveryOrder.getDeliveryWindow().getDeliveryWindowEnd(),
                deliveryOrder.getPriorityLevel(),
                deliveryOrder.getDeliveryStatus().toString(),
                deliveryOrder.getDeliveryNotes(),
                deliveryOrder.getCreatedAt(),
                deliveryOrder.getUpdatedAt()
        );
    }

}
