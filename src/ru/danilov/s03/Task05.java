package ru.danilov.s03;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        compareFIO();
    }
    private static void compareFIO() {
        Scanner scanner = new Scanner(System.in);
        String firstFIO = scanner.nextLine();
        String secondFIO = scanner.nextLine();
        if(firstFIO.equals(secondFIO)){
            System.out.println("Люди являются тезками");
        }
    }
}
