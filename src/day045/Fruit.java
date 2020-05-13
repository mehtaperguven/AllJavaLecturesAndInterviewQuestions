package day045;

public class Fruit {
    //ALWAYS ADD NO ARG CONSTRUCTOR IN SUPER CLASS
    //TO AVOID UNNECESSARY ERROR OF SUB CLASS
    // CALLING SUPER CLASSES' NO ARG CONSTRUCTOR
    public Fruit() {
        System.out.println("Fruit constructor message");
    }
    public Fruit(String str){
        System.out.println("One argument Fruit Constructor");
    }
}
