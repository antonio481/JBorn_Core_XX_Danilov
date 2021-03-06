package ru.danilov.s04.accesspackage;

public class AccessClass {
    public int i=0;
    protected int a=0;
    private int c=0;

    static class ClassForDostup{
        public static void main(String[] args) {
            AccessClass accessClass=new AccessClass();
            accessClass.a=0;
        }
    }
}
