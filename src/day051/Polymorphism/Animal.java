package day051.Polymorphism;

public abstract class Animal {

    public abstract void makeNoise();
    //We can add more classes under one public class
    //It should not be public as below Dog class
} class Dog extends Animal{//new class not public
            @Override
            public void makeNoise(){
                System.out.println("WOOF");
            }

        }

        class Horse extends Animal{//new class not public{

            @Override
            public void makeNoise(){
                System.out.println("NEINEI");
            }
        }


