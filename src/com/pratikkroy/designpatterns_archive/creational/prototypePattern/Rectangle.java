package com.pratikkroy.designpatterns_archive.creational.prototypePattern;

public class Rectangle implements Cloneable<Rectangle> {
    private int height, width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(Rectangle obj) {
        this(obj.height, obj.width);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }
}
