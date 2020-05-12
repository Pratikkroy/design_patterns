package com.pratikkroy.design_patterns.creational.abstract_factory.factory.impl;

import com.pratikkroy.design_patterns.creational.abstract_factory.factory.FurnitureFactory;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.chair.Chair;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.chair.impl.OfficeChair;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.sofa.Sofa;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.sofa.impl.OfficeSofa;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.table.Table;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.table.impl.OfficeTable;

public class OfficeFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair(final String color) {
        return new OfficeChair(color);
    }

    @Override
    public Table createTable(final String color) {
        return new OfficeTable(color);
    }

    @Override
    public Sofa createSofa(final String color) {
        return new OfficeSofa(color);
    }
}
