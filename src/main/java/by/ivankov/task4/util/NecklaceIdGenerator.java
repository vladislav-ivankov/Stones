package by.ivankov.task4.util;


public class NecklaceIdGenerator {
    private static int necklaceId;

    private NecklaceIdGenerator(){
    }

    public static int necklaceId(){
        return ++necklaceId;
    }
}
