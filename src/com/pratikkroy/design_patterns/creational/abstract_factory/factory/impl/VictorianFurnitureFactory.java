package com.pratikkroy.design_patterns.creational.abstract_factory.factory.impl;

import com.pratikkroy.design_patterns.creational.abstract_factory.factory.FurnitureFactory;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.chair.Chair;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.chair.impl.VictorianChair;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.sofa.Sofa;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.sofa.impl.VictorianSofa;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.table.Table;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.table.impl.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair(final String color) {
        return new VictorianChair(color);
    }

    @Override
    public Table createTable(final String color) {
        return new VictorianTable(color);
    }

    @Override
    public Sofa createSofa(final String color) {
        return new VictorianSofa(color);
    }
}
