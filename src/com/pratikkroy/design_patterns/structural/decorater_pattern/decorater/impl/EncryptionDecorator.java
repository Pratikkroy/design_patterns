package com.pratikkroy.design_patterns.structural.decorater_pattern.decorater.impl;

import com.pratikkroy.design_patterns.structural.decorater_pattern.component.DataSource;
import com.pratikkroy.design_patterns.structural.decorater_pattern.decorater.DataSourceBaseDecorator;

public class EncryptionDecorator extends DataSourceBaseDecorator {

    public EncryptionDecorator(DataSource source){
        super(source);
    }

    @Override
    public void writeData(final String data) {
        System.out.println("Encrypting data...");
        String encryptedData = encryptData(data);
        super.writeData(encryptedData);
    }

    @Override
    public String readData() {
        String encryptedData = super.readData();
        System.out.println("decrypting data...");
        return decryptData(encryptedData);
    }

    private String encryptData(String data){
        return reverseString(data);
    }

    private String decryptData(String data){
        return reverseString(data);
    }

    private String reverseString(String str){
        StringBuilder encryptedData = new StringBuilder(str);
        encryptedData.reverse();
        return encryptedData.toString();
    }
}
