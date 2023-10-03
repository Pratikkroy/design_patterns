package com.pratikkroy.dataobject;

import com.pratikkroy.dataobject.internal.Dimension;
import com.pratikkroy.dataobject.internal.MetricData;
import com.pratikkroy.dataobject.internal.Property;

import java.util.List;

public interface MetricFactory {

    IMetric newMetric();

    IMetric newMetric(List<MetricData> metricDataList, List<Dimension> dimensionList, List<Property> propertyList);
}
