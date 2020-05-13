package day040;

public class HotMarketAction3 {
    public static void main(String[] args) {
        Offer o1=new Offer();
        o1.company="Apple";
        o1.location="Austin";
        o1.isFullTime=false;
        o1.salary=90000;

        o1.displayInformation();
        o1.turnToFullTime();
        o1.salary+=2000;
        o1.changeLocation("Fort Worth");
        o1.displayInformation();
        o1.turnToFullTime();
        o1.displayInformation();

        o1.changeAllInformation("Amazon","NewJersey",19000,true);
    o1.displayInformation();
    boolean isTrue=o1.is100KOffer();
        System.out.println("Is it >=100KOffer  = "+ isTrue);
        //if salary>=100K we change the location by changeLocation() method
    if (isTrue==true){//instead we can write ......>>>>>if(o1.is100KOffer())
        o1.changeLocation("Atlanta");
    }

    o1.displayInformation();


    }
}
