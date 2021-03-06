package ru.danilov.s04;

public class ConnectionManager {
    Connection Singletone(){
        return Connection.access();
    }

    public static void main(String[] args) {
        ConnectionManager connectionManager=new ConnectionManager();
        System.out.println(connectionManager.Singletone());
        System.out.println(connectionManager.Singletone());
        ConnectionManager connectionManager1=new ConnectionManager();
        System.out.println(connectionManager1.Singletone());
        System.out.println(connectionManager1.Singletone());
    }
}
