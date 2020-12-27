package ru.danilov.s03;

public class Task07 {
    public static void main(String[] args) {
        System.out.println(upperCaseSymbol("Java", 'a'));
    }
    private static String upperCaseSymbol(String str, char symbol) {
        StringBuilder newString = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbol) {
                newString.setCharAt(i,Character.toUpperCase(newString.charAt(i)));
            } else {
                newString.setCharAt(i,Character.toLowerCase(newString.charAt(i)));
            }
        }
        return newString.toString();
    }
}
