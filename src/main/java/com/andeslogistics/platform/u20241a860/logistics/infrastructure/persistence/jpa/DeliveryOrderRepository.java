package com.andeslogistics.platform.u20241a860.logistics.infrastructure.persistence.jpa;

import com.andeslogistics.platform.u20241a860.logistics.domain.aggregates.DeliveryOrder;
import com.andeslogistics.platform.u20241a860.logistics.domain.model.DeliveryCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryOrderRepository extends JpaRepository<DeliveryOrder, Long> {
    boolean existsByDeliveryCode(DeliveryCode deliveryCode);
}
