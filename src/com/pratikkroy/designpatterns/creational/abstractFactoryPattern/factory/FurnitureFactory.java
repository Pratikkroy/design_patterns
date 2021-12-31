package com.pratikkroy.designpatterns.creational.abstractFactoryPattern.factory;

import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.chair.Chair;
import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.sofa.Sofa;
import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.product.table.Table;

public interface FurnitureFactory {

    Chair createChair(String color);

    Sofa createSofa(String color);

    Table createTable(String color);
}
