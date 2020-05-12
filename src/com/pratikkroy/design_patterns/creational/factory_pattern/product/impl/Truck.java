package com.pratikkroy.design_patterns.creational.factory_pattern.product.impl;

import com.pratikkroy.design_patterns.creational.factory_pattern.product.Transport;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliver by Road");
    }
}
