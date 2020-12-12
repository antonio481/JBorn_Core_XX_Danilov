package ru.danilov.s02;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        printingMultiplicationTableForNumber();
    }
    private static void printingMultiplicationTableForNumber(){
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int n=11;
        int[] array =new int[11];
        for (int i=1;i<n;i++){
            array[i]=i;
        }
        for (int i=1;i<n;i++){
            System.out.println(array[i]*number);
        }
    }
}
