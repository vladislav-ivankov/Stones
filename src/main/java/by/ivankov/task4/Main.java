package by.ivankov.task4;

import by.ivankov.task4.entity.Necklace;
import by.ivankov.task4.entity.Stone;
import by.ivankov.task4.exception.CustomException;
import by.ivankov.task4.reader.impl.StonesReaderImpl;
import by.ivankov.task4.service.impl.CalculationServiceImpl;
import by.ivankov.task4.service.impl.SearchServiceImpl;
import by.ivankov.task4.service.sort.impl.PriceSortServiceImpl;

import java.util.List;


public class Main {
    public static void main(String[] args) throws CustomException {
        CalculationServiceImpl  service = new CalculationServiceImpl();
        StonesReaderImpl readerService = new StonesReaderImpl();
        PriceSortServiceImpl sortService = new PriceSortServiceImpl();
        List<Stone> stones = readerService.stonesReader("data//stonesFile.txt");
//        System.out.println(sortService.stonesSort(stones));
        Stone stone = new Stone();
//        PreciousStones round = new PreciousStones(PreciousStones.Cutting.ROUND);
//        PreciousStones pear = new PreciousStones(PreciousStones.Cutting.PEAR);
//        PreciousStones heart = new PreciousStones(PreciousStones.Cutting.HEART);
//        PreciousStones square = new PreciousStones(PreciousStones.Cutting.SQUARE);
//        SemipreciousStones medium = new SemipreciousStones(SemipreciousStones.Hardness.MEDIUM);
//        SemipreciousStones hard = new SemipreciousStones(SemipreciousStones.Hardness.HARD);
//        SemipreciousStones soft = new SemipreciousStones(SemipreciousStones.Hardness.SOFT);

        Necklace necklace = new Necklace(stones);
        SearchServiceImpl searchStonesService = new SearchServiceImpl();
        searchStonesService.transparencySearch(stones, 4, 7);

        System.out.println(necklace.getStones().get(2));
        System.out.println(necklace.getStones().get(5));
        System.out.println(necklace.getStones().get(8));
//        System.out.println(necklace.getStones().get(0) + round.toString());
//        System.out.println(necklace.getStones().get(0) + heart.toString());
//        System.out.println(necklace.getStones().get(2) + square.toString());
//        System.out.println(necklace.getStones().get(3) + round.toString());
//        System.out.println(necklace.getStones().get(5) + pear.toString());
//        System.out.println(necklace.getStones().get(7) + heart.toString());
//        System.out.println(necklace.getStones().get(8) + medium.toString());
//        System.out.println(necklace.getStones().get(6) + soft.toString());
//        System.out.println(necklace.getStones());
//        System.out.println(searchStonesService.transparencySearch(stones, 4, 7));
    }
}