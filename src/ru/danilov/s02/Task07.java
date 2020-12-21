package ru.danilov.s02;

public class Task07 {
        private static void sumAndCompositionMembersOfMassive(int []array){
            int sum=0;
            int composition=1;
            for(int i=0;i<array.length;i++){
                if(i%2==0)
                    sum=sum+array[i];
                else
                    composition=composition*array[i];
            }
            System.out.println(sum);
            System.out.println(composition);
        }
}
