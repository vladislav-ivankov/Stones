package by.ivankov.task4;

import by.ivankov.task4.entity.Necklace;
import by.ivankov.task4.entity.Stone;
import by.ivankov.task4.exception.CustomException;
import by.ivankov.task4.reader.impl.StonesReaderImpl;
import by.ivankov.task4.service.impl.CalculationServiceImpl;
import by.ivankov.task4.service.impl.SearchServiceImpl;

import java.util.List;


public class Main {
    public static void main(String[] args) throws CustomException {
        CalculationServiceImpl  service = new CalculationServiceImpl();
        StonesReaderImpl readerService = new StonesReaderImpl();
//        PreciousStones preciousStones = new PreciousStones("Diamond", 3.0, 2500, 3, "precious", PreciousStones.Cutting.ROUND);
        List<Stone> stones = readerService.stonesReader("data//stonesFile.txt");
        Necklace necklace = new Necklace(stones);
        SearchServiceImpl searchStonesService = new SearchServiceImpl();
        searchStonesService.transparencySearch(stones, 4, 7);

        System.out.println(necklace.getStones().get(0));
        System.out.println(necklace.getStones().get(0));
        System.out.println(necklace.getStones().get(3));
        System.out.println(necklace.getStones().get(5));
        System.out.println(necklace.getStones().get(7));
        System.out.println(necklace.getStones().get(8));
        System.out.println(necklace.getStones());
        System.out.println(searchStonesService.transparencySearch(stones, 4, 7));
    }
}