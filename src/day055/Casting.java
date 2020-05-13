package day055;


public class Casting {
    public static void main(String[] args) {

        int x=10;
        long y=x; //implicit casting small to big
   byte b=(byte) x;// explicit casting big to small int...>>byte

   Object obj=new Dog("Rex");//it is up-casting
        //from Dog type into Object type
        //no compiler error
  // obj.bark(); will not works
        //Because obj in here uses Object super classes' methods
        //bark is not between Object classes'methods.
 //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        //REFERENCE TYPE(super type) b b b  DECIDE WHAT WE CAN ACCESS
  //Dog d=obj; will give compiler error
        //hence we must do down-casting
   Dog d=(Dog)obj;
   // we are down-casting from Object type into the Dog type
    d.bark();// now Dog object can use bark() method
//
        //  WHAT IS CLASS CAST EXCEPTION

   Object o2=new Object();
   Dog d2=(Dog)o2;//NO COMPILE ERROR SINCE DOG IS-A OBJECT
  //NOW ABOVE d2=new Object which comes by o2
        //At run time HOWEVER WILL GIVE CLASS CAST EXCEPTION ERROR
        d2.bark();
        //When does class cast exception happen????
//when we try to cast super type object to subtype
        //or when the type is not a your casted reference type

        //Shape s1=new Circle();this compile fine but will throw class Cast Exception
       // Square s2=new(Square) s1;
        // because we can not do Square new Circle();
        //CIRCLE IS NOT SA SQUARE

    }
}
