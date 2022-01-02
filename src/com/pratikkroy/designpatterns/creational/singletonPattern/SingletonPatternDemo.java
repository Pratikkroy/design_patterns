package com.pratikkroy.designpatterns.creational.singletonPattern;

public class SingletonPatternDemo {

    public static void start(){
        System.out.println("Creating a new object of Singleton");
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("Creating a another object of Singleton");
        Singleton singleton2 = Singleton.getInstance();

        System.out.print("compare their hashcode. singleton1 == singleton2 is ");
        System.out.println(singleton1.hashCode()==singleton2.hashCode());
    }
}
