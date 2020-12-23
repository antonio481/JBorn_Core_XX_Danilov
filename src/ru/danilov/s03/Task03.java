package ru.danilov.s03;

import java.util.Scanner;



public class Task03 {
    public static void main(String[] args) {
        drawRectangle();
    }
    private static void drawRectangle() {
        System.out.println("Введите длину прямоугольника");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int S = length * width;
        int P = 2 * (length + width);
        System.out.println(S);
        System.out.println(P);
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                if (i == 0 || i == width - 1) {
                    System.out.print('*');
                } else {
                    if (j == 0 || j == length - 1) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
            }
            System.out.print("\n\r");
        }

}}
