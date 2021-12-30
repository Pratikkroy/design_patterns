package com.pratikkroy.designpatterns.creational.factoryPattern;

import com.pratikkroy.designpatterns.creational.factoryPattern.director.VehicleDirector;

public class FactoryPatternDemo {
    public static void start() {

        final String deliveredBy = "RAIL";
        System.out.println("Creating a new item with deliveredBy=" + deliveredBy);

        final Item item = new Item(deliveredBy);
        final VehicleDirector vehicleDirector = new VehicleDirector();
        vehicleDirector.deliverItem(item);
    }
}
