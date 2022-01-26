package com.pratikkroy.designpatterns.structural.adapterPattern.library;

public class RoundPeg {
    private double radius;

    public RoundPeg(final double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(final double radius) {
        this.radius = radius;
    }
}
