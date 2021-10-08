package ru.geekbrains.homeworks.lesson6;

public class Product {
    private int id;
    private String productName;
    private long price;

    public Product(int id, String productName, long price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    public int getId() {
        return id;
    }
}
