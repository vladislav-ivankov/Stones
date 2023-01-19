package by.ivankov.task4.entity;

public class SemipreciousStones extends Stone {

    public SemipreciousStones(String name, double weight, int price, int transparency) {
        super(name, weight, price, transparency);
    }
    public String toString() {
        return (super.toString()) + " - semi-precious";
    }
}
