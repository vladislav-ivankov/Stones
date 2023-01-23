package by.ivankov.task4.entity;

import by.ivankov.task4.util.StoneIdGenerator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Objects;
import java.util.StringJoiner;

public class Stone {
    static Logger logger = LogManager.getLogger();
    private int stoneId;
    private String name;
    private double weight;
    private int price;
    private int transparency;
    private String jewel;

    public Stone() {
    }

    public Stone(String name, double weight, int price, int transparency, String jewel) {
        this.stoneId = StoneIdGenerator.stoneId();
        this.name = name;
        this.weight = weight;
        this.price = price;
        setTransparency(transparency);
        this.jewel = jewel;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public String getJewel(){
        return jewel;
    }

    public void setTransparency(int transparency) {
        if (transparency > 1 && transparency < 12){
            this.transparency = transparency;
        }else{
            logger.log(Level.ERROR, "Transparency can only be 1-12");
        }
    }

    public int getTransparency() {
        return transparency;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "\n" + "[", "]")
                .add("Id = " + stoneId)
                .add("name = '" + name + "'")
                .add("weight = " + weight + " ct.")
                .add("price = " + price + "$")
                .add("transparency = " + transparency)
                .add("jewel = " + jewel)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stone stones = (Stone) o;
        return Double.compare(stones.weight, weight) == 0 && price == stones.price && transparency == stones.transparency && Objects.equals(name, stones.name);
    }

    @Override
    public int hashCode() {
        int result = stoneId;
        result = 31 * result + Objects.hash(name);
        result = 31 * result + Objects.hash(weight);
        result = 31 * result + price;
        result = 31 * result + transparency;
        result = 31 * result + Objects.hash(jewel);
        return result;
    }
}
