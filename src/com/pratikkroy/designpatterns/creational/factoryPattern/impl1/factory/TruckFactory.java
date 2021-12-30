package com.pratikkroy.designpatterns.creational.factoryPattern.impl1.factory;

import com.pratikkroy.designpatterns.creational.factoryPattern.impl1.product.Truck;
import com.pratikkroy.designpatterns.creational.factoryPattern.impl1.product.Vehicle;

public class TruckFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}
