package by.ivankov.task4;

import by.ivankov.task4.reader.impl.PreciousPropertiesReaderImpl;

import javax.swing.*;

public class PropertiesMain {
    public static void main(String[] args) {
        PreciousPropertiesReaderImpl reader = new PreciousPropertiesReaderImpl();
        System.out.println(reader.propertyRead("res//preciousdata.properties"));
    }
}
