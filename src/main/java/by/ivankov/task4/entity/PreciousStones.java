package by.ivankov.task4.entity;


import java.util.StringJoiner;

public class PreciousStones extends Stone {

    public enum Cutting{
        ROUND, PEAR, SQUARE, HEART
    }
    private Cutting cutting;
    public PreciousStones(Cutting cutting){};
    public PreciousStones(String name, double weight, int price, int transparency, String jewel){
        super(name, weight, price, transparency, jewel);
    }

    public Cutting getCutting(){
        return cutting;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", PreciousStones.class.getSimpleName() + "[", "]")
                .add("cutting=" + cutting)
                .toString();
    }
}
