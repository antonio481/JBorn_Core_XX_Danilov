package ru.danilov.s03;

        import org.w3c.dom.ls.LSOutput;

        import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder strb = new StringBuilder(scan.nextLine());
        for (int i = 0; i < strb.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(strb.charAt(i));
            }
            System.out.println();
        }
    }
}
