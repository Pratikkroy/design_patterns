package com.pratikkroy.dataobject;

import com.pratikkroy.dataobject.internal.Dimension;
import com.pratikkroy.dataobject.internal.MetricData;
import com.pratikkroy.dataobject.internal.Property;
import com.pratikkroy.dataobject.props.Cloneable;
import com.pratikkroy.dataobject.props.Closeable;
import com.pratikkroy.dataobject.props.JsonSerializable;

public interface IMetric extends Closeable, Cloneable<IMetric>, JsonSerializable {

    public void putMetricData(MetricData metricData);

    public void putDimension(Dimension dimension);

    public void putProperty(Property property);

    public void emit();

}
