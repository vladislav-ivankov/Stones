package by.ivankov.task4.entity;

import by.ivankov.task4.util.NecklaceIdGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Necklace {
    private int necklaceId;
    private List<Stone> stones = new ArrayList<>();
    private List<PreciousStones> preciousStones;
    private List<SemipreciousStones> semipreciousStones;

    public Necklace(List<PreciousStones> preciousStones, List<SemipreciousStones> semipreciousStones){
        this.necklaceId = NecklaceIdGenerator.necklaceId();
        this.preciousStones = preciousStones;
        this.semipreciousStones = semipreciousStones;
        setStones(preciousStones, semipreciousStones);
    }

    public int getNecklaceId() {
        return necklaceId;
    }

    public List<Stone> getStones() {
        return stones;
    }

    public List<PreciousStones> getPreciousStones() {
        return preciousStones;
    }

    public List<SemipreciousStones> getSemipreciousStones() {
        return semipreciousStones;
    }

    public void setStones(List<PreciousStones> preciousStones, List<SemipreciousStones> semipreciousStones) {
        this.stones.addAll(preciousStones);
        this.stones.addAll(semipreciousStones);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Necklace.class.getSimpleName() + "[", "]")
                .add("id = " + necklaceId)
                .add("stones=" + stones)
                .add("preciousStones=" + preciousStones)
                .add("semipreciousStones=" + semipreciousStones)
                .toString();
    }
}
