package com.pratikkroy.design_patterns.structural.immutable.immutable;

public class ImmutableClassExample {

    // immutable obj container
    private final int x;

    public ImmutableClassExample(int x){
        this.x = x;
    }

    public int getX(){
        return this.x;
    }

    public ImmutableClassExample add(ImmutableClassExample obj){
        // We dont want that immutable obj container x should be accessed directly
        // as shown below. To restrict the access, use private_class_data
        return new ImmutableClassExample(this.x + obj.x);
    }

    @Override
    public String toString() {
        return "ImmutableClassExample{" + "x=" + x + '}';
    }
}
