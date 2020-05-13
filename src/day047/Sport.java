package day047;

public class Sport {
    //public class Sport  extends String{}
    //will give compile error since String does not have any sub class

    public void doSomething(){
        System.out.println("doing regular sport");
    }

//    public final void doSomething(){
//        System.out.println("doing regular sport");
//    }
    //if we add final word to the method we block certain method
    //i can not have access using super() keyword from subclass ExtremeSport

    public void doSomethingElse(){
        System.out.println("Doing something else");
    }

}
