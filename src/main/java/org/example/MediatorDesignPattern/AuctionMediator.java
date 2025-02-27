package org.example.MediatorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements Mediator{
    List<Colleague> bidderList;
    int latestBidAmount;

    public AuctionMediator(){
        bidderList=new ArrayList<>();
        latestBidAmount=0;
    }

    @Override
    public void placeBid(Colleague bidder,int amount){
        latestBidAmount=amount;
        notifyAllAboutBid(bidder.getName());
    }

    @Override
    public void notifyAllAboutBid(String bidderName) {
        for(Colleague bidder:bidderList){
            bidder.getLatestBidInformation(bidderName,latestBidAmount);
        }
    }

    @Override
    public void addBiddersInAuction(Colleague bidder) {
        bidderList.add(bidder);
    }
}
