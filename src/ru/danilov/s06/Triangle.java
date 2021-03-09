package ru.danilov.s06;

public class Triangle extends Shape {
    private int a;
    private int b;
    private int c;

    @Override
    int calculatePerimeter() {
        return a+b+c;
    }

    @Override
    int calculateArea() {
        int p=(a+b+c)/2;
        return (int) Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
