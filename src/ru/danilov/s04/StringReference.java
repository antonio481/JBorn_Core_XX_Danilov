package ru.danilov.s04;

public class StringReference {
    static String s;

    public StringReference(String s) {
        this.s = s;
    }

    public static void main(String[] args) {
            String b="asa";

        System.out.println(StringReference.s);
    }
}
