package com.pratikkroy.designpatterns.creational.factoryPattern.factory;

import com.pratikkroy.designpatterns.creational.factoryPattern.product.Truck;
import com.pratikkroy.designpatterns.creational.factoryPattern.product.Vehicle;

public class TruckFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}
