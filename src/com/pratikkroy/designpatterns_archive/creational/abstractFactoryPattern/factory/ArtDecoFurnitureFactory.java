package com.pratikkroy.designpatterns.creational.abstractFactoryPattern.factory;

import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.chair.ArtDecoChair;
import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.chair.Chair;
import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.sofa.ArtDecoSofa;
import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.sofa.Sofa;
import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.table.ArtDecoTable;
import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.table.Table;

public class ArtDecoFurnitureFactory implements FurnitureFactory {

    // instead of directly creating ArtDecoChair instance, we could have created ArtDecoChairFactory class and
    // use that to create ArtDecoChair instance. And same is applicable to Sofa and Table as well.
    @Override
    public Chair createChair(final String color) {
        return new ArtDecoChair(color);
    }

    @Override
    public Sofa createSofa(final String color) {
        return new ArtDecoSofa(color);
    }

    @Override
    public Table createTable(final String color) {
        return new ArtDecoTable(color);
    }
}
