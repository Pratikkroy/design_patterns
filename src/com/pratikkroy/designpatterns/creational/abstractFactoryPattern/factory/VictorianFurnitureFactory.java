package com.pratikkroy.designpatterns.creational.abstractFactoryPattern.factory;

import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.chair.Chair;
import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.chair.VictorianChair;
import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.sofa.Sofa;
import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.sofa.VictorianSofa;
import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.table.Table;
import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.table.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactory {

    // instead of directly creating VictorianChair instance, we could have created VictorianChairFactory class and
    // use that to create VictorianChair instance. And same is applicable to Sofa and Table as well.
    @Override
    public Chair createChair(final String color) {
        return new VictorianChair(color);
    }

    @Override
    public Sofa createSofa(final String color) {
        return new VictorianSofa(color);
    }

    @Override
    public Table createTable(final String color) {
        return new VictorianTable(color);
    }
}
