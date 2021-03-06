package ru.danilov.s04;

public class Sequence {
    private classForTest[]items;
    private int next=0;

    public Sequence(int size) {
        items=new classForTest[size];
    }

    public void add(classForTest str){
        if(next<items.length)
            items[next++]=str;
    }
    static class classForTest{
        String str;

        public classForTest(String str) {
            this.str = str;
        }

        @Override
        public java.lang.String toString() {
            return "String{" +
                    "str=" + str +
                    '}';
        }
    }
    class SequenceSelector{
        public Sequence sequenceReference(){
            return Sequence.this;
        }
    }

    public static void main(String[] args) {
        Sequence sequence=new Sequence(2);
        classForTest  str=new classForTest ("fasf");
        classForTest  str1=new classForTest ("afsa");
        sequence.add(str);
        sequence.add(str1);
        for (int i=0;i<sequence.items.length;i++){
            System.out.println(sequence.items[i].toString());
        }

    }
}