package day042;

import org.w3c.dom.ls.LSOutput;

public class MovieAction {
    public static void main(String[] args) {
        Movie m1=new Movie();
        System.out.println("m1 = " + m1);//all instance variables are null ,0.0

        Movie m2=new Movie("Joker",2.2,"Drama");
        Movie m3=new Movie("Frozen2",1.5,"Happiness");
        System.out.println("m2 = "+ m2);
        System.out.println("m3 = "+ m3);
        //System.out.println(m2.name);//we can not access to name
        //since it is defined as private!!!!
        System.out.println(m2.getName());

    }

}
