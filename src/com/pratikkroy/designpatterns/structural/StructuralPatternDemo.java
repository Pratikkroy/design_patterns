package com.pratikkroy.designpatterns.structural;

import com.pratikkroy.designpatterns.structural.adapterPattern.AdapterPatternDemo;

public class StructuralPatternDemo {

    public static void start() {
        startAdapterPatternDemo();

    }

    private static void startAdapterPatternDemo() {
        System.out.println("#######################");
        System.out.println("Start Adapter pattern demo");
        AdapterPatternDemo.start();
        System.out.println("End Adapter pattern demo");
        System.out.println("#######################");
    }
}
