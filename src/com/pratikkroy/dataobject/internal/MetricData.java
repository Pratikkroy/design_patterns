package com.pratikkroy.dataobject.internal;

// Immutable
public class MetricData {

    private final String key;

    private final double value;

    private final Unit unit;

    public MetricData(final String key, final double value, final Unit unit) {
        this.key = key;
        this.value = value;
        this.unit = unit;
    }

    public String getKey() {
        return key;
    }

    public double getValue() {
        return value;
    }

    public Unit getUnit() {
        return unit;
    }
}
