package day040;

import java.util.ArrayList;

public class HotMarketActions {
    public static void main(String[] args) {
        //first Offer object is preparing below
        Offer offer1=new Offer();
        offer1.company="Apple";
        offer1.location="Austin";
        offer1.salary=140000;
        offer1.isFullTime=true;
        offer1.displayInformation();


        Offer offer2=new Offer();
        offer2.company="Google";
        offer2.location="Boston";
        offer2.salary=120000;
        offer2.isFullTime=true;
        offer2.displayInformation();

        Offer offer3=new Offer();
        offer3.company="Amazon";
        offer3.location="Vancouver";
        offer3.salary=96000;
        offer3.isFullTime=true;
        offer3.displayInformation();

        Offer offer4=new Offer();
        //if we do not assign values for instance variable|field
        //we get default values
        //for primitive numbers 0 or 0.0
        //boolean..>>false........char....>>' '
        //for any reference type...>>null
        offer4.displayInformation();
        //let us produce ArrayList of offer to store multiple offer objects

        ArrayList<Offer> myOffers=new ArrayList<>();
        myOffers.add(offer1);
        myOffers.add(offer2);
        myOffers.add(offer3);
        myOffers.add(offer4);
        System.out.println("******MY OFFERS USING FOREACH LOOP*******");

        for (Offer each: myOffers){
            each.displayInformation();
        }
        System.out.println("************MY OFFERS BY FOR LOOP********");
        for (int i=0;i<myOffers.size();i++){
          Offer each= myOffers.get(i);
          each.displayInformation();
        }

    }
}
