package day043;

public class PetStaticPractice {
    public static void main(String[] args) {

        String str=String.valueOf(10);
        //A class can have static method in the instance field
//we should make any method static
// when we do not have any object to call to work with it
        //Static method can not access anything non static
        Pet.showGeneralInfo();
       // Pet.getName(); does not work
        Pet p1=new Pet("cat","Cancan");
        System.out.println("p1 name = " + p1);
        p1.speak();
    }
}
