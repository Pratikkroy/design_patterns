package com.pratikkroy.designpatterns.creational.factoryPattern.product;

public class Truck implements Vehicle {
    @Override
    public void deliver() {
        System.out.println("Delivery by Truck");
    }
}
