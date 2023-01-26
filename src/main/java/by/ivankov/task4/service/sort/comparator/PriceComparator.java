package by.ivankov.task4.service.sort.comparator;

import by.ivankov.task4.entity.Stone;

import java.util.Comparator;

public class PriceComparator implements Comparator<Stone> {
    @Override
    public int compare(Stone o1, Stone o2) {
        return (int) (o2.getPrice() - o1.getPrice());
    }
}
