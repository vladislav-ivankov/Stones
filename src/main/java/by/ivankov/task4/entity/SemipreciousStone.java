package by.ivankov.task4.entity;

import java.util.StringJoiner;

public class SemipreciousStone extends Stone {

    public enum Hardness{
        HARD, MEDIUM, SOFT
    }
    private Hardness hardness;

    public SemipreciousStone(Hardness hardness){
        setHardness(hardness);
    }
    public SemipreciousStone(Stone stone) {
        super(stone.getName(), stone.getWeight(), stone.getPrice(), stone.getTransparency(), stone.getJewel());
    }
    public Hardness getHardness(){
        return hardness;
    }

    public void setHardness(Hardness hardness) {
        this.hardness = hardness;
    }

    @Override
    public String toString() {
        return new StringJoiner("," , ", ", "]")
                .add("hardness=" + hardness)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SemipreciousStone that = (SemipreciousStone) o;

        return hardness == that.hardness;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (hardness != null ? hardness.hashCode() : 0);
        return result;
    }
}
