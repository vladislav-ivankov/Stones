package by.ivankov.task4.reader.impl;

import by.ivankov.task4.entity.PreciousStones;
import by.ivankov.task4.entity.SemipreciousStones;
import by.ivankov.task4.reader.StonesReaderService;
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

public class StonesReaderServiceImpl implements StonesReaderService {
    Logger logger = LogManager.getLogger();
    private static final String DEFAULT_FILENAME = "data//defaultFile.txt";
    private static final String SEPARATOR = "\\s+";

    @Override
    public List<PreciousStones> preciousStonesReader(String fileName) {
        Path path = Path.of(fileName);
        if(!Files.exists(path)){
            logger.log(Level.ERROR, "file" + fileName + " not exist");
            fileName = DEFAULT_FILENAME;
        }
        PreciousStones preciousStones;
        List<PreciousStones> list = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()){
                String[] str = scanner.nextLine().split(SEPARATOR);
                try {
                    list.add(new PreciousStones(str[0], Double.parseDouble(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3])));
                }catch (NullPointerException e){
                    logger.log(Level.ERROR, "Invalid data type!");
                }
            }
        }catch (FileNotFoundException e){
            logger.log(Level.ERROR, "There is no such file or directory!");
        }catch (IOException e){
            logger.log(Level.ERROR, "Unknown Error(Exception)");
        }
        return list;
    }

    @Override
    public List<SemipreciousStones> semipreciousStonesReader(String fileName) {
        Path path = Path.of(fileName);
        if(!Files.exists(path)){
            logger.log(Level.ERROR, "file" + fileName + " not exist");
            fileName = DEFAULT_FILENAME;
        }
        List<SemipreciousStones> list = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            Scanner scanner = new Scanner(reader);
            while(scanner.hasNextLine()){
                String[] str = scanner.nextLine().split(SEPARATOR);
                try{
                    list.add(new SemipreciousStones(str[0], Double.parseDouble(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3])));
                }catch (NullPointerException e){
                    logger.log(Level.ERROR, "Invalid data type!");
                }
            }
        }catch (FileNotFoundException e){
            logger.log(Level.ERROR, "There is no such file or directory!");
        }catch (IOException e){
            logger.log(Level.ERROR, "Unknown Error(Exception)");
        }
        return list;
    }
}
