package by.ivankov.task4.service;

import by.ivankov.task4.entity.Stone;

import java.util.List;

public interface SearchService {
    List<Stone> transparencySearch(List<Stone> stones, int minRange, int maxRange);
}
