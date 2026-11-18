package com.andeslogistics.platform.u20241a860.logistics.application.internal.commandservices;

import com.andeslogistics.platform.u20241a860.logistics.application.commandservices.DeliveryOrderCommandFailure;
import com.andeslogistics.platform.u20241a860.logistics.application.commandservices.DeliveryOrderCommandService;
import com.andeslogistics.platform.u20241a860.logistics.domain.aggregates.DeliveryOrder;
import com.andeslogistics.platform.u20241a860.logistics.domain.repositories.DeliveryOrderRepository;
import org.hibernate.annotations.SecondaryRow;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Clock;

@Service
public class DeliveryOrderCommandServiceImpl implements DeliveryOrderCommandService {
    private final DeliveryOrderRepository repository;
    private final Clock clock;

    public DeliveryOrderCommandServiceImpl(DeliveryOrderRepository repository, Clock clock) {
        this.repository = repository;
        this.clock = clock;
    }

}
