package com.pratikkroy.design_patterns.creational.prototype.product.impl;

import com.pratikkroy.design_patterns.creational.prototype.product.Shape;

public class Rectangle extends Shape {

    public int width;
    public int height;

    public Rectangle(final int width, final int height) {
        super(4);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object entity) {
        if(!super.equals(entity))
            return false;
        Rectangle rectangle = (Rectangle) entity;
        if(this.width == rectangle.width && this.height == rectangle.height){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        super.toString();
        return "Rectangle{" + "width=" + width + ", height=" + height + '}';
    }
}
