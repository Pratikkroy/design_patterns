package com.pratikkroy.design_patterns.structural.immutable.private_class_data;

/**
 * only private fields and getter method
 */
public class DataClass {

    // immutable obj container
    private final int x;

    DataClass(int x){
        this.x = x;
    }

    public int getX(){
        return this.x;
    }
}
