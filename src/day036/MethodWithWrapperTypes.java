package day036;

public class MethodWithWrapperTypes {
    public static void main(String[] args) {
Integer i1=23;
//i1 is a variable with type Integer It can store Integer Object
        //Autoboxing;
Integer i2=10;//autoboxing as well/
//we used 4 different ways below for the same purpose!!!
   sumAndPrint(i1,i2);  //we gave two Integer objects
   sumAndPrint(Integer.valueOf(23),Integer.valueOf(10));
   sumAndPrint(23,10);// we gave two primitives directly //It uses autoboxing to take primitives
   sumAndPrint(new Integer(23),new Integer(10));//Depricated!!


   printTheDoubledValue(5);
   printTheDoubledValue(new Integer(10));
   //Above we can pass Integer object to a method that except int only
        //by the power of AUTO_UNBOXING//Integer object to int
    }
    public static void sumAndPrint(Integer num1, Integer num2){
        //this method add 2 Integer objects, numbers and print
// @param num1 type Integer, first number to add
        // @param num2 type Integer, second number to add

        System.out.println(num1+num2);

        //we can not  add two objects
        //how is happening
        //The moment + operator appears
        //Compiler will turn num1 and num2 into int that can
        //add them up numerically
        //Integer to int conversion is AUTO-UNBOXING

    }public static void printTheDoubledValue(int x){

        System.out.println("after doubling x = "+ x*2);


    }
}
