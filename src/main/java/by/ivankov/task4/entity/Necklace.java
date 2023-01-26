package by.ivankov.task4.entity;

import by.ivankov.task4.util.NecklaceIdGenerator;

import java.util.List;
import java.util.Objects;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Necklace necklace = (Necklace) o;

        if (necklaceId != necklace.necklaceId) return false;
        return Objects.equals(stones, necklace.stones);
    }

    @Override
    public int hashCode() {
        int result = necklaceId;
        result = 31 * result + (stones != null ? stones.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Necklace.class.getSimpleName() + "[", "]")
                .add("id = " + necklaceId)
                .add("stones=" + stones)
                .toString();
    }
}
