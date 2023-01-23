package by.ivankov.task4.reader.impl;

import by.ivankov.task4.entity.Stone;
import by.ivankov.task4.exception.CustomException;
import by.ivankov.task4.reader.StonesReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StonesReaderImpl implements StonesReader {
    static Logger logger = LogManager.getLogger();
    private static final String DEFAULT_FILENAME = "data//defaultFile.txt";
    private static final String SEPARATOR = "\\s+";

    @Override
    public List<Stone> stonesReader(String fileName) throws CustomException {
        Path path = Path.of(fileName);
        if(!Files.exists(path)){
            logger.log(Level.ERROR, "file" + fileName + " not exist");
            fileName = DEFAULT_FILENAME;
        }
        List<Stone> list = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            Scanner scanner = new Scanner(reader);
            while(scanner.hasNextLine()){
                String[] str = scanner.nextLine().split(SEPARATOR);
                try{
                    list.add(new Stone(str[0], Double.parseDouble(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]), str[4]));
                }catch (NullPointerException e){
                    throw new CustomException("Invalid data type!");
                }
            }
        }catch (FileNotFoundException e){
            throw new CustomException("There is not such file or directory!");
        }catch (IOException e){
            throw new CustomException("Unknown error(Exception)");
        }
        return list;
    }


}
