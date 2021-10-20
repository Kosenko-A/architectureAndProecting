package ru.geekbrains.homeworks.lesson7;

//вид
public class ProductView {

    public void printProductInfo(String productName, int price) {
        System.out.println("Товар: ");
        System.out.println("Наименование: " + productName);
        System.out.println("Цена: " + price);
    }
}
