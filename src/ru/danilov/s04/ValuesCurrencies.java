package ru.danilov.s04;

public class ValuesCurrencies {


    public static void main(String[] args) {

        for(Currencies s:Currencies.values()){

            switch (s){
                case rub:
                    System.out.println("рубль");
                    break;
                case euro:
                    System.out.println("евро");
                break;
                    case funt:
                    System.out.println("фунт");
                break;
                    case iena:
                    System.out.println("йена");
                break;
                    case frank:
                    System.out.println("франк");
                break;
                    case dollar:
                    System.out.println("доллар");
            break;
            }
        }

    }
}
