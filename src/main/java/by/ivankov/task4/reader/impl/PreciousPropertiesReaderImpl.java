package by.ivankov.task4.reader.impl;

import by.ivankov.task4.entity.PreciousStone;
import by.ivankov.task4.reader.PreciousPropertiesReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PreciousPropertiesReaderImpl implements PreciousPropertiesReader {
    static Logger logger = LogManager.getLogger();

    public PreciousStone propertyRead(String fileName){
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(fileName));
//            for(String key : properties.stringPropertyNames()){
//                System.out.println(properties.get(key));
//            }
//            System.out.println(properties.get("price"));
            System.out.println(properties.getProperty("name").split("\\s+"));
            System.out.println(properties.stringPropertyNames());
            System.out.println(properties);

        } catch (IOException e) {
            logger.log(Level.ERROR, e);
        }
        return null;
    }

}
