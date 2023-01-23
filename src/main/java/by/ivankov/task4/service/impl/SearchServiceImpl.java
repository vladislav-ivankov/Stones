package by.ivankov.task4.service.impl;

import by.ivankov.task4.entity.Stone;
import by.ivankov.task4.service.SearchService;

import java.util.ArrayList;
import java.util.List;

public class SearchServiceImpl implements SearchService {
    @Override
    public List<Stone> transparencySearch(List<Stone> stones, int minRange, int maxRange) {
        List<Stone> newList = new ArrayList<>();
        for (Stone i : stones){
            if (i.getTransparency() > minRange && i.getTransparency() < maxRange){
                newList.add(i);
            }
        }
        return newList;
    }
}
