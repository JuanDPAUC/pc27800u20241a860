package com.andeslogistics.platform.u20241a860.logistics.application.commandservices;

public sealed interface DeliveryOrderCommandFailure permits DeliveryOrderCommandFailure.Duplicate{
    String messageKey();

    record Duplicate() implements DeliveryOrderCommandFailure {
        @Override
        public String messageKey() {
            return "delivery order error duplicate";
        }
    }

}
