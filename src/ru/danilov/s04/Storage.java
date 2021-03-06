package ru.danilov.s04;

public class Storage {
    static int storage(String s){
        return s.length()*2;
    }

    public static void main(String[] args) {
        System.out.println(storage("1"));
    }
}
