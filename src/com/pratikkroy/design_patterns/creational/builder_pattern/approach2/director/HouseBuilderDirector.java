package com.pratikkroy.design_patterns.creational.builder_pattern.approach2.director;

import com.pratikkroy.design_patterns.creational.builder_pattern.approach2.builder.impl.HouseWithGarageBuilder;
import com.pratikkroy.design_patterns.creational.builder_pattern.approach2.builder.impl.HouseWithPoolBuilder;
import com.pratikkroy.design_patterns.creational.builder_pattern.approach2.product.impl.HouseWithGarage;
import com.pratikkroy.design_patterns.creational.builder_pattern.approach2.product.impl.HouseWithPool;

public class HouseBuilderDirector {


    public HouseWithPool makeHouseWithPool(HouseWithPoolBuilder builder){
        builder.reset();
        builder.withHasRoof(true);
        builder.withWallsCount(4);
        builder.withWindowsCount(6);
        builder.withHasPool(true);

        return builder.getHouse();
    }

    public HouseWithGarage makeHouseWithGarage(HouseWithGarageBuilder builder){
        builder.reset();
        builder.withHasRoof(true);
        builder.withWallsCount(4);
        builder.withWindowsCount(6);
        builder.withHasGarage(true);

        return builder.getHouse();
    }
}
