package ru.danilov.s05;

public class Multiplication {
    public class Addition extends Operation {

        int last;
        int beforeLast;

        @Override
        int calculate(int a, int b) {
            beforeLast = last;
            last = a * b;
            return last;
        }

        @Override
        int returnPrevious() {
            return beforeLast;
        }
    }
}
