package ru.geekbrains.homeworks.lesson7;

//модель
public class Product {

    private String productName;
    private int price;

    public int getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
