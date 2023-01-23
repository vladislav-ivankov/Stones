package by.ivankov.task4.entity;

import by.ivankov.task4.util.NecklaceIdGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Necklace {
    private int necklaceId;
    private List<Stone> stones;

    public Necklace(List<Stone> stones){
        this.necklaceId = NecklaceIdGenerator.necklaceId();
        this.stones = stones;
    }

    public int getNecklaceId() {
        return necklaceId;
    }

    public void setStones(List<Stone> stones) {
        this.stones = stones;
    }

    public List<Stone> getStones() {
        return stones;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Necklace.class.getSimpleName() + "[", "]")
                .add("id = " + necklaceId)
                .add("stones=" + stones)
                .toString();
    }
}
