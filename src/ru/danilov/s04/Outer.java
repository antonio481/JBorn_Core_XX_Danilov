package ru.danilov.s04;

public class Outer {
    private String str;

    public Outer(String str) {
        this.str = str;
    }

    Inner returnInner(){
        return new Inner();
    }
    static class Inner{

        public String toString(Outer outer) {
            System.out.println(outer.str);
            return "Inner{}";
        }

        public static void main(String[] args) {
            Outer outer=new Outer("kfak");
            outer.returnInner();
            Inner inner =new Inner();
            inner.toString(outer);
        }
    }
}
