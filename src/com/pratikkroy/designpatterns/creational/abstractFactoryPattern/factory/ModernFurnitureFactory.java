package com.pratikkroy.designpatterns.creational.abstractFactoryPattern.factory;

import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.chair.Chair;
import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.chair.ModernChair;
import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.sofa.ModernSofa;
import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.sofa.Sofa;
import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.table.ModernTable;
import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.table.Table;

public class ModernFurnitureFactory implements FurnitureFactory {

    // instead of directly creating ModernChair instance, we could have created ModernChairFactory class and use that
    // to create ModernChair instance. And same is applicable to Sofa and Table as well.
    @Override
    public Chair createChair(String color) {
        return new ModernChair(color);
    }

    @Override
    public Sofa createSofa(String color) {
        return new ModernSofa(color);
    }

    @Override
    public Table createTable(String color) {
        return new ModernTable(color);
    }
}
