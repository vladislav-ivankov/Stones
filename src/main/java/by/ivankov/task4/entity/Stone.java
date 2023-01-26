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
        setName(name);
        setWeight(weight);
        setPrice(price);
        setTransparency(transparency);
        setJewel(jewel);
    }

    public int getStoneId() {
        return stoneId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setJewel(String jewel) {
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
        return new StringJoiner(", " , "\n" + "[", "")
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

        Stone stone = (Stone) o;

        if (stoneId != stone.stoneId) return false;
        if (Double.compare(stone.weight, weight) != 0) return false;
        if (price != stone.price) return false;
        if (transparency != stone.transparency) return false;
        if (!Objects.equals(name, stone.name)) return false;
        return Objects.equals(jewel, stone.jewel);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = stoneId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + price;
        result = 31 * result + transparency;
        result = 31 * result + (jewel != null ? jewel.hashCode() : 0);
        return result;
    }
}
