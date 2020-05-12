package com.pratikkroy.design_patterns.creational.builder_pattern.approach2.builder.impl;

import com.pratikkroy.design_patterns.creational.builder_pattern.approach2.builder.HouseBuilder;
import com.pratikkroy.design_patterns.creational.builder_pattern.approach2.product.impl.HouseWithPool;

public class HouseWithPoolBuilder extends HouseBuilder {

    private HouseWithPool houseWithPool;

    public void withHasPool(final boolean hasPool) {
        this.houseWithPool.setHasPool(hasPool);
    }

    @Override
    public HouseWithPool getHouse() {
        return this.houseWithPool;
    }

    @Override
    public void reset() {
        this.houseWithPool = new HouseWithPool();
    }

}
