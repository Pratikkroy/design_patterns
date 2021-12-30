package com.pratikkroy.designpatterns.creational.factoryPattern.product;

public class Train implements Vehicle {
    @Override
    public void deliver() {
        System.out.println("Delivery by Train");
    }
}
