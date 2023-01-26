package by.ivankov.task4.service.impl;

import by.ivankov.task4.entity.Necklace;
import by.ivankov.task4.entity.Stone;
import by.ivankov.task4.exception.CustomException;
import by.ivankov.task4.reader.impl.StonesReaderImpl;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class CalculationServiceImplTest {

    @Test
    public void testWeightCalculation() throws CustomException {
        StonesReaderImpl reader = new StonesReaderImpl();
        try {
            List<Stone> stones = reader.stonesReader("data//stonesFile.txt");
            Necklace necklace = new Necklace(stones);
            CalculationServiceImpl service = new CalculationServiceImpl();
            double actual = service.weightCalculation(stones);
            double expected = 32.1;
            assertEquals(actual, expected);
        }catch (CustomException e){
            throw new CustomException("no file or directory found");
        }
    }

    @Test
    public void testPriceCalculation() throws CustomException{
        StonesReaderImpl reader = new StonesReaderImpl();
        try{
            List<Stone> stones = reader.stonesReader("data//stonesFile.txt");
            Necklace necklace = new Necklace(stones);
            CalculationServiceImpl service = new CalculationServiceImpl();
            int actual = service.priceCalculation(stones);
            int expected = 12_400;
            assertEquals(actual, expected);
        }catch (CustomException e){
            throw new CustomException("no file or directory found");
        }
    }
}