package com.pratikkroy.design_patterns.creational;

import com.pratikkroy.design_patterns.creational.abstract_factory.AbstractFactoryDemo;
import com.pratikkroy.design_patterns.creational.builder_pattern.BuilderPatterDemo;
import com.pratikkroy.design_patterns.creational.factory_pattern.FactoryPatternDemo;
import com.pratikkroy.design_patterns.creational.objectpool_pattern.ObjectPoolPatternDemo;
import com.pratikkroy.design_patterns.creational.prototype.PrototypeDemo;
import com.pratikkroy.design_patterns.creational.singleton.SingletonDemo;

/**
 * In creational design pattern, we have component and
 * a ExporterClient to existing_use that component.
 * The responsibilty to create instance of the component is given
 * to some other actor like creator/director to hide complexity
 * in creating different types of objects.
 *
 *
 *
 * ExporterClient --> [calls] --> creator --> [to return] --> component
 */
public class CreationalPatternDemo {
    public static void demo(){
        System.out.println();
        System.out.println("Creational pattern demo.....");
        FactoryPatternDemo.demo();
        BuilderPatterDemo.demo();
        AbstractFactoryDemo.demo();
        SingletonDemo.demo();
        PrototypeDemo.demo();
        ObjectPoolPatternDemo.demo();
    }
}
