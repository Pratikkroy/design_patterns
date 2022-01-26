package com.pratikkroy.designpatterns.structural;

import com.pratikkroy.designpatterns.structural.adapterPattern.AdapterPatternDemo;
import com.pratikkroy.designpatterns.structural.bridgePattern.BridgePatternDemo;
import com.pratikkroy.designpatterns.structural.compositePattern.CompositePatternDemo;

public class StructuralPatternDemo {

    public static void start() {
        startAdapterPatternDemo();
        startBridgePatternDemo();
        startCompositePatternDemo();
    }

    private static void startAdapterPatternDemo() {
        System.out.println("#######################");
        System.out.println("Start Adapter pattern demo");
        AdapterPatternDemo.start();
        System.out.println("End Adapter pattern demo");
        System.out.println("#######################");
    }

    private static void startBridgePatternDemo() {
        System.out.println("#######################");
        System.out.println("Start Bridge pattern demo");
        BridgePatternDemo.start();
        System.out.println("End Bridge pattern demo");
        System.out.println("#######################");
    }

    private static void startCompositePatternDemo() {
        System.out.println("#######################");
        System.out.println("Start Composite pattern demo");
        CompositePatternDemo.start();
        System.out.println("End Composite pattern demo");
        System.out.println("#######################");
    }
}
