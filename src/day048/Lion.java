package day048;

public class Lion extends Mammals {
   //abstract Mammals is sub class of abstract super class Animal
   //lion is sub class of abstract Mammals
    //Lion inherits all abstract methods
   // from both abstract Mammals and abstract Animal


    @Override
    public void drinkMilk() {//comes from Mammals
        System.out.println("Lion drinks milk");
    }

    @Override
    public void makeNoise() {//comes from Animal
        System.out.println("Lion says RRAAAARR!!");
    }

    public static void main(String[] args) {
        Lion l1=new Lion();
        l1.drinkMilk();
        l1.makeNoise();

        //l1 is a container and
        //l1 can store any lion address



        //any class you created, it can be a data type for a variable
        //also known as a  reference variable
        System.out.println("***************************");
        Lion a1=new Lion();
        a1.drinkMilk();
        a1.makeNoise();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        Animal a2=new Lion();
        a2.makeNoise();




    }
}
