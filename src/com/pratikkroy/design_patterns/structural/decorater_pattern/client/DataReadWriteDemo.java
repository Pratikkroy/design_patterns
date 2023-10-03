package com.pratikkroy.design_patterns.structural.decorater_pattern.client;

import com.pratikkroy.design_patterns.structural.decorater_pattern.component.DataSource;
import com.pratikkroy.design_patterns.structural.decorater_pattern.component.impl.FileDataSource;
import com.pratikkroy.design_patterns.structural.decorater_pattern.decorater.impl.CompressionDecorator;
import com.pratikkroy.design_patterns.structural.decorater_pattern.decorater.impl.EncryptionDecorator;

/**
 * There is already component and its impl which is doing some work.
 * To enhance the work we add decoraters to it.
 *
 * We can always enhance the work by extending the ComponentImpl class.
 * But inheritance has its own limitations.
 *
 * The ExporterClient is responsible for decorating the object.
 */
public class DataReadWriteDemo {
    private static final String data = "This is dummy data";
    private static final String filename = "filename";
    private static final String filepath = "filepath";

    public static void demo(){
        plainTextDemo(data);
        encryptedTextDemo(data);
        compressedTextDemo(data);
        encryptedAndCompressedTextDemo(data);
    }

    public static void plainTextDemo(String data){
        // Writting plain text to file
        System.out.println();
        System.out.println("Writting plain text to file .....");

        DataSource file = new FileDataSource("filename", "filepath");
        file.writeData(data);
        System.out.println("File data:: "+file.readData());
    }

    public static void encryptedTextDemo(String data){
        // Writting encrypted text to file
        System.out.println();
        System.out.println("Writting encrypted text to file .....");

        DataSource file = new FileDataSource(filename, filepath);
        DataSource encryptionDecorator = new EncryptionDecorator(file);
        encryptionDecorator.writeData(data);
        System.out.println("File data:: "+encryptionDecorator.readData());
    }

    public static void compressedTextDemo(String data){
        // Writting compressed text to file
        System.out.println();
        System.out.println("Writting compressed text to file .....");

        DataSource file = new FileDataSource(filename, filepath);
        DataSource compressionDecorator = new CompressionDecorator(file);
        compressionDecorator.writeData(data);
        System.out.println("File data:: "+compressionDecorator.readData());
    }

    public static void encryptedAndCompressedTextDemo(String data){
        // Writting compressed and encrypted text to file
        System.out.println();
        System.out.println("Writting compressed and encrypted text to file .....");

        DataSource file = new FileDataSource(filename, filepath);
        DataSource compressionDecorator = new CompressionDecorator(file);
        EncryptionDecorator encryptionDecorator = new EncryptionDecorator(compressionDecorator);
        encryptionDecorator.writeData(data);
        System.out.println("File data:: "+encryptionDecorator.readData());
    }
}
