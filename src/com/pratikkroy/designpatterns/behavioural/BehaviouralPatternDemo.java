package com.pratikkroy.designpatterns.behavioural;

import com.pratikkroy.designpatterns.behavioural.chainOfResponsibilityPattern.ChainOfResponsibilityPatternDemo;
import com.pratikkroy.designpatterns.structural.adapterPattern.AdapterPatternDemo;

public class BehaviouralPatternDemo {

    public static void start() {
        startChainOfResponsibilityPatternDemo();
    }

    private static void startChainOfResponsibilityPatternDemo() {
        System.out.println("#######################");
        System.out.println("Start ChainOfResponsibility pattern demo");
        ChainOfResponsibilityPatternDemo.start();
        System.out.println("End ChainOfResponsibility pattern demo");
        System.out.println("#######################");
    }

}
