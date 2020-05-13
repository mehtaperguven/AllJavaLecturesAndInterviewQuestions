package day043;

import java.util.Arrays;
import java.util.List;

public class PetStore {

    /*8 Pet objects with initial value
	Store them into a List<Pet>
	1, print out all info
	2, print out only name
	3, print out only cats */
    public static void main(String[] args) {
Pet p1=new Pet();
Pet p2=new Pet("cat","minnos");
Pet p3=new Pet("dog","Oliver");

        System.out.println(p1);
        p1.speak();
        System.out.println(p2);
        p2.speak();
Pet p4=new Pet("cat","minik");
Pet p5=new Pet("bird","Cikcik");
Pet p6=new Pet("ant","Atom");
Pet p7=new Pet("horse","Umut");
Pet p8=new Pet("cat","Boncuk");



        List<Pet> myPets= Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8);
        System.out.println(myPets);

        for (Pet each:myPets){
            System.out.println("each pet name is "+each.getName());
        }

        for (Pet each:myPets){
            if (each.getType().equalsIgnoreCase("cat")){
                System.out.println("Name of my cat is "+each.getName());
            }
        }
    }
}
