package day047;
//Produce another subclass of Car called GasCar
// add a field called gasLevel
// implement all the abstract method of Car class
//Create GasCar object here
// call all the methods to test
public class GasCar extends Car {
    public int gasLevel;

    @Override
    public void start() {
        System.out.println("start to proceed");

    }

    @Override
    public void goForward() {
        System.out.println("Go forward");
    }

    @Override
    public void goBackward() {
        System.out.println("Go backward");
    }

    @Override
    public void turn(String direction) {
        System.out.println("Turn to "+direction);
    }

    @Override
    public String toString() {
        return "GasCar{" +
                "gasLevel=" + gasLevel +
                ", year=" + year +
                ", brand='" + brand + '\'' +
                '}';
    }

    public static void main(String[] args) {
        GasCar g1=new GasCar();
        System.out.println(g1);
        g1.start();
        g1.goBackward();
        g1.goForward();
        g1.turn("LEFT");
        g1.gasLevel=35;
        System.out.println(g1);



    }
}
