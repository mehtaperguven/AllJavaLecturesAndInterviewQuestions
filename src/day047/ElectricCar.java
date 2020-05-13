package day047;

public class ElectricCar extends Car {//before putting override method below
    //it is giving compiler error
    int batteryLevel;

    @Override
    public void start() {
        System.out.println("This is how electric car start");
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
        System.out.println("turning "+direction);;
    }

    public static void main(String[] args) {
        ElectricCar e1=new ElectricCar();
        e1.start();
    }
}
