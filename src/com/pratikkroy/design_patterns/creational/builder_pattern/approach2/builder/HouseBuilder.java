package com.pratikkroy.design_patterns.creational.builder_pattern.approach2.builder;

import com.pratikkroy.design_patterns.creational.builder_pattern.approach2.product.House;

/**
 * replace all the setters with methods with<properties>
 */
public abstract class HouseBuilder {

    private House house;

    public void withHasRoof(final boolean hasRoof){
        this.house.setHasRoof(hasRoof);
    }

    public void withWallsCount(final int wallsCount){
        this.house.setWallsCount(wallsCount);
    }

    public void withWindowsCount(final int windowsCount){
        this.house.setWindowsCount(windowsCount);
    }

    public abstract House getHouse();

    public abstract void reset();
}
