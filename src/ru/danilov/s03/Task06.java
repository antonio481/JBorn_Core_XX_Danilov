package ru.danilov.s03;

public class Task06 {
    public static void main(String[] args) {
        System.out.println(changeHalfOfStrings("symbol"));
    }
    private static String changeHalfOfStrings(String string) {
        StringBuilder newString=new StringBuilder();
        if (string.length() % 2 == 0) {
            newString.append(string.substring(string.length() / 2));
            newString.append(string, 0, string.length() / 2);
        }
        return newString.toString();
    }
}