package com.pratikkroy.designpatterns_archive.creational.prototypePattern;

public class PrototypePatternDemo {
    public static void start() {

        int height = 10;
        int width = 20;
        System.out.println("Creating a Rectangle object with height="+height+" and width="+width);
        Rectangle rectangle1 = new Rectangle(10, 20);

        System.out.println("Cloning the created object");
        Rectangle rectangle2 = rectangle1.clone();
        System.out.println("Cloned object Rectangle. height="+rectangle2.getHeight()+" and width="+rectangle2.getWidth());
    }
}
