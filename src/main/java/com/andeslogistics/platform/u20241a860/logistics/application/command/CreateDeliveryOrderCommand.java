package com.andeslogistics.platform.u20241a860.logistics.application.command;

import com.andeslogistics.platform.u20241a860.logistics.domain.model.DeliveryCode;
import com.andeslogistics.platform.u20241a860.logistics.domain.model.DeliveryWindow;
import com.andeslogistics.platform.u20241a860.logistics.domain.model.PackageLoad;
import com.andeslogistics.platform.u20241a860.logistics.domain.model.WarehouseId;
import com.andeslogistics.platform.u20241a860.shared.domain.valueobjects.DeliveryStatus;

public class CreateDeliveryOrderCommand {
    private final DeliveryCode deliveryCode;
    private final WarehouseId warehouseId;
    private final DeliveryWindow deliveryWindow;
    private final PackageLoad packageLoad;
    private final int priorityLevel;
    private final DeliveryStatus deliveryStatus;
    private final String deliveryNotes;

    public CreateDeliveryOrderCommand(DeliveryCode deliveryCode, WarehouseId warehouseId, DeliveryWindow deliveryWindow, PackageLoad packageLoad, int priorityLevel, DeliveryStatus deliveryStatus, String deliveryNotes) {
        this.deliveryCode = deliveryCode;
        this.warehouseId = warehouseId;
        this.deliveryWindow = deliveryWindow;
        this.packageLoad = packageLoad;
        this.priorityLevel = priorityLevel;
        this.deliveryStatus = deliveryStatus;
        this.deliveryNotes = deliveryNotes;
    }

    // Getters
}