package day034;

public class MethodReturnImportantPoints {
    public static void main(String[] args) {
        printName("Erva");
        //print only prints on the console
        // to use the result we need return number!!
        //we use methods with return to use values or to store values!!

        //in the main METHOD there is "String[] args" as a parameter!!
        //main is to execute to run the code
        //if no main we can not implement our code yet
        //public--access modifier
        //static--no object to call
        //
        //void--does not return anything, return type
        //String name:--method parameter
        //"Erva" is actual data that we passed

        //"Erva" is called ARGUMENT
        //
    }public static void printName(String name){
        System.out.println("your name is "+name);
    }
}
