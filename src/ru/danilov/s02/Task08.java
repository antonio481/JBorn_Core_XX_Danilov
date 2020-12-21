package ru.danilov.s02;

import java.util.Scanner;

public class Task08 {
    private static void division(){
        Scanner scanner=new Scanner(System.in);
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        if(number1%number2==0){
            System.out.println(number1/number2+"-частное");
        }
        else
            System.out.println(number1%number2+"-остаток от деления");
    }
}
