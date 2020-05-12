package com.pratikkroy.design_patterns.creational.builder_pattern.approach2.builder.impl;

import com.pratikkroy.design_patterns.creational.builder_pattern.approach2.builder.HouseBuilder;
import com.pratikkroy.design_patterns.creational.builder_pattern.approach2.product.impl.HouseWithGarage;

public class HouseWithGarageBuilder extends HouseBuilder {

    private HouseWithGarage houseWithGarage;

    public void withHasGarage(final boolean hasGarage) {
        this.houseWithGarage.setHasGarage(hasGarage);
    }

    @Override
    public HouseWithGarage getHouse() {
        return this.houseWithGarage;
    }

    @Override
    public void reset() {
        this.houseWithGarage = new HouseWithGarage();
    }
}
