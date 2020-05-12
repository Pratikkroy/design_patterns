package com.pratikkroy.design_patterns.structural.adapter_pattern.adapter;

import com.pratikkroy.design_patterns.structural.adapter_pattern.client.product.RoundShape;
import com.pratikkroy.design_patterns.structural.adapter_pattern.service.SquareShape;

public class SquareShapeAdapter implements RoundShape {

    private SquareShape squareShape;

    public SquareShapeAdapter(SquareShape squareShape){
        this.squareShape = squareShape;
    }

    @Override
    public double getRadius() {
        // Calculate a minimum circle radius, which can fit this ropund hole.
        double result = squareShape.getSide()/(Math.sqrt(2));
        return result;
    }
}
