package ru.danilov.s04;

public class Main {
    public static void main1(String[] ...args) {
        for (int i=0;i< args.length;i++)
            System.out.println(args[i]);
    }

    public static void main(String[] args) {
        String[]a=new String[2];
        a[0]="1";
        a[1]="2";

        String[]b=new String[2];
        main1(a,b);
    }
}
