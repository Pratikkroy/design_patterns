package com.pratikkroy.dataobject.impl;

import com.pratikkroy.dataobject.IMetric;
import com.pratikkroy.dataobject.MetricFactory;
import com.pratikkroy.dataobject.internal.Dimension;
import com.pratikkroy.dataobject.internal.MetricData;
import com.pratikkroy.dataobject.internal.Property;

import java.util.List;

public class SimpleMetricFactory implements MetricFactory {

    @Override
    public IMetric newMetric() {
        return null;
    }

    @Override
    public IMetric newMetric(final List<MetricData> metricDataList, final List<Dimension> dimensionList,
            final List<Property> propertyList) {
        return null;
    }
}
