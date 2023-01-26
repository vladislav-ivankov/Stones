package by.ivankov.task4.service.impl;

import by.ivankov.task4.entity.Stone;
import by.ivankov.task4.service.CalculationService;

import java.util.List;

public class CalculationServiceImpl implements CalculationService {

    @Override
    public double weightCalculation(List<Stone> stones){
        double result = 0;
        for (Stone i : stones) {
            result += i.getWeight();
        }
        return result;
    }

    @Override
    public int priceCalculation(List<Stone> stones) {
        int result = 0;
        for (Stone i : stones) {
            result += i.getPrice();
        }
        return result;
    }
}
