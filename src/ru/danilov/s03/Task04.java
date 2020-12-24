package ru.danilov.s03;

public class Task04 {
    public static void main(String[] args) {
        numberOfOccurrences("Jborn", 'r');
    }
    private static void numberOfOccurrences(String string, char c){
        int occurrences=0;
        StringBuilder s=new StringBuilder(string);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                s.deleteCharAt(i);
                occurrences++;
            }
        }
        System.out.println("Количество вхождений: "+occurrences);
        System.out.println(s);
    }
}
