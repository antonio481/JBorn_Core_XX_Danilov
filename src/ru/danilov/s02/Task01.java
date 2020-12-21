package ru.danilov.s02;

public class Task01 {
    public static int whichAndHowMuchIsDividedEntirelyByTheDivisor(int divisor, int dividend1, int dividend2, int dividend3) {
        int quantityNumbers = 0;
        if (dividend1 % divisor == 0) {
            quantityNumbers++;
            System.out.println("Первое число делится без остатка");
        }
        if (dividend2 % divisor == 0) {
            quantityNumbers++;
            System.out.println("Второое число делится без остатка");
        }
        if (dividend3 % divisor == 0) {
            quantityNumbers++;
            System.out.println("Третье число делится без остатка");
        }
        System.out.println("Число разделившихся чисел:");
        return quantityNumbers;
    }
}
