package com.pratikkroy.designpatterns.structural.compositePattern;

import com.pratikkroy.designpatterns.structural.compositePattern.product.Container;
import com.pratikkroy.designpatterns.structural.compositePattern.product.Product;

public class CompositePatternDemo {

    public static void start() {

        System.out.println("          --------------------------     rootContainer    -----------------    ");
        System.out.println("          |                                    |                           |  ");
        System.out.println("    level1Container1               ---- level1Container2 ----          product1");
        System.out.println("   |              |                |                         |  ");
        System.out.println(" product2    product3         level2Container1           product4 ");
        System.out.println("                              |      |        |  ");
        System.out.println("                        product5  product6  product7 ");
        System.out.println();

        final Product product1 = new Product(10);
        final Product product2 = new Product(20);
        final Product product3 = new Product(30);
        final Product product4 = new Product(40);
        final Product product5 = new Product(50);
        final Product product6 = new Product(60);
        final Product product7 = new Product(70);

        final Container rootContainer = new Container();
        final Container level1Container1 = new Container();
        final Container level1Container2 = new Container();

        final Container level2Container1 = new Container();
        level2Container1.addComponent(product5);
        level2Container1.addComponent(product6);
        level2Container1.addComponent(product7);

        level1Container1.addComponent(level2Container1);
        level1Container1.addComponent(product4);

        level1Container2.addComponent(product2);
        level1Container2.addComponent(product3);

        rootContainer.addComponent(level1Container1);
        rootContainer.addComponent(level1Container2);
        rootContainer.addComponent(product1);



        // total should be 10 + 20 + 30 +.... 70 = 280

        System.out.println("Total price :: " + rootContainer.getPrice());



    }
}
