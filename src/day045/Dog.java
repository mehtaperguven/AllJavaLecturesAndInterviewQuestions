package day045;

public class Dog extends Animal{

    @Override//below speak method override from Super(parent) class
    public void speak(){
        super.speak();//child calls super class' speak() method
     System.out.println("Bark!!");
     super.speak();//we can use super....as many as we want
     super.speak();
 }

    public static void main(String[] args) {

        Dog twix=new Dog();
        twix.speak();
    }

}
