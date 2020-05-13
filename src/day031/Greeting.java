package day031;

public class Greeting {
    public static void main(String[] args) {
sayHello();
sayHelloTo("Batch15");
sayHelloTo("Kids");
sayHelloTo("Group Hard Worker");
//Above we call method with certain parameters
    }
    //task
    //perform a method that
    //say hello to the person's name when I call this method
    //strName is called method parameter!!!!
    //Below strName is defined as String

    public static void sayHelloTo(String strName){
        System.out.println("Hello "+strName);
    }
    public static void sayHello(){
        System.out.println("Hello Dear Friends");

    }
}
