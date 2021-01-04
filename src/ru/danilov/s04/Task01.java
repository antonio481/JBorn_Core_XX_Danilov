package ru.danilov.s04;

public class Task01 {
    public static void main(String[] args) {
        System.out.println(reverseStringWithRecursion("jborn"));
    }
    private static String reverseStringWithRecursion(String inputString) {
        String rightPart;
        String leftPart;

        int length = inputString.length();

        // заканчиваем рекурсивный обход
        if (length <= 1) {
            return inputString;
        }

        leftPart = inputString.substring(0, length / 2);

        rightPart = inputString.substring(length / 2, length);

        // рекурсивно переворачиваем левую и правую часть входной строки
        return reverseStringWithRecursion(rightPart) + reverseStringWithRecursion(leftPart);
    }
}
