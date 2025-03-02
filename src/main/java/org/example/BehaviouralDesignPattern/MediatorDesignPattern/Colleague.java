package org.example.BehaviouralDesignPattern.MediatorDesignPattern;

public interface Colleague {
    void placeBid(int amount);
    void getLatestBidInformation(String bidderName,int bidAmount);
    String getName();
}
