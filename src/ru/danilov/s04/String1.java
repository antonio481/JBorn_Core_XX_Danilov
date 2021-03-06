package ru.danilov.s04;

public class String1 {

    static String string="afkas";
    static String string2;
    void print(){
        System.out.println(string);
        System.out.println(string2);
    }
    static{
        string2="askjfka";
        System.out.println(string);
        System.out.println(string2);
    }

    public static void main(String[] args) {
        String1 str=new String1();
        str.print();
        System.out.println(string);
        System.out.println(string2);
    }
}
