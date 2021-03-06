package ru.danilov.s04;

public class Eight {


    static int a = 69;


    public static void main (String [] args){


        Eight eight = new Eight();


        Eight eight1 = new Eight();


        System.out.println(eight.a + " == " + eight1.a);


        eight.a++;


        System.out.println(eight.a + " == " + eight1.a);


    }

}