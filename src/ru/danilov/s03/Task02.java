package ru.danilov.s03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task02 {
    public static void main(String[] args) {
        System.out.println(returningSequenceOfIntegers("20 htubcnhjd"));
    }

    private static String returningSequenceOfIntegers(String countRegisters) {
        StringBuilder numberForReturning = new StringBuilder();
        int startDiapozone = 0;
        int finishDiapazone = 10;
        char[] numberOfSymbols = countRegisters.toCharArray();
        char digitChar1 = numberOfSymbols[0];
        char digitChar2 = numberOfSymbols[1];
        int digit1 = Character.getNumericValue(digitChar1);
        int digit2 = Character.getNumericValue(digitChar2);
        String numberForPin = String.valueOf(digit1);
        numberForPin += digit2;
        int digit = Integer.parseInt(numberForPin);
        for (int i = 0; i < digit; i++) {
            int numberForCircle = startDiapozone + (int) (Math.random() * finishDiapazone);
            numberForReturning.append(numberForCircle);
        }
        return numberForReturning.toString();
    }
}
