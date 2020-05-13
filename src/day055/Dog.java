package day055;

public class Dog {
    String type;

    public Dog(String type1){

        this.type=type1;
    }
    public void bark(){
        System.out.println(type+ " Dog is barking");
    }
}
