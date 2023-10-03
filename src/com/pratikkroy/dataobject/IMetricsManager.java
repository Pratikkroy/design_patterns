package com.pratikkroy.dataobject;

// To manage multiple metrics instance
public interface IMetricsManager {

    // Gets the current active MetricsObject.
    // if there is no Metrics Object then the Manager is expected to create a new one.
    IMetric get();

    // For Map impl
    default IMetric get(String id) {
        throw new UnsupportedOperationException("get not supported by " + this.getClass());
    }

    // For Map impl
    default void put(String id, IMetric metric) {
        throw new UnsupportedOperationException("put not supported by " + this.getClass());
    }

    // Gets the current 'active' metrics object.
    // if there is none a NULL will be returned
    IMetric peek();

    // Pushes the new metrics into the Metrics Manager
    // and makes it as the active 'working' metrics object
    void push(IMetric metrics);

    // Push a new metrics object created by the manager.
    // This is like push(Metrics) but the metrics object will be
    // created for you in the same manner as get().
    IMetric push();

    // Signals release of a Metrics Instance from the IMetricsManager.
    // It is the duty of the Metrics Manager to interpret whether
    // it should simply modify internal state or
    // if it should also proceed with executing the Metrics.close() as well.
    void pop();

    // Flush all the metrics instance held by the manager
    // and clear underlying data structure
    void flush();

    // clear the underlying data structure without flushing metric
    void clear();

    int size();

    boolean isEmpty();
}
