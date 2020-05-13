package day047;
//this class is designed to be super class
//I do not need to produce Car object using this class
//these has reusable fields and methods for sub classes
public abstract class Car {//since we have abstract keyword
    //we can not use "extends" in sub class to inherit
    // however we can override methods and helps to compiler
    int year;
    String brand;

    //only abstract class can have abstract method!!!!
    //it has abstract keyword
    //abstract method does not have a body!!!
    public abstract void start(); // no body !!!! no { }

public abstract void goForward();

public abstract void goBackward();

public abstract void turn(String direction);

public void doCarthing(){
    System.out.println("Non abstract method can be in an abstract class");
}
}
