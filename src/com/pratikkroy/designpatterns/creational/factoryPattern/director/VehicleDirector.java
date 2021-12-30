package com.pratikkroy.designpatterns.creational.factoryPattern.director;

import com.pratikkroy.designpatterns.creational.factoryPattern.Item;
import com.pratikkroy.designpatterns.creational.factoryPattern.factory.ShipFactory;
import com.pratikkroy.designpatterns.creational.factoryPattern.factory.TrainFactory;
import com.pratikkroy.designpatterns.creational.factoryPattern.factory.TruckFactory;
import com.pratikkroy.designpatterns.creational.factoryPattern.factory.VehicleFactory;
import com.pratikkroy.designpatterns.creational.factoryPattern.product.Vehicle;

public class VehicleDirector {

    public void deliverItem(Item item) {
        final VehicleFactory vehicleFactory = getVehicleFactory(item);

        final Vehicle vehicle = vehicleFactory.createVehicle();

        vehicle.deliver();
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
