package by.ivankov.task4.service;

import by.ivankov.task4.entity.Stone;

import java.util.List;

public interface CalculationService {
    double weightCalculation(List<Stone> stones);
    int priceCalculation(List<Stone> stones);
}
