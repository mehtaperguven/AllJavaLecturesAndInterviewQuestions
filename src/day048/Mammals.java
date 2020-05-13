package day048;
//Mammal is extending Abstract super class animal
//and Mammal is another Abstract class as well

public abstract class Mammals extends Animal{

    //public abstract void makeNoise();
    // comes from Animal abstract super class

    // if the sub class of abstract super class is also abstract
    // you are not required to provide body for abstract method
    // because abstract class can have abstract method
    // YOU CAN OPTIONALLY PROVIDE BODY/

    //Optionally we can add body in  sub abstract class
    public abstract void drinkMilk();//we add new abstract method


}
