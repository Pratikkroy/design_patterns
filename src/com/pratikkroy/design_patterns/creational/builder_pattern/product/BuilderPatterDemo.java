package com.pratikkroy.design_patterns.creational.builder_pattern.product;

/**
 * There are two ways to implement Builder pattern
 * 1. Having a single Hose class with inner static Builder class
 * 2. A product interface with its implementation and a director class
 */
public class BuilderPatterDemo {
    public static void demo(){

        House house = new House.Builder()
                        .withHasRoof(true)
                        .withWallsCount(4)
                        .withWindowsCount(6)
                        .build();
        System.out.println(house);

    }
}
