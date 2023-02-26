package com.pratikkroy.designpatterns.creational.factoryPattern.simpleImpl.product;

public class Truck implements Vehicle {
    @Override
    public void deliver() {
        System.out.println("Delivery by Truck");
    }
}
