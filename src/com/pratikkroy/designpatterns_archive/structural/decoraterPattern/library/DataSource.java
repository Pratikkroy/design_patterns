package com.pratikkroy.designpatterns.structural.decoraterPattern.library;

public interface DataSource {
    void writeData(String data);

    String readData();
}
