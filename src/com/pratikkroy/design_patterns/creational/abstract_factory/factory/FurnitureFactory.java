package com.pratikkroy.design_patterns.creational.abstract_factory.factory;

import com.pratikkroy.design_patterns.creational.abstract_factory.product.chair.Chair;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.sofa.Sofa;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.table.Table;

public interface FurnitureFactory {

    Chair createChair(String color);

    Table createTable(String color);

    Sofa createSofa(String color);
}
