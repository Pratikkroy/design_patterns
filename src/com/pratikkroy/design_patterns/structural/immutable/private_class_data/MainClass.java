package com.pratikkroy.design_patterns.structural.immutable.private_class_data;


public class MainClass {
    private final DataClass data;

    public MainClass(int x){
        this.data = new DataClass(x);
    }

    public int getX(){
        return this.data.getX();
    }

    public MainClass add(MainClass obj){
        // this still has the same issue of accessing Dataclass obj directly
        // but at least we are not accessing immutable obj container(x in this case) directly
        return new MainClass(this.data.getX() + obj.data.getX());
    }

    @Override
    public String toString() {
        return "MainClass{" + "x=" + this.data.getX() + '}';
    }
}
