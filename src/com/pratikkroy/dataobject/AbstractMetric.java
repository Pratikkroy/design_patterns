package com.pratikkroy.dataobject;

import com.pratikkroy.dataobject.internal.Dimension;
import com.pratikkroy.dataobject.internal.MetricData;
import com.pratikkroy.dataobject.internal.Property;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractMetric implements IMetric {

    private boolean closed = false;

    protected final Map<String, MetricData> metricDataMap = new HashMap<>();
    protected final Map<String, Dimension> dimensionMap = new HashMap<>();
    protected final Map<String, Property>  propertyMap  = new HashMap<>();

    @Override
    public void close() {
        closed = true;
    }

    @Override
    public boolean isClosed() {
        return closed;
    }

    public boolean isEmpty() {
        return metricDataMap.isEmpty() && dimensionMap.isEmpty() && propertyMap.isEmpty();
    }

    public long size() {
        return metricDataMap.size() + dimensionMap.size() + propertyMap.size();
    }

    public String toString() {
        return "{"
                + "metricData=[" + metricDataMap +"]"
                + "dimensions=[" + dimensionMap +"]"
                + "properties=[" + propertyMap +"]"
                + "}";
    }
}
