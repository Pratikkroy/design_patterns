package com.pratikkroy.design_patterns.structural.decorater_pattern.component;

public interface DataSource {

    void writeData(String data);

    String readData();
}
