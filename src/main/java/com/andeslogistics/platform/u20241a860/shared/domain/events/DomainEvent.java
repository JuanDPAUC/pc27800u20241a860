package com.andeslogistics.platform.u20241a860.shared.domain.events;

import java.time.Instant;

public interface DomainEvent {
    Instant occurredAt();
}
