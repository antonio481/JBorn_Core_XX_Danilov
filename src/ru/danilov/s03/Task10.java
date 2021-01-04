package ru.danilov.s03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(gettingPartinLatinLetters("111*12J4344/12a3a"));
    }
    private static String gettingPartinLatinLetters(String str){
        String regex = "[a-zA-z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        StringBuilder newString=new StringBuilder();

        while (matcher.find()){
    newString.append(str, matcher.start(), matcher.end());

    }
    return newString.toString();
    }
}
