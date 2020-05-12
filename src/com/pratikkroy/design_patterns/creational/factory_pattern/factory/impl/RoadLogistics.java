package com.pratikkroy.design_patterns.creational.factory_pattern.factory.impl;

import com.pratikkroy.design_patterns.creational.factory_pattern.factory.Logistics;
import com.pratikkroy.design_patterns.creational.factory_pattern.product.Transport;
import com.pratikkroy.design_patterns.creational.factory_pattern.product.impl.Truck;

public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
