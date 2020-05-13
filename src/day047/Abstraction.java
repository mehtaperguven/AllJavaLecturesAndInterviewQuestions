package day047;

public class Abstraction {

    /*Student "super class"//it is not template in here now
    //it is only guide for sub Classes
    studentId;
    fullName;
    abstract
    ///attendClass()


    sub class:
    LocalStudent
    classID
    attendClass()


    subClass:
    OnlineStudent
    webinarID
    attendClass()

//    ABSTRACTION IS DONE BY abstract Class!!!!!!!
//    IT CAN BE ABSTRACT METHOD
//    NO ABSTRACT FIELD/VARIABLE
//final method says you can not override
 abstract method oppositely says we must override
 //abstract is just super class not to produce an object
 //it produce reusable methods
 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    attributes:instance field
    Car//abstract class
    make
    model year
    behaviors:methods:
    start()
    accelerate()
    slowDown()
    turn()
    goForward()
    .....

    Car is ABSTRACT CLASS it is template
    //we put abstract methods only in the abstract class

    //
    public abstract void goForward();
    //no body
    public abstract void goBackward();
    //no body
    public abstract void start();
    //no body

    //BODY WOULD BE IN THE SUBCLASS



    ElectricCar// SUBCLASS

//we produce their body in the sub class below!!!!!!!!
    GasCar//subclass*************************************

    public class GasCar extends Car {//IT IS  MUST TO OVERRIDE
    public int gasLevel;//instance field

    @Override
    public void start() {
        System.out.println("start to proceed");

    }

    @Override
    public void goForward() {
        System.out.println("Go forward");
    }

    @Override
    public void goBackward() {
        System.out.println("Go backward");
    }

    @Override
    public void turn(String direction) {
        System.out.println("Turn to "+direction);
    }*************************************************





    *public abstract class Student{

    public abstract void attendClass();
    //no body of abstract method
    //no curly brackets
    }
   abstract keyword is used to produce abstract method()
   Abstract method does not have a body
   //there is no { }
    *
    ##################################################
    WHAT IS THE DIFFERENCE BETWEEN NORMAL AND ABSTRACT CLASS
?????????????????????????????????????????????????????????????
   //// Normal class CAN NOT HAVE ABSTRACT METHOD
   ////it can have everything else

   //// Abstract CLASS can have instance field/ static field
METHODS:
"Abstract methods can be in abstract class without body"
"Non abstract methods can be in an abstract class with their body"

CONSTRUCTOR:
Constructor can be in abstract class
We do not produce an object in constructor
To initialize fields generally we use constructor in abstract class
we use super(arguments....) to initialize the fields


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    AS A RESULT:::
    ABSTRACT CLASS CAN NOT BE INSTANTIATED (nO object)


    ABSTRACT CLASS HAVE EVERYTHING LIKE A NORMAL CLASS

    ABSTRACT CLASS HAVE ABSTRACT METHODS(ADDITIONALLY) */
}
