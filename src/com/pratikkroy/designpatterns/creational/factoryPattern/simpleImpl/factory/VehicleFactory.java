package com.pratikkroy.designpatterns.creational.factoryPattern.simpleImpl.factory;

import com.pratikkroy.designpatterns.creational.factoryPattern.Item;
import com.pratikkroy.designpatterns.creational.factoryPattern.simpleImpl.product.Ship;
import com.pratikkroy.designpatterns.creational.factoryPattern.simpleImpl.product.Train;
import com.pratikkroy.designpatterns.creational.factoryPattern.simpleImpl.product.Truck;
import com.pratikkroy.designpatterns.creational.factoryPattern.simpleImpl.product.Vehicle;

public class VehicleFactory {

    public Vehicle createVehicle(final Item item) {
        switch(item.getDeliveredBy()){
            case "SEA":
                return new Ship();

            case "ROAD":
                return new Truck();

            case "RAIL":
                return new Train();

            default:
                return new Truck();
        }
    }
}
