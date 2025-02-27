package org.example.MediatorDesignPattern;

public interface Colleague {
    void placeBid(int amount);
    void getLatestBidInformation(String bidderName,int bidAmount);
    String getName();
}
