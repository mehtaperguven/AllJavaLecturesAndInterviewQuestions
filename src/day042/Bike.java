package day042;

public class Bike {
    int gear;
    String brand;
    int speed;

    //constructor is a block of code
    //that has same name as classname
    //and has no return type!!!!
    //the only time you can call this constructor
    //when object is being performed
    //Bike is not a method it is CONSTRUCTOR
    //It seems like a method
public Bike(){
    System.out.println("message from constructor");
    gear=1;

}public Bike(int newGear){
    this.gear=newGear;
    //gear=newGear;
    }public Bike(int gear,int speed){
    this.gear=gear;
    this.speed=speed;

    }public Bike(String str){
        System.out.println("Accept string");
    }
}
