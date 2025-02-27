package org.example.MediatorDesignPattern;

public interface Mediator {
    void placeBid(Colleague bidder,int amount);
    void notifyAllAboutBid(String bidderName);
    void addBiddersInAuction(Colleague bidder);
}
