package com.pratikkroy.design_patterns.creational.prototype.product;

import com.pratikkroy.design_patterns.creational.prototype.Cloneable;

public abstract class Shape{

    int numberOfSides;

    public Shape(final int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public Shape(Shape target){
        if(target == null)
            return;
        this.numberOfSides = target.numberOfSides;
    }

    public abstract Object clone();

    @Override
    public boolean equals(Object entity) {
        if(this == entity)
            return true;
        if(entity == null || !entity.getClass().equals(this.getClass())){
            return false;
        }

        Shape shape = (Shape)entity;
        if(this.numberOfSides == shape.numberOfSides){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "RoundShape{" + "numberOfSides=" + numberOfSides + '}';
    }
}
