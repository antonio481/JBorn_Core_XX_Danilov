package ru.danilov.s04;

public class Tank {
    boolean checkedIsEmpty=false;
    Tank(boolean checkedIsEmpty){
        checkedIsEmpty=checkedIsEmpty;
    }
    void checkedIsEmpty(){
        checkedIsEmpty=false;
    }
public void finalize(){
        if(checkedIsEmpty){
            System.out.println("tank empty");
        }
else{
            System.out.println("tank not empty");
        }
    }
}
