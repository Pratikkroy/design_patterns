package com.pratikkroy.designpatterns.creational.factoryPattern;

import com.pratikkroy.designpatterns.creational.factoryPattern.impl1.director.VehicleFactoryDirector;
import com.pratikkroy.designpatterns.creational.factoryPattern.impl1.product.Vehicle;
import com.pratikkroy.designpatterns.creational.factoryPattern.simpleImpl.factory.VehicleFactory;

public class FactoryPatternDemo {
    public static void start() {

        final String deliveredBy = "SEA";
        System.out.println("Creating a new item with deliveredBy=" + deliveredBy);
        final Item item = new Item(deliveredBy);

        startImplementation1(item);
        startImplementation2(item);
    }

    private static void startImplementation1(Item item) {
        final VehicleFactoryDirector vehicleFactoryDirector = new VehicleFactoryDirector(item.getDeliveredBy());
        final Vehicle vehicle = vehicleFactoryDirector.createVehicle();

        vehicle.deliver();
    }

    private static void startImplementation2(Item item) {
        final VehicleFactory vehicleFactory = new VehicleFactory();
        final com.pratikkroy.designpatterns.creational.factoryPattern.simpleImpl.product.Vehicle vehicle =
                vehicleFactory.createVehicle(item);

        vehicle.deliver();
    }
}
