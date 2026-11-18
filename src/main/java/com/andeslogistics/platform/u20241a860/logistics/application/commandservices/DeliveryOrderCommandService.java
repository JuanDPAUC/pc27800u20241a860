package com.andeslogistics.platform.u20241a860.logistics.application.commandservices;

import com.andeslogistics.platform.u20241a860.logistics.domain.aggregates.DeliveryOrder;
import com.andeslogistics.platform.u20241a860.shared.application.result.Result;

public interface DeliveryOrderCommandService {
    Result<DeliveryOrder> create(DeliveryOrder deliveryOrder);
}
