package ru.danilov.s01;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Java");// write your code here
        int[] a = new int[] { 1, 2, 3, 5 };
        int[] b = new int[] { 1, 1, 1, 1 };
        b = a;
        b[0] = 9;
        System.out.println(b);
        System.out.println(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
