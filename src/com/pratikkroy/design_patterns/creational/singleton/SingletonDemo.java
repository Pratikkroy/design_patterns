package com.pratikkroy.design_patterns.creational.singleton;

public class SingletonDemo {
    public static void demo(){
        System.out.println();
        System.out.println("Singleton pattern existing_use.....");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.print("singleton1 == singleton2  ");
        System.out.println(singleton1.hashCode()==singleton2.hashCode());
    }
}
