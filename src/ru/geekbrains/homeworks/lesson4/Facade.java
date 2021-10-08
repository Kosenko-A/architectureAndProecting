package ru.geekbrains.homeworks.lesson4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

// можно использовать при введении различных данных пользователя int - возраст; String - имя и тд.
public class Facade {

    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public String getString() throws Exception {
        return bufferedReader.readLine();
    }

    public int getInt() throws Exception {
        return Integer.parseInt(bufferedReader.readLine());
        //здесь вопрос: а можно было вместо этой строки написать
        //return bufferedReader.read(); ???
    }

    public InetAddress getAddress() throws Exception {
        String s = bufferedReader.readLine();
        return InetAddress.getByName(s);
    }
}
