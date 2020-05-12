package com.pratikkroy.design_patterns.creational.factory_pattern.creator;

import com.pratikkroy.design_patterns.creational.factory_pattern.product.Transport;

public abstract class Logistics {

    public abstract Transport createTransport();
}
