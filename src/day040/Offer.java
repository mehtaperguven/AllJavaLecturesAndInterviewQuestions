package day040;

import org.w3c.dom.ls.LSOutput;

public class Offer {

    //instance variables
    String location;
    String company;
    long salary;
    boolean isFullTime;
    /*
    //inside instance method we can directly access instance variable
    * This is method to print all information about Offer object*/
public void displayInformation(){
    System.out.println("Location = "+location+" , "+ "Company = "+company+
            " , "+ "Salary = "+salary+" , "+"is Full Time = "+isFullTime);
}//below method turn isFullTime to full time by true
public void turnToFullTime(){
    if (isFullTime==false){
        isFullTime=true;
    }else{
        System.out.println("ALREADY FULL TIME");
    }

}public void changeLocation(String newLocation){
    location=newLocation;

}public void changeAllInformation(String newCompany,String newLocation,long newSalary,boolean newIsFull){

    company=newCompany;
    changeLocation(newLocation);
    location=newLocation;
    salary=newSalary;
    isFullTime=newIsFull;
    displayInformation();
}public boolean is100KOffer(){//boolean is primitive Boolean is wrapper type

        return salary>=100000;

    }public String toString(){
    String str="[ Location = "+location+" , "+ "Company = "+company+
            " , "+ "Salary = "+salary+" , "+"is Full Time = "+isFullTime+" ]";
   return str;
    }public String toString2(Offer o1){

    return o1.toString();
    }
    }



