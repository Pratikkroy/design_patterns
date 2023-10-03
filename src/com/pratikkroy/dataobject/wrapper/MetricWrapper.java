package com.pratikkroy.dataobject.wrapper;

import com.pratikkroy.dataobject.AbstractMetric;
import com.pratikkroy.dataobject.IMetric;
import com.pratikkroy.dataobject.JsonObject;
import com.pratikkroy.dataobject.internal.Dimension;
import com.pratikkroy.dataobject.internal.MetricData;
import com.pratikkroy.dataobject.internal.Property;

public class MetricWrapper extends AbstractMetric implements IMetric {

    private final IMetric wrappedMetric;
    private final IMetric wrapperMetric;

    public MetricWrapper(final IMetric wrappedMetric, final IMetric wrapperMetric) {
        this.wrappedMetric = wrappedMetric;
        this.wrapperMetric = wrapperMetric;
    }

    @Override
    public void putMetricData(final MetricData metricData) {
        this.wrapperMetric.putMetricData(metricData);
        this.wrappedMetric.putMetricData(metricData);
    }

    @Override
    public void putDimension(final Dimension dimension) {
        this.wrapperMetric.putDimension(dimension);
        this.wrappedMetric.putDimension(dimension);
    }

    @Override
    public void putProperty(final Property property) {
        this.wrapperMetric.putProperty(property);
        this.wrappedMetric.putProperty(property);
    }

    @Override
    public void emit() {
        this.wrapperMetric.emit();
        this.wrappedMetric.emit();
    }

    @Override
    public IMetric deepClone() {
        return null;
    }

    @Override
    public IMetric shallowClone() {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public boolean isClosed() {
        return false;
    }

    @Override
    public JsonObject serialize() {
        return null;
    }

    @Override
    public JsonObject beautify() {
        return null;
    }
}
