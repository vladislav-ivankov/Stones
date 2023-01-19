package by.ivankov.task4.util;

public class StoneIdGenerator {
    private static int stoneId;

    private StoneIdGenerator(){
    }
    public static int stoneId(){
        return ++stoneId;
    }
}
