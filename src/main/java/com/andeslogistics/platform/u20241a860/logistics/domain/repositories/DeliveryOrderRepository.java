package com.andeslogistics.platform.u20241a860.logistics.domain.repositories;

import com.andeslogistics.platform.u20241a860.logistics.domain.aggregates.DeliveryOrder;
import com.andeslogistics.platform.u20241a860.logistics.domain.model.DeliveryCode;

public interface DeliveryOrderRepository {
    DeliveryOrder save(DeliveryOrder deliveryOrder);
    boolean existsByDeliveryCode(DeliveryCode deliveryCode);

}
