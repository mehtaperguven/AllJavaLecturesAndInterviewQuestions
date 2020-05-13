package day039;

public class Garage {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.year=2020;
        car1.color="White";
        car1.model="4 Runner";
        car1.make="Toyota";
        car1.goForward();

        System.out.println("car1 make "+car1.make);
        System.out.println("car1 year "+car1.year);

        System.out.println("--------------");
        Car car2=new Car();
        car2.year=2017;
        System.out.println("car2.year = " + car2.year);
        car2.make="BMW";
        System.out.println("car2.make = " + car2.make);

        car2.year=2019;
        System.out.println("After changing year = " + car2.year);
car2.goForward();
        car2.color=car1.color;//it means car2.colo2="White";
car2.printCarAge();//we call method which we prepare inside Car Class
//int age=2020-car2.year;
car2.changeColor("Blue");//we changed color
        System.out.println("car2.color = " + car2.color);
    }
}
