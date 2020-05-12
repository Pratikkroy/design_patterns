package com.pratikkroy.design_patterns.structural.adapter_pattern.client.product.impl;

import com.pratikkroy.design_patterns.structural.adapter_pattern.client.product.RoundShape;

public class RoundPeg implements RoundShape {

    private double radius;

    public RoundPeg() {}

    public RoundPeg(final double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
