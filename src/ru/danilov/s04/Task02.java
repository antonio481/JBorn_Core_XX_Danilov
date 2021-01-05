package ru.danilov.s04;

public class Task02 {
    public static void main(String[] args) {
        System.out.println(numbersFibpnacci(10));
    }
    private static int numbersFibpnacci(int n){
        if (n==0)
            return 0;
        else if (n==1)
            return 1;
        else
            return numbersFibpnacci(n-1)+numbersFibpnacci(n-2);
    }
}
