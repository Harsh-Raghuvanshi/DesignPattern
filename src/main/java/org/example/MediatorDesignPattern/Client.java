package org.example.MediatorDesignPattern;

public class Client {
    public static void main(String[] args){
        AuctionMediator auctionMediator=new AuctionMediator();
        Colleague bidder1=new Bidder("Harsh",auctionMediator);
        Colleague bidder2=new Bidder("Ria",auctionMediator);
        Colleague bidder3=new Bidder("Abhinav",auctionMediator);
        auctionMediator.addBiddersInAuction(bidder1);
        auctionMediator.addBiddersInAuction(bidder2);
        auctionMediator.addBiddersInAuction(bidder3);

        bidder1.placeBid(200);
        bidder2.placeBid(205);
        bidder1.placeBid(207);
        bidder3.placeBid(210);
        bidder1.placeBid(221);

    }
}
