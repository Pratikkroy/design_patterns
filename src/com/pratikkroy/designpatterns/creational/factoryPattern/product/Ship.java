package com.pratikkroy.designpatterns.creational.factoryPattern.product;

public class Ship implements Vehicle {
    @Override
    public void deliver() {
        System.out.println("Delivery by Ship");
    }
}
