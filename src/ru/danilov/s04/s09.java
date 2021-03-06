package ru.danilov.s04;

public class s09 {
    protected class Inner implements s07interface{
        Inner returnNewInner(){
            return new Inner();
        }
        @Override
        public void doitSomething() {

        }
    }
}
