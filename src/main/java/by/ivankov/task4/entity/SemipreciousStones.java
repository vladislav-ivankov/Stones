package by.ivankov.task4.entity;

import java.util.StringJoiner;

public class SemipreciousStones extends Stone {

    public enum Hardness{
        HARD, MEDIUM, SOFT
    }
    private Hardness hardness;
    public SemipreciousStones(Stone stone, Hardness hardness) {
        super(stone.getName(), stone.getWeight(), stone.getPrice(), stone.getTransparency(), stone.getJewel());
        this.hardness = hardness;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SemipreciousStones.class.getSimpleName() + "[", "]")
                .add("hardness=" + hardness)
                .toString();
    }
}
