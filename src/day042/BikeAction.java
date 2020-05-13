package day042;

public class BikeAction {
    public static void main(String[] args) {

        Bike b1=new Bike();
        Bike b2=new Bike();
        //we performed objects above
        //when we run the above code
        //it prints "message from constructor" twice
        //I do not want empty gear when object is performed
        //I want to the bike come with gear set to 1
        //to do this we wrote under Bike custom class
       // only gear=1; as shown below:::::::
        //public Bike(){
        //    System.out.println("message from constructor");
        //    gear=1;
        //WE HAVE CONSTRUCTORS BELOW
        //WHEN WE INITIALIZE THE OBJECT TO HAVE INITIAL VALUES
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
        System.out.println("b1 gear: "+b1.gear);
        System.out.println("b2 gear: "+b2.gear);
//I want to be able to set the default gear to
        //any number I specify when object is performed
        Bike b3=new Bike(4);
        System.out.println("b3.gear "+b3.gear);

        //I want a Bike object with speed and gear

        Bike b4=new Bike(3,50);
        System.out.println("b4.gear = " + b4.gear);

        System.out.println("b4.speed = " + b4.speed);

        Bike b5=new Bike("mehtap");

    }
}
