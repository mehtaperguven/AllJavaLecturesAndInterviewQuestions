package day044;

public class Vehicle {
   //String make;//Thomas in sub class Train
   // int year;//it has no access modifier it is default not public
    //if we make it private int year;
    //we can not inherit year in child/sub class DIRECTLY
    //DEFAULT is accessible in SAME PACKAGE
    //DEFAULT is NOT accessible in DIFFERENT PACKAGE
    //public accessible anywhere
    //protected accessible in same package
    //PROTECTED accessible in subclass iN different package
    //PROTECTED NOT ACCESSIBLE only in UNRELATED CLASS under different package
    //ORDER:
   // private...default....protected....public
    protected String make;

private int year;//1999

    public void start(){
        System.out.println("starting "+make);
    }
    public void goForward(){
        System.out.println(make+" is going forward");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
