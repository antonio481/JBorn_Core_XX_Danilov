package ru.danilov.s04;

public class Connection {
    private Connection() {
    }
    private static Connection connection=new Connection();
    public static Connection access(){
        return connection;
    }
}
