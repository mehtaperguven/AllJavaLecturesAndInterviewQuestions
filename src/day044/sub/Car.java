package day044.sub;

import day044.Vehicle;

public class Car extends Vehicle {//car is in the sub package
    //vehicle is in package day044
    //Car and Vehicle are in two different packages
    //we should import day044.Vehicle

    int mileage;
    public static void main(String[] args) {
        Car c1=new Car();
        c1.make="Toyota Corolla";
        c1.mileage=35478;
        System.out.println("c1.make = " + c1.make);

        //when we have default access modifier like.. String make..
        // we can not inherit from different package
        //private int year is not inherited since has private access modifier
        //if we use PROTECTED ACCESS MODIFIER
        //we can access to instance variable in subclass from parent
        // which is in DIFFERENT PACKAGE


    }

}
