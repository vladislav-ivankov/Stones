package by.ivankov.task4.reader.impl;

import by.ivankov.task4.reader.StonesReaderService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class StonesReaderServiceImpl implements StonesReaderService {
    Logger logger = LogManager.getLogger();
    private static final String DEFAULT_FILENAME = "data//preciousStones.txt";
    @Override
    public ArrayList<String> StonesFileReader(String fileName) {
        ArrayList<String> list = new ArrayList<>();
        Path path = FileSystems.getDefault().getPath(fileName);
        if (!Files.exists(path)) {
            logger.log(Level.ERROR, "file" + fileName + " not exist");
            fileName = DEFAULT_FILENAME;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            logger.log(Level.ERROR, "There is no such file or directory");
        } catch (IOException e) {
            logger.log(Level.INFO, "Unknown Error(Exception)");
        }
        return list;
    }
}
