package org.example;

public class Main {
    public static void main(String[] args) {

        int credit = 1000000;
        double interestRate = 0.0999;

        PaymentService service = new PaymentService();
        long payment = service.calculate(credit, interestRate, 12);
        System.out.println(payment + " ₽");
        payment = service.calculate(credit, interestRate, 24);
        System.out.println(payment + " ₽");
        payment = service.calculate(credit, interestRate, 36);
        System.out.println(payment + " ₽");
    }
}