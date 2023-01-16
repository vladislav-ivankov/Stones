package by.ivankov.task4.entity;

public class SemipreciousStones extends Stones {

    public SemipreciousStones(Stones stones) {
        super(stones.getName(), stones.getWeight(), stones.getPrice(), stones.getTransparency());
    }
}
