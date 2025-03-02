package org.example.BehaviouralDesignPattern.MediatorDesignPattern;

public interface Mediator {
    void placeBid(Colleague bidder,int amount);
    void notifyAllAboutBid(String bidderName);
    void addBiddersInAuction(Colleague bidder);
}
