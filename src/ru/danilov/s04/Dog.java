package ru.danilov.s04;

public class Dog {
    public void bark(){
        System.out.println("Гав-гав");
    }
    public void bark(String zavivanie){
        System.out.println("Завывание");
    }
    public void bark(char posculivanie){
        System.out.println("Поскуливание");
    }
    public void bark(char posculivanie, String zz){
        System.out.println("Поскуливание1");
    }
    public void bark(String zz, char posculivanie){
        System.out.println("Поскуливание2");
    }
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.bark();
        dog.bark("sjsks");
        dog.bark('1');
        dog.bark('1',"111");
        dog.bark("1",'1');
    }

}
