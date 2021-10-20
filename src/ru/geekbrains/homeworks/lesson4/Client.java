package ru.geekbrains.homeworks.lesson4;

import java.net.InetAddress;

public class Client {

    public static void main(String[] args) throws Exception{
        Facade facade = new Facade();

        System.out.println("string >");
        String s = facade.getString();
        System.out.println(s);

        System.out.println("int >");
        int n = facade.getInt();
        System.out.println(n);

        System.out.println("ip >");
        InetAddress ip = facade.getAddress();
        System.out.println(ip);

    }

}
