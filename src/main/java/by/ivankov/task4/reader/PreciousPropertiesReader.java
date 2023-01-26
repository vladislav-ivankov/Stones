package by.ivankov.task4.reader;

import by.ivankov.task4.entity.PreciousStone;

public interface PreciousPropertiesReader {
    PreciousStone propertyRead(String fileName);
}
