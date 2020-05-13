package day047;

public class Garage {
    public static void main(String[] args) {
        ElectricCar e1=new ElectricCar();
        e1.start();
        e1.goForward();
        e1.goBackward();
        e1.turn("right");

        GasCar g1=new GasCar();
        System.out.println(g1);
        g1.start();
        g1.goBackward();
        g1.goForward();

    }
}
