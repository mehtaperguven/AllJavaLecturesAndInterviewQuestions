package day050;

import java.util.Arrays;
import java.util.List;

public class Car {
    String brand;
    Engine e;
    //Engine type comes from Engine Class
    //I want car object has passenger names attached to it
    //String[] names;//WAY1 IS GIVEN HERE

    List<String> passengers;//way two is by List


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", e=" + e +
                //"passengers "+ Arrays.toString(names)
                "passengers "+ passengers+
                '}';
    }

    public static void main(String[] args) {

        Car c1=new Car();
        c1.brand="Toyota";
        c1.e=new Engine("V6",270);
       // c1.names=new String[]{"Mehtap","Erva","Dilara"};

        c1.passengers=Arrays.asList("Ali","Akbar","Kuzzat");
        System.out.println("c1 = " + c1);
        Car c2=new Car();
        c2.brand=new String("Toyota");


    }
}
