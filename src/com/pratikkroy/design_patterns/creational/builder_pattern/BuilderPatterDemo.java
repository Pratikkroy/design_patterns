package com.pratikkroy.design_patterns.creational.builder_pattern;

import com.pratikkroy.design_patterns.creational.builder_pattern.approach1.product.House;
//import com.pratikkroy.design_patterns.creational.builder_pattern.approach2.component.House;

/**
 * There are two ways to implement Builder pattern
 * 1. Having a single Hose class with inner static Builder class
 * 2. A component interface with its implementation and a director class
 */
public class BuilderPatterDemo {
    public static void demo(){
        System.out.println();
        System.out.println("Builder pattern existing_use.....");
        House house = new House.Builder()
                        .withHasRoof(true)
                        .withWallsCount(4)
                        .withWindowsCount(6)
                        .build();
        System.out.println(house);


//        House house = new HouseBuilderClient().getHouse("POOL");

    }
}
