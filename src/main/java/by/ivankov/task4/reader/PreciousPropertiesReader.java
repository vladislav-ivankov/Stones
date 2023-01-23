package by.ivankov.task4.reader;

import by.ivankov.task4.entity.PreciousStones;

public interface PreciousPropertiesReader {
    PreciousStones propertyRead(String fileName);
}
