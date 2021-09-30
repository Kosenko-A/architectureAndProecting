package ru.geekbrains.homeworks.lesson5;

public class AppStrategy {


    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        Order order1 = new Order();
        PaymentStrategy strategy = new CreditCardPaymentStrategy(creditCard);
        order1.pay(strategy);
    }
}
