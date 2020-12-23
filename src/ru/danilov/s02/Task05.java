package ru.danilov.s02;

public class Task05 {
    public static void main(String[] args) {
        System.out.println(definitionPythagoreanTriplet(5,3,5));
    }
    private static boolean definitionPythagoreanTriplet(int x, int y, int z) {
        return x * x + y * y == z * z;
    }
}
