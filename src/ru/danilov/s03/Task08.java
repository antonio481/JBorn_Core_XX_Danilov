package ru.danilov.s03;

public class Task08 {
    public static void main(String[] args) {
        System.out.println(compareStrings("java go home","java1"));
    }
    private static String compareStrings(String str1, String str2){
        StringBuilder newString=new StringBuilder();
        if(str1.contains(str2))
            return str1;
        else
            newString.append(str2).append(str1);
            return newString.toString();
    }
}
