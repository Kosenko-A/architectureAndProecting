package ru.geekbrains.homeworks.lesson5;

public class Order {

    Money money;

    public void pay (PaymentStrategy strategy) {
        strategy.pay(money);
    }
}
