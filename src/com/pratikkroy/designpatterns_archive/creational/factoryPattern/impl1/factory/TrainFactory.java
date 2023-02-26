package com.pratikkroy.designpatterns.creational.factoryPattern.impl1.factory;

import com.pratikkroy.designpatterns.creational.factoryPattern.impl1.product.Train;
import com.pratikkroy.designpatterns.creational.factoryPattern.impl1.product.Vehicle;

public class TrainFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Train();
    }
}
