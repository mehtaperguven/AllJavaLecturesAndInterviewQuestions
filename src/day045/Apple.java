package day045;

public class Apple extends Fruit {
//if we do not have any constructor
// we will have super classes' constructor as default constructor!!!
    //compiler automatically call no args constructor of super class
    public Apple(){//first line of any constructor is automatically
        //calling super() ,if we do not call any super()!!!!!

        //I want to reuse functionality
        // which already written in super class constructor
        //we can use super() or super(arguments here)
        super();//it calls super classes' constructor
        //How to call constructor with 1 argument

       // super("test");
        //we can not call  Super Class Fruit's constructor twice
        //we can call super(); only once
        System.out.println("Message from Apple constructor ");
    }

    public static void main(String[] args) {

        Apple a1=new Apple();

    }
}
