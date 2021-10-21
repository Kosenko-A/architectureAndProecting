package ru.geekbrains.homeworks.lesson6;


public class Order {
    private int id;
    private String productList;
    private long totalPrice;

    public Order (int id, String productList, long totalPrice) {
        this.id = id;
        this.productList = productList;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }
}
