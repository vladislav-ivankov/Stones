package by.ivankov.task4.reader;


import by.ivankov.task4.entity.Stone;
import by.ivankov.task4.exception.CustomException;

import java.util.List;

public interface StonesReader {
    List<Stone> stonesReader(String fileName) throws CustomException;
}
