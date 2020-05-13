package day043;

import java.util.ArrayList;
import java.util.List;

public class Sturbucks {
    public static void main(String[] args) {
        Coffee c1 = new Coffee();
        System.out.println(c1);
        c1.setPrice(2.0);

        c1.setType("Capuccino");
        c1.setCaffeineLevel(2);
        System.out.println(c1);

        //any non primitive type (reference variables) can be assigned to null
        //It means I am not writing any address yet
        //object is in the steak and not assigned yet
        //String str=null;
        //Scanner scan=null;
        //Coffee cx=null;//Coffee object
        Coffee c2=new Coffee("Intensito",9);
        System.out.println("c2 = " + c2);
        Coffee c3=new Coffee("Blonde",5,1.6);
        System.out.println("c3 = " + c3);
        Coffee c4=new Coffee("Latte",3,-2.6);
        System.out.println("c4 = " + c4);
        double sumOfCoffee=c1.getPrice()+c2.getPrice()+c3.getPrice()+c4.getPrice();
        System.out.println("sum Of Coffee Price = " + sumOfCoffee);
        List<String> lst=new ArrayList<>();

    }
}