package com.pratikkroy.designpatterns.creational.singletonPattern;

/**
 * This class is thread safe as well
 */
public class Singleton {
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            // if instance is null then acquire lock on this class so that
            // no other thread can create instance during this time.
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
