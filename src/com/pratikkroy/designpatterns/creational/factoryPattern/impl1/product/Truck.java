package com.pratikkroy.designpatterns.creational.factoryPattern.impl1.product;

public class Truck implements Vehicle {
    @Override
    public void deliver() {
        System.out.println("Delivery by Truck");
    }
}
