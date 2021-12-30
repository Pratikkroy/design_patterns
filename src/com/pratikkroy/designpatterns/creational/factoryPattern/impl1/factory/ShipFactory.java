package com.pratikkroy.designpatterns.creational.factoryPattern.impl1.factory;

import com.pratikkroy.designpatterns.creational.factoryPattern.impl1.product.Ship;
import com.pratikkroy.designpatterns.creational.factoryPattern.impl1.product.Vehicle;

public class ShipFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Ship();
    }
}
