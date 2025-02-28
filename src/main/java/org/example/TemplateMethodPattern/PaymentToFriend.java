package org.example.TemplateMethodPattern;

public class PaymentToFriend extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("payment to friend validating request !!!");
    }

    @Override
    public void debitAmount() {
        System.out.println("payment to friend debit amount from sender account : 300 ");

    }

    @Override
    public void calculateFees() {
        System.out.println("payment to friend calculate Fees 10 % of total = 30 ");

    }

    @Override
    public void creditAmount() {
        System.out.println("payment to friend credit the amount : 270");

    }
}
