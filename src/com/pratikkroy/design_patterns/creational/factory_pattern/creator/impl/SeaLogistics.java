package com.pratikkroy.design_patterns.creational.factory_pattern.creator.impl;

import com.pratikkroy.design_patterns.creational.factory_pattern.creator.Logistics;
import com.pratikkroy.design_patterns.creational.factory_pattern.product.Transport;
import com.pratikkroy.design_patterns.creational.factory_pattern.product.impl.Ship;

public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
