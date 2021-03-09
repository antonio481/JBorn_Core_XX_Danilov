package ru.danilov.s06;

public class Square extends Shape {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    int calculatePerimeter() {
        return 4*a;
    }

    @Override
    int calculateArea() {
        return a*a;
    }
}
