package org.example.BehaviouralDesignPattern.MediatorDesignPattern;

public class Bidder implements Colleague{
    String name;
    AuctionMediator auctionMediator;

    public Bidder(String name,AuctionMediator auctionMediator){
        this.name=name;
        this.auctionMediator=auctionMediator;
    }

    @Override
    public void placeBid(int amount) {
        auctionMediator.placeBid(this,amount);
    }

    @Override
    public void getLatestBidInformation(String bidder,int bidAmount) {
        System.out.println("New bid placed of "+bidAmount+"  by "+bidder+" info received by "+name);
    }

    @Override
    public String getName() {
        return name;
    }
}
