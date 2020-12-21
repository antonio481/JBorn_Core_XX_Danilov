package ru.danilov.s02;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Calculator();
    }

    private static void Calculator() {
        System.out.println("Введите тип калькулятора(Возможные значения:Градусы Цельсия ó Градусы Фаренгейт, Сантиметры ó Дюймы, Километры ó Мили (морские), Верста ó Аршин, Килограммы ó Фунты, Литры ó Галлоны):");
        Scanner scanner = new Scanner(System.in);
        String typeCalculator = scanner.nextLine();
        System.out.println("Введите значение");
        double value = scanner.nextDouble();
        System.out.println("Введите порядок перевода(1 если прямой, 2 если обратный)");
        int order = scanner.nextInt();
        switch (typeCalculator) {
            case ("Градусы Цельсия ó Градусы Фаренгейт"):
                if (order == 1)
                    System.out.println((value * 9 / 5) + 32);
                else
                    System.out.println((1 - 32) * 5 / 9);
                break;
            case ("Сантиметры ó Дюймы"):
                if (order == 1)
                    System.out.println(value / 2.54);
                else
                    System.out.println(value * 2.54);
                break;
            case ("Километры ó Мили (морские)"):
                if (order == 1)
                    System.out.println(value / 1.852);
                else
                    System.out.println(value * 1.852);
                break;
            case ("Верста ó Аршин"):
                if (order == 1)
                    System.out.println(value * 1500);
                else
                    System.out.println(value / 1500);
                break;
            case ("Килограммы ó Фунты"):
                if (order == 1)
                    System.out.println(value * 2.205);
                else
                    System.out.println(value / 2.205);
                break;
            case ("Литры ó Галлоны"):
                if (order == 1)
                    System.out.println(value / 3.785);
                else
                    System.out.println(value * 3.785);
                break;
        }

    }
}
