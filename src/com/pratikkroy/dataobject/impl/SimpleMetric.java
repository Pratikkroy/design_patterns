package com.pratikkroy.dataobject.impl;

import com.pratikkroy.dataobject.AbstractMetric;
import com.pratikkroy.dataobject.IMetric;
import com.pratikkroy.dataobject.JsonObject;
import com.pratikkroy.dataobject.internal.Dimension;
import com.pratikkroy.dataobject.internal.MetricData;
import com.pratikkroy.dataobject.internal.Property;

public class SimpleMetric extends AbstractMetric {

    @Override
    public void putMetricData(final MetricData metricData) {
        this.metricDataMap.put(metricData.getKey(), metricData);
    }

    @Override
    public void putDimension(final Dimension dimension) {
        this.dimensionMap.put(dimension.getKey(), dimension);
    }

    @Override
    public void putProperty(final Property property) {
        this.propertyMap.put(property.getKey(), property);
    }

    @Override
    public void emit() {
        System.out.println(this);
    }

    @Override
    public IMetric deepClone() {
        final IMetric metric = new SimpleMetric();
        this.metricDataMap.forEach( (key, md) -> metric.putMetricData(new MetricData(md.getKey(), md.getValue(), md.getUnit())));
        this.dimensionMap.forEach( (key, dim) -> metric.putDimension(new Dimension(dim.getKey(), dim.getValue())));
        this.propertyMap.forEach( (key, prop) -> metric.putProperty(new Property(prop.getKey(), prop.getValue())));
        return metric;
    }

    @Override
    public IMetric shallowClone() {
        final IMetric metric = new SimpleMetric();
        this.metricDataMap.forEach( (key, md) -> metric.putMetricData(md));
        this.dimensionMap.forEach( (key, dim) -> metric.putDimension(dim));
        this.propertyMap.forEach( (key, prop) -> metric.putProperty(prop));
        return metric;
    }

    @Override
    public JsonObject serialize() {
        return new JsonObject();
    }

    @Override
    public JsonObject beautify() {
        return new JsonObject();
    }
}
