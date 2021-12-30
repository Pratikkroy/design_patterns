package com.pratikkroy.designpatterns.creational.factoryPattern.factory;

import com.pratikkroy.designpatterns.creational.factoryPattern.product.Train;
import com.pratikkroy.designpatterns.creational.factoryPattern.product.Vehicle;

public class TrainFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Train();
    }
}
