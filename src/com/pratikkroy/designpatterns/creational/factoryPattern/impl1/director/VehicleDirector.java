package com.pratikkroy.designpatterns.creational.factoryPattern.impl1.director;

import com.pratikkroy.designpatterns.creational.factoryPattern.Item;
import com.pratikkroy.designpatterns.creational.factoryPattern.impl1.factory.ShipFactory;
import com.pratikkroy.designpatterns.creational.factoryPattern.impl1.factory.TrainFactory;
import com.pratikkroy.designpatterns.creational.factoryPattern.impl1.factory.TruckFactory;
import com.pratikkroy.designpatterns.creational.factoryPattern.impl1.factory.VehicleFactory;
import com.pratikkroy.designpatterns.creational.factoryPattern.impl1.product.Vehicle;

public class VehicleDirector {

    public Vehicle createVehicle(Item item) {
        VehicleFactory vehicleFactory = getVehicleFactory(item);
        return vehicleFactory.createVehicle();
    }

    private VehicleFactory getVehicleFactory(Item item) {
        switch(item.getDeliveredBy()){
            case "SEA":
                return new ShipFactory();

            case "ROAD":
                return new TruckFactory();

            case "RAIL":
                return new TrainFactory();

            default:
                return new TruckFactory();
        }
    }
}
