package com.pratikkroy.design_patterns.creational.builder_pattern.approach2.product;

/**
 * replace all the setters with methods with<properties>
 */
public abstract class House {

    private boolean hasRoof;
    private int wallsCount;
    private int windowsCount;

    public House(){}

    public House(boolean hasRoof, int wallsCount, int windowsCount){
        this.hasRoof = hasRoof;
        this.wallsCount = wallsCount;
        this.windowsCount = windowsCount;
    }

    public boolean isHasRoof() {
        return hasRoof;
    }

    public void setHasRoof(final boolean hasRoof) {
        this.hasRoof = hasRoof;
    }

    public int getWallsCount() {
        return wallsCount;
    }

    public void setWallsCount(final int wallsCount) {
        this.wallsCount = wallsCount;
    }

    public int getWindowsCount() {
        return windowsCount;
    }

    public void setWindowsCount(final int windowsCount) {
        this.windowsCount = windowsCount;
    }
}
