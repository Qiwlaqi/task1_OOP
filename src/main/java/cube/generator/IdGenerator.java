package main.java.cube.generator;

public class IdGenerator {
    private static final int MIN_ID = 1;
    private static final int MAX_ID = 100_000;
    private static long counter;

    public static long generateId() {
        ++counter;
        if (MIN_ID + counter >= MAX_ID) {
            counter = 0;
        }
        return counter;
    }

    public static long setId(long Id) {
        return Id;
    }
}
