package com.pratikkroy.design_patterns.creational.builder_pattern.approach1.product;

/**
 * No setter methods.
 * Properties will be set using Builder
 */
public class House {
    private boolean hasRoof;
    private int wallsCount;
    private int windowsCount;

    public House(boolean hasRoof, int wallsCount, int windowsCount){
        this.hasRoof = hasRoof;
        this.wallsCount = wallsCount;
        this.windowsCount = windowsCount;
    }

    public boolean getHasRoof() {
        return hasRoof;
    }

    public int getWallsCount() {
        return wallsCount;
    }

    public int getWindowsCount() {
        return windowsCount;
    }

    public String toString(){
        return "hasRoof:: " + this.hasRoof + "\n"
                + "wallsCount:: " + this.wallsCount + "\n"
                + "windowsCount:: " + this.windowsCount + "\n";
    }

    public static class Builder{

        private boolean hasRoof;
        private int wallsCount;
        private int windowsCount;

        public Builder withHasRoof(boolean hasRoof){
            this.hasRoof = hasRoof;
            return this;
        }

        public Builder withWallsCount(int wallsCount){
            this.wallsCount = wallsCount;
            return this;
        }

        public Builder withWindowsCount(int windowsCount){
            this.windowsCount = windowsCount;
            return this;
        }

        public House build(){
            return new House(this.hasRoof, this.wallsCount,this.windowsCount);
        }
    }
}
