package ru.danilov.s06;

public class Rectangle extends Shape {
    private int a;
    private int b;

    @Override
    int calculatePerimeter() {
        return 2*(a+b);
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    int calculateArea() {
        return a*b;
    }
}
