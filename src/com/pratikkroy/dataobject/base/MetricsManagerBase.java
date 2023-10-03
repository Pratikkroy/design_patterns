package com.pratikkroy.dataobject.base;

import com.pratikkroy.dataobject.IMetric;
import com.pratikkroy.dataobject.IMetricsManager;

public class MetricsManagerBase implements IMetricsManager {

    private final ThreadLocal<IMetricsManager> metricsManager;

    protected MetricsManagerBase() {
        this.metricsManager = new ThreadLocal<IMetricsManager>();
    }

    /**
     * Returns this manager for use by the enclosing class.
     * @return this instance
     */
    protected MetricsManagerBase internal() { return this; }

    /**
     * Sets the {@code IMetric} instance for the current thread.
     * @param localMetricsManager the {@code IMetric} instance to be used by the current thread
     * @return the {@code IMetric} instance local to the current thread
     */
    protected void set( final IMetricsManager localMetricsManager ) {
        metricsManager.set(localMetricsManager);
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
    protected IMetricsManager current() {
        return metricsManager.get();
    }

    /**
     * Returns an instance suitable for injection into components which need to collect metrics.
     * @return the injectable metrics manager
     */
    public IMetricsManager manager() { return this; }


    @Override
    public IMetric get() {
        return metricsManager.get().get();
    }

    @Override
    public IMetric peek() {
        return metricsManager.get().peek();
    }

    @Override
    public void push(final IMetric metrics) {
        metricsManager.get().push(metrics);
    }

    @Override
    public IMetric push() {
        return metricsManager.get().push();
    }

    @Override
    public void pop() {
        metricsManager.get().pop();
    }

    @Override
    public void flush() {
        metricsManager.get().flush();
    }

    @Override
    public void clear() {
        metricsManager.get().clear();
    }

    @Override
    public int size() {
        return metricsManager.get().size();
    }

    @Override
    public boolean isEmpty() {
        return metricsManager.get().isEmpty();
    }
}
