package ru.geekbrains.homeworks.lesson5;

public final class CreditCardPaymentStrategy implements PaymentStrategy{

    private final CreditCard creditCard;

    public CreditCardPaymentStrategy (CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void pay(Money money) {
        System.out.printf("processing %s via credit card %s\n", money.toString(), creditCard.getNumber());
    }
}
