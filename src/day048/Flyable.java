package day048;

public interface Flyable {

    //interface is abstract type like abstract class
    //no object can be produced from it
    //it provides guideline for implementing classes
    //it is like signing a contract

    public static final boolean HAVE_WING=true;

    //no constructor

    public abstract void fly();
}
