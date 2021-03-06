package ru.danilov.s04;



public class StringMassive {
    void StringMassive1(String []a , java.lang.String... args){
        System.out.println(args);
    }

    public static void main(String[] args) {
        StringMassive stringMassive=new StringMassive();
        String[] arrayw = new String[4];
        stringMassive.StringMassive1(new String[4]);
        System.out.println(args);
    }
}
