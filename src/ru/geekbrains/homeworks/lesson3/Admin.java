package ru.geekbrains.homeworks.lesson3;

//предположим, что у нас интернет-магазин небольшого предприятия. Покупателей может быть множетво, а админ только один,
//тогда можно использовать порождающий паттерн Singleton

public class Admin {

    private  static Admin admin;
     private Admin() {}

    public static Admin getAdmin() {
        Admin localadmin = admin;
        if (localadmin == null) {
            synchronized (Admin.class) {
                localadmin = admin;
                if (localadmin == null) {
                    localadmin = admin = new Admin();
                }
            }
        }
        return localadmin;
    }
}
