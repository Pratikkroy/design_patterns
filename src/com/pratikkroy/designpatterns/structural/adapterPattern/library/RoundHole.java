package com.pratikkroy.designpatterns.structural.adapterPattern.library;

public class RoundHole {
    private double radius;

    public RoundHole(final double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fitsIn(final RoundPeg peg) {
        return this.radius >= peg.getRadius();
    }
}
