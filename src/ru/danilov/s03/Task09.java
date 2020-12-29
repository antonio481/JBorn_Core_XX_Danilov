package ru.danilov.s03;

public class Task09 {
    public static boolean checkingPalindrome(String str1){
        StringBuilder newString=new StringBuilder(str1);
        return str1.equals(newString.reverse().toString());
    }
}
