package by.ivankov.task4.entity;


import java.util.StringJoiner;

public class PreciousStones extends Stone {

    public enum Cutting{
        ROUND, PEAR, SQUARE, HEART
    }
    private Cutting cutting;
    public PreciousStones(Cutting cutting){
        setCutting(cutting);
    };
    public PreciousStones(Stone stone){
        super(stone.getName(), stone.getWeight(), stone.getPrice(), stone.getTransparency(), stone.getJewel());
    }

    public Cutting getCutting(){
        return cutting;
    }

    public void setCutting(Cutting cutting) {
        this.cutting = cutting;
    }

    @Override
    public String toString() {
        return new StringJoiner(", " , ", ", "]")
                .add("cutting=" + cutting)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PreciousStones that = (PreciousStones) o;

        return cutting == that.cutting;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (cutting != null ? cutting.hashCode() : 0);
        return result;
    }
}
