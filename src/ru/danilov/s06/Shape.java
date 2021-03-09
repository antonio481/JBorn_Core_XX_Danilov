package ru.danilov.s06;

abstract class Shape {
    private int sumAreaShapes;
    abstract int calculatePerimeter();
    abstract int calculateArea();
    int calculateAreaShapes(Shape ... shapes){
        for (Shape shape : shapes) {
            sumAreaShapes += shape.calculateArea();
        }
    return sumAreaShapes;
    }
}
