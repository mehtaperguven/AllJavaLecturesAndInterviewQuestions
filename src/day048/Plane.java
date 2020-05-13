package day048;
//we build relationship between class and interface
//using implements keyword
//Like extends between sub class and super class
//it will build IS-A Relationship
//we can say plane IS-A Flyable||Inheritance
//since we inheriting an abstract method
//we need to provide body on overriding


public class Plane implements Flyable {
    String name;
    int capacity;
    int speed;

    @Override
    public void fly(){
        System.out.println("Plane is flying");
    }

    public static void main(String[] args) {

        Plane p1=new Plane();
        p1.fly();

        System.out.println(Flyable.HAVE_WING);

    }
}
