package com.pratikkroy.designpatterns.creational.factoryPattern.factory;

import com.pratikkroy.designpatterns.creational.factoryPattern.product.Ship;
import com.pratikkroy.designpatterns.creational.factoryPattern.product.Vehicle;

public class ShipFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Ship();
    }
}
