package by.ivankov.task4.entity;

import java.util.Objects;
import java.util.StringJoiner;

public class Stones {
    private String name;
    private double weight;
    private int price;
    private int transparency;

    public Stones(){}
    public Stones(String name, double weight, int price, int transparency){
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.transparency = transparency;
    }


    public String getName(){
        return name;
    }
    public double getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public int getTransparency() {
        return transparency;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Stones.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("weight=" + weight)
                .add("price=" + price)
                .add("transparency=" + transparency)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stones stones = (Stones) o;
        return Double.compare(stones.weight, weight) == 0 && price == stones.price && transparency == stones.transparency && Objects.equals(name, stones.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, price, transparency);
    }
}
