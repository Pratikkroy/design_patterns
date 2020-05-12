package com.pratikkroy.design_patterns.structural.adapter_pattern.client.existing_use;

import com.pratikkroy.design_patterns.structural.adapter_pattern.client.product.RoundShape;

/**
 * This is just a util object, used by client to do some work.
 */
public class RoundHole {

    private double radius;

    public RoundHole(final double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fitsIn(RoundShape shape){
        return this.radius >= shape.getRadius();
    }
}
