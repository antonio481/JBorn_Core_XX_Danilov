package ru.danilov.s02;

public class Task03 {
    public static void main(String[] args) {
        definitionQuadrateRectangular(1, 2, 1, 2);
    }

    private static void definitionQuadrateRectangular(int a, int b, int c, int d) {
        String quadrate = "Квадрат";
        if (a == b & a == c & a == d)
            System.out.println("Квадрат");
        else
            System.out.println("Прямоугольник");
    }
}
