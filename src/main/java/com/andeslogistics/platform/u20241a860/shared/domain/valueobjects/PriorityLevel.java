package com.andeslogistics.platform.u20241a860.shared.domain.valueobjects;

public record PriorityLevel(int priorityLevel) {
    public PriorityLevel {
        if (priorityLevel < 1 || priorityLevel > 5) {
            throw new IllegalArgumentException("Priority level must be between 1 and 5");
        }
    }
}
