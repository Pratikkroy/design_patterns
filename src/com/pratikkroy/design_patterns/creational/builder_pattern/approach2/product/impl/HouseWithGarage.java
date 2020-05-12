package com.pratikkroy.design_patterns.creational.builder_pattern.approach2.product.impl;

import com.pratikkroy.design_patterns.creational.builder_pattern.approach2.product.House;

public class HouseWithGarage extends House {

    private boolean hasGarage;

    public HouseWithGarage(){}

    public HouseWithGarage(boolean hasRoof, int wallsCount, int windowsCount, boolean hasPool){
        super(hasRoof, wallsCount, windowsCount);
        this.hasGarage = hasPool;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(final boolean hasGarage) {
        this.hasGarage = hasGarage;
    }
}
