package org.example.TemplateMethodPattern;

public class PaymentToMerchant extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("payment to merchant validating request !!!");
    }

    @Override
    public void debitAmount() {
        System.out.println("debit the amount of : 10,000 ");
    }

    @Override
    public void calculateFees() {
        System.out.println("fees calculation in progress 12% of total : 1,200");
    }

    @Override
    public void creditAmount() {
        System.out.println("credit amount to merchant account 8,800");
    }
}
