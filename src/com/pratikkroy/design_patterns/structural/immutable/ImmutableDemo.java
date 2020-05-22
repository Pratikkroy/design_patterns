package com.pratikkroy.design_patterns.structural.immutable;

import com.pratikkroy.design_patterns.structural.immutable.immutable.ImmutableClassExample;
import com.pratikkroy.design_patterns.structural.immutable.private_class_data.MainClass;

public class ImmutableDemo {
    public static void demo(){
        System.out.println();
        System.out.println("ImmutableClassExample demo.....");
        ImmutableClassExample immutableClassExample = new ImmutableClassExample(10);
        ImmutableClassExample immutableClassExample1 = new ImmutableClassExample(20);
        ImmutableClassExample immutableClassExampleSum = immutableClassExample.add(immutableClassExample1);

        System.out.println("object 1 --> " + immutableClassExample);
        System.out.println("object 2 --> " + immutableClassExample1);
        System.out.println("sum of object 1 and object 2 --> " + immutableClassExampleSum);

        System.out.println();
        System.out.println("MainClass demo.....");

        MainClass mainClass = new MainClass(10);
        MainClass mainClass1 = new MainClass(20);
        MainClass mainClassSum = mainClass.add(mainClass1);

        System.out.println("object 1 --> " + mainClass);
        System.out.println("object 2 --> " + mainClass1);
        System.out.println("sum of object 1 and object 2 --> " + mainClassSum);
    }
}
