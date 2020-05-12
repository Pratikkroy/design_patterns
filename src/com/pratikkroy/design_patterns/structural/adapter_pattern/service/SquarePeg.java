package com.pratikkroy.design_patterns.structural.adapter_pattern.service;

public class SquarePeg implements SquareShape {
    private double side;

    public SquarePeg(final double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
}
