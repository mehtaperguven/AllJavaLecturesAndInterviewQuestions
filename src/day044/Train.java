package day044;

public class Train  extends Vehicle{
//    String make;
//    int year;
//
//
//    public void start(){
//        System.out.println("starting "+make);
//    }
//    public void goForward(){
//        System.out.println(make+" is going forward");
//    }

//WE HAVE ACCESS ALL THE ABOVE CODE WITHOUT WRITING ,
// FROM PARENT (SUPER CLASS) VEHICLE
int wagonCount;

public void makeChoChoSound(){
    System.out.println("Chooooo Chooooo");
}

    public static void main(String[] args) {
     //when we produce an object
        // we can call methods and fields/instance variables

    Train t1=new Train();
    t1.makeChoChoSound();
    //following attributes called from Parent Vehicle
    t1.make="Thomas";
    //t1.year=1999;//it does not work since we made year private!!

        t1.setYear(1999);
        System.out.println(t1.getYear());

    //calling the method from Vehicle
        t1.start();
        t1.goForward();
    }

}
