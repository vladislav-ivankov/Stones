package by.ivankov.task4.service.sort.impl;

import by.ivankov.task4.entity.Stone;
import by.ivankov.task4.service.sort.PriceSortService;
import by.ivankov.task4.service.sort.comparator.PriceComparator;

import java.util.Collections;
import java.util.List;

public class PriceSortServiceImpl implements PriceSortService {
    @Override
    public List<Stone> stonesSort(List<Stone> stones) {
        Collections.sort(stones, new PriceComparator());
        return stones;
    }
}
