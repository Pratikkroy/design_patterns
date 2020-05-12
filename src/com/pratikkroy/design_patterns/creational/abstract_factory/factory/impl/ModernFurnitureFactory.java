package com.pratikkroy.design_patterns.creational.abstract_factory.factory.impl;

import com.pratikkroy.design_patterns.creational.abstract_factory.factory.FurnitureFactory;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.chair.Chair;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.chair.impl.ModernChair;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.sofa.Sofa;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.sofa.impl.ModernSofa;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.table.Table;
import com.pratikkroy.design_patterns.creational.abstract_factory.product.table.impl.ModernTable;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair(final String color) {
        return new ModernChair(color);
    }

    @Override
    public Table createTable(final String color) {
        return new ModernTable(color);
    }

    @Override
    public Sofa createSofa(final String color) {
        return new ModernSofa(color);
    }
}
