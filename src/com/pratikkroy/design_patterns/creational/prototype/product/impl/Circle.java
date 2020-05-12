package com.pratikkroy.design_patterns.creational.prototype.product.impl;

import com.pratikkroy.design_patterns.creational.prototype.product.Shape;

public class Circle extends Shape {
    public int radius;

    public Circle(final int radius) {
        super(0);
        this.radius = radius;
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Object clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object entity) {
        if(!super.equals(entity))
            return false;
        Circle circle = (Circle) entity;
        if(this.radius == circle.radius){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        super.toString();
        return "Circle{" + "radius=" + radius + '}';
    }
}
