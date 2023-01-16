package by.ivankov.task4.entity;


public class PreciousStones extends Stones {
    public PreciousStones(Stones stones) {
        super(stones.getName(), stones.getWeight(), stones.getPrice(), stones.getTransparency());
    }
}
