package com.pratikkroy.designpatterns.creational;

import com.pratikkroy.designpatterns.creational.abstractFactoryPattern.AbstractFactoryPatternDemo;
import com.pratikkroy.designpatterns.creational.builderPattern.simpleImpl.product.BuilderPatternDemo;
import com.pratikkroy.designpatterns.creational.factoryPattern.FactoryPatternDemo;

public class CreationalPatternDemo {

    public static void start() {
        startFactoryPatternDemo();
        startAbstractFactoryPatternDemo();
        startBuilderPatternDemo();
    }

    private static void startFactoryPatternDemo() {
        System.out.println("#######################");
        System.out.println("Start Factory pattern demo");
        FactoryPatternDemo.start();
        System.out.println("End Factory pattern demo");
        System.out.println("#######################");
    }

    private static void startAbstractFactoryPatternDemo() {
        System.out.println("#######################");
        System.out.println("Start Abstract factory pattern demo");
        AbstractFactoryPatternDemo.start();
        System.out.println("End Abstract factory pattern demo");
        System.out.println("#######################");
    }

    private static void startBuilderPatternDemo() {
        System.out.println("#######################");
        System.out.println("Start Builder pattern demo");
        BuilderPatternDemo.start();
        System.out.println("End Builder pattern demo");
        System.out.println("#######################");
    }
}
