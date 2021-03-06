package ru.danilov.s04;

public class s07 {
    private static String i;
    protected static void dothis(){
s071 s071=new s071();
 s071.chanI();
    }

    static class s071{
        private void chanI(){
            i="1";
            s07.dothis();
        }

    }

    public static void main(String[] args) {
        s07 s07=new s07();
       s07.dothis();
    }


}
