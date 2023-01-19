package by.ivankov.task4.entity;


public class PreciousStones extends Stone {
    public PreciousStones(String name, double weight, int price, int transparency){
        super(name, weight, price, transparency);
    }
    public String toString() {
        return (super.toString()) + " - precious";
    }
}
