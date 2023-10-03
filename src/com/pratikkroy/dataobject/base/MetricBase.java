package com.pratikkroy.dataobject.base;

import com.pratikkroy.dataobject.AbstractMetric;
import com.pratikkroy.dataobject.IMetric;
import com.pratikkroy.dataobject.JsonObject;
import com.pratikkroy.dataobject.internal.Dimension;
import com.pratikkroy.dataobject.internal.MetricData;
import com.pratikkroy.dataobject.internal.Property;

// use to manage thread access
public abstract class MetricBase extends AbstractMetric implements IMetric {

    private final ThreadLocal<IMetric> metric;

    protected MetricBase() {
        this.metric = new ThreadLocal<IMetric>();
    }

    /**
     * Returns this manager for use by the enclosing class.
     * @return this instance
     */
    protected MetricBase internal() { return this; }

    /**
     * Sets the {@code IMetric} instance for the current thread.
     * @param localMetrics the {@code IMetric} instance to be used by the current thread
     * @return the {@code IMetric} instance local to the current thread
     */
    protected void set( final IMetric localMetrics ) {
        metric.set(localMetrics);
    }

    /**
     * Returns the {@code IMetric} instance for the current thread.
     *
     * NOTE: Use with caution.
     *
     * Use this only to extend functionality not provided by the {@code IMetric}. For
     * instance when setting the metrics from the current thread on a async task.
     *
     * @throws UnsupportedOperationException if current is called before set is called
     * @return the {@code SimpleMetrics} instance local to the current thread
     */
    protected IMetric current() {
        return metric.get();
    }

    /**
     * Returns an instance suitable for injection into components which need to collect metrics.
     * @return the injectable metrics manager
     */
    public IMetric manager() { return this; }

    @Override
    public void putMetricData(final MetricData metricData) {
        metric.get().putMetricData(metricData);
    }

    @Override
    public void putDimension(final Dimension dimension) {
        metric.get().putDimension(dimension);
    }

    @Override
    public void putProperty(final Property property) {
        metric.get().putProperty(property);
    }

    @Override
    public void emit() {
        metric.get().emit();
    }

    @Override
    public IMetric deepClone() {
        return metric.get().deepClone();
    }

    @Override
    public IMetric shallowClone() {
        return metric.get().shallowClone();
    }

    @Override
    public JsonObject serialize() {
        return metric.get().serialize();
    }

    @Override
    public JsonObject beautify() {
        return metric.get().beautify();
    }
}
