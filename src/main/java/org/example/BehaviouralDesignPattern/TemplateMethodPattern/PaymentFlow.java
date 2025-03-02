package org.example.BehaviouralDesignPattern.TemplateMethodPattern;

public abstract class PaymentFlow {
    public abstract void validateRequest();
    public abstract void debitAmount();
    public abstract void calculateFees();
    public abstract void creditAmount();

    // This is template method which is defining the rigid flow which every class or inheritor is suppose to follow
    public final void sendMoney(){
        // Step 1.
        validateRequest();

        // Step 2.
        debitAmount();

        // Step 3.
        calculateFees();

        // Step 4.
        creditAmount();
    }
}
