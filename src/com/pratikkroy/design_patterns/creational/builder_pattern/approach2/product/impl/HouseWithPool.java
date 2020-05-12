package com.pratikkroy.design_patterns.creational.builder_pattern.approach2.product.impl;

import com.pratikkroy.design_patterns.creational.builder_pattern.approach2.product.House;

public class HouseWithPool extends House {

    private boolean hasPool;

    public HouseWithPool(){}

    public HouseWithPool(boolean hasRoof, int wallsCount, int windowsCount, boolean hasPool){
        super(hasRoof, wallsCount, windowsCount);
        this.hasPool = hasPool;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(final boolean hasPool) {
        this.hasPool = hasPool;
    }
}
