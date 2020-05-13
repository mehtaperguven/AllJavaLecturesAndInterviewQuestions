package day040;

public class HotMarketActios2 {
    public static void main(String[] args) {
            //first Offer object is prepared below
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
            offer4.displayInformation();
            //let us add 2000 to the salary of offer3
            //offer3.salary=96000+2000;
            //offer3.salary=offer3.salary+2000;
            offer3.salary+=2000;
        System.out.println("New Amazon salary = "+offer3.salary);

    offer4.salary=offer1.salary+offer2.salary+offer3.salary;
    offer4.displayInformation();
    offer4.turnToFullTime();
    offer4.turnToFullTime();
    offer4.displayInformation();
    offer4.changeLocation("Virginia");
    offer4.displayInformation();

    }

}
