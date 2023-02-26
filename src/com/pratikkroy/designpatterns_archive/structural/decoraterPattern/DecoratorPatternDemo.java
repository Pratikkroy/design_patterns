package com.pratikkroy.designpatterns.structural.decoraterPattern;

import com.pratikkroy.designpatterns.structural.decoraterPattern.decorator.CompressionDecorator;
import com.pratikkroy.designpatterns.structural.decoraterPattern.decorator.DataSourceDecorator;
import com.pratikkroy.designpatterns.structural.decoraterPattern.decorator.EncryptionDecorator;
import com.pratikkroy.designpatterns.structural.decoraterPattern.library.DataSource;
import com.pratikkroy.designpatterns.structural.decoraterPattern.library.FileDataSource;

public class DecoratorPatternDemo {

    public static void start() {

        final String data = "Hello";

        DataSource dataSource = new FileDataSource();
        dataSource.writeData(data);
        System.out.println("Created a data source with data = " +dataSource.readData());

        DataSource encryptionDecorator = new EncryptionDecorator(dataSource);
        encryptionDecorator.writeData(data);
        System.out.println("Actual data = "+encryptionDecorator.readData());
        System.out.println("Encrypted data source with encryptionDecorator. Encrypted data = " + dataSource.readData());

        DataSource compressionDecorator = new CompressionDecorator(dataSource);
        compressionDecorator.writeData(data);
        System.out.println("Actual data = "+compressionDecorator.readData());
        System.out.println("Compressed data source with compressionDecorator. Compressed data = " + dataSource.readData());
    }
}
