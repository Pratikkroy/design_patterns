package com.pratikkroy.design_patterns.structural.decorater_pattern.component.impl;

import com.pratikkroy.design_patterns.structural.decorater_pattern.component.DataSource;

public class FileDataSource implements DataSource {

    private String filename;
    private String filepath;
    private String fileData;

    public FileDataSource(final String filename, final String filepath) {
        this.filename = filename;
        this.filepath = filepath;
        this.fileData = "";
    }

    @Override
    public void writeData(final String data) {
        System.out.println("Writting to file "+ filename);
        writeToFile(data);
        System.out.println("Data has been written to file "+filename);
    }

    @Override
    public String readData() {
        System.out.println("Reading data from file "+ filename);
        return this.fileData;
    }

    private void writeToFile(String data){
        System.out.println(data);
        this.fileData =  data;
    }
}
