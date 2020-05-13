package day039;
/*
* Create a Car Object template by creating a Car class
	it  has these attributes
		year , model , make , color
Create few object out of it with field value set (edited) */
public class Car {
//if we put variable inside of the main class
// it will be local variable
    //below they are instance variable
    int year;
    String color;
    String model;
    String make;
    ///String model,make,color;

    //INSTANCE METHODS are tied to the object
    //it does not have static keyword
    //we need object when we call them
   //if we have static we will not access to objects
//behaviors are below added by methods
    //behaviors are our instance methods
    //to call methods we need above objects
    public void goForward(){
       System.out.println(make+ " Going forward");
   }

   public void printCarAge(){
       System.out.println("Age is " +(2020-year));
   }
   public void changeColor(String newColor){
        color=newColor;
   }
}


