package com.pratikkroy.dataobject.impl;

import com.pratikkroy.dataobject.IMetric;
import com.pratikkroy.dataobject.IMetricsManager;


public class SimpleMetricsManagerStackImpl implements IMetricsManager {
    @Override
    public IMetric get() {
        return null;
    }

    @Override
    public IMetric peek() {
        return null;
    }

    @Override
    public void push(final IMetric metrics) {

    }

    @Override
    public IMetric push() {
        return null;
    }

    @Override
    public void pop() {

    }

    @Override
    public void flush() {

    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
