package com.pratikkroy.design_patterns.creational.prototype;

import com.pratikkroy.design_patterns.creational.prototype.product.Shape;
import com.pratikkroy.design_patterns.creational.prototype.product.impl.Rectangle;

public class PrototypeDemo {
    public static void demo(){
        System.out.println();
        System.out.println("Prototype pattern existing_use.....");

        Shape rectangle = new Rectangle(10,5);
        System.out.println("rectangle1  "+rectangle);

        Shape newRectangle = (Rectangle) rectangle.clone();
        System.out.println("rectangle2  "+ rectangle);

        System.out.println("rectangle1 == rectangle2  "+newRectangle.equals(rectangle));
    }
}
