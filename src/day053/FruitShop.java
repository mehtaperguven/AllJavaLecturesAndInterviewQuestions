package day053;

import java.util.Arrays;

public class FruitShop {
    //Fruit is reference type , Actual Object Type is Apple or Orange
    //At Compile time Reference type decide
    //when we run actual type decide what to call
//    Reference type determines access at compile time;
//    object type, actual type determines methods at runtime
    public static void main(String[] args) {
        Apple a1 = new Apple("sweet", "red", "Fuji");


        System.out.println("a1.taste = " + a1.taste);
        System.out.println("a1.color = " + a1.color);
        System.out.println("a1.type = " + a1.type);
        a1.getDigested();

//         String str=null;
//        System.out.println(str.charAt(0));
        //when we write above code before running it does not give error
        //it compiles
        //However when we run it gives RUNTIME ERROR
        System.out.println("---------------------");
//Polymorphism Starts Below:::::::::::::::::

        Fruit f1 = a1;//now a1 has two pointer f1 is second pointer in the next
        //Above Apple a1=new Apple("sweet","red","Fuji");
        // a1 is first pointer for same object
        System.out.println("f1.color = " + f1.color);//
        System.out.println("f1.taste = " + f1.taste);
        f1.getDigested();
        //if Fruit does not have getDigested() method
        //f1.getDigested() will not work
        f1 = new Orange("sour-sweet", "redish", 11);
        f1.getDigested();
        System.out.println(f1.toString());

        //FRUIT IS REFERENCE TYPE//APPLE IS ACTUAL OBJECT TYPE
        Apple ap1=new Apple("soure","red","Golden");
        System.out.println("ap1   "+ap1);

    }



}
