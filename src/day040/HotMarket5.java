package day040;

import java.util.ArrayList;

public class HotMarket5 {
    public static void main(String[] args) {
        Offer offer1=new Offer();
        offer1.company="Apple";
        offer1.location="Austin";
        offer1.salary=140000;
        offer1.isFullTime=true;

        Offer offer2=new Offer();
        offer2.company="Google";
        offer2.location="Boston";
        offer2.salary=120000;
        offer2.isFullTime=true;

        Offer offer3=new Offer();
        offer3.company="Amazon";
        offer3.location="Vancouver";
        offer3.salary=96000;
        offer3.isFullTime=true;


        Offer offer4=new Offer();

        ArrayList<Offer> myOffers=new ArrayList<>();
        myOffers.add(offer1);
        myOffers.add(offer2);
        myOffers.add(offer3);
        myOffers.add(offer4);
        System.out.println("******MY OFFERS USING FOREACH LOOP*******");

        System.out.println(myOffers);//no hash code
    }
}
