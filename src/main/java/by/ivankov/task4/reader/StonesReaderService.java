package by.ivankov.task4.reader;


import by.ivankov.task4.entity.PreciousStones;
import by.ivankov.task4.entity.SemipreciousStones;

import java.util.List;

public interface StonesReaderService {
    List<PreciousStones> preciousStonesReader(String fileName);
    List<SemipreciousStones> semipreciousStonesReader(String fileName);
}
