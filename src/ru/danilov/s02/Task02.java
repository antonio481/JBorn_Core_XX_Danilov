package ru.danilov.s02;

public class Task02 {
    public static void main(String[] args) {
        sumNumbers(123);
    }

    private static int sumNumbers(int number) {
        System.out.println((number / 100) + ((number / 10) % 10) + (number % 10));
        return (number / 100) + ((number / 10) % 10) + (number % 10);
    }
}
