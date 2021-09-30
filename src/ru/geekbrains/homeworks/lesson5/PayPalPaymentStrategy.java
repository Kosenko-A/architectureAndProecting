package ru.geekbrains.homeworks.lesson5;

public final class PayPalPaymentStrategy implements PaymentStrategy{

    private final String email;
    private final String token;

    public PayPalPaymentStrategy (String email, String token) {
        this.email = email;
        this.token = token;
    }
    @Override
    public void pay(Money money) {
        System.out.printf("processing %s via credit card %s\n", money.toString(), email);
    }
}
