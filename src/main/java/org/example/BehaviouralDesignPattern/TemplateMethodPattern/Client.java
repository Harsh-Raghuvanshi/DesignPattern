package org.example.BehaviouralDesignPattern.TemplateMethodPattern;

public class Client {
    public static void main(String[] args){
        // It's a behavioural Pattern
        // Required when we want all classes to follow the specific steps to process task but also
        // Need to provide the flexibility that each class can have their own logic in that specific steps

        PaymentFlow paymentFlow=new PaymentToFriend();
        paymentFlow.sendMoney();
        PaymentFlow paymentFlow1=new PaymentToMerchant();
        paymentFlow1.sendMoney();

    }
}
