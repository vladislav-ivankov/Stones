package by.ivankov.task4;

import by.ivankov.task4.entity.Necklace;
import by.ivankov.task4.entity.PreciousStones;
import by.ivankov.task4.entity.SemipreciousStones;
import by.ivankov.task4.reader.impl.StonesReaderServiceImpl;
import by.ivankov.task4.service.impl.CalculationServiceImpl;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        CalculationServiceImpl  service = new CalculationServiceImpl();
        StonesReaderServiceImpl readerService = new StonesReaderServiceImpl();
        List<PreciousStones> preciousStones = readerService.preciousStonesReader("data//preciousStones.txt");
        List<SemipreciousStones> semipreciousStones = readerService.semipreciousStonesReader("data//semi-preciousStones.txt");
        Necklace necklace = new Necklace(preciousStones, semipreciousStones);

        System.out.println(necklace.getStones());
        System.out.println(service.weightCalculation(necklace.getStones()));
        System.out.println(service.priceCalculation(necklace.getStones()));
    }
}