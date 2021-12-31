package com.pratikkroy.designpatterns.creational.factoryPattern.impl1.director;

import com.pratikkroy.designpatterns.creational.factoryPattern.Item;
import com.pratikkroy.designpatterns.creational.factoryPattern.impl1.factory.ShipFactory;
import com.pratikkroy.designpatterns.creational.factoryPattern.impl1.factory.TrainFactory;
import com.pratikkroy.designpatterns.creational.factoryPattern.impl1.factory.TruckFactory;
import com.pratikkroy.designpatterns.creational.factoryPattern.impl1.factory.VehicleFactory;
import com.pratikkroy.designpatterns.creational.factoryPattern.impl1.product.Vehicle;

public class VehicleFactoryDirector {

    private final VehicleFactory vehicleFactory;
    public VehicleFactoryDirector (final String deliveredBy) {
        switch(deliveredBy){
        case "SEA":
            this.vehicleFactory = new ShipFactory();
            break;
        case "ROAD":
            this.vehicleFactory = new TruckFactory();
            break;

        case "RAIL":
            this.vehicleFactory = new TrainFactory();
            break;

        default:
            this.vehicleFactory = new TruckFactory();
        }
    }

    public Vehicle createVehicle() {
        return vehicleFactory.createVehicle();
    }

}
