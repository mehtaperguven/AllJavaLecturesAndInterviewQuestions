package day056;

public class Singleton {

    /*Sometime we want to make a class that
    * only generate single object throughout the entire application
    *This is a design pattern called SINGLETON
    This allows to restrict the class to have only one object
    * ////add private static field with same type "Singleton"
    * ////add private constructor
    * ////add public method with return type Singleton

     */

    private static Singleton instance;

    private Singleton(){//constructor no one can access
    System.out.println("NO arg constructor being called");
}

    public static Singleton getInstance(){
    if (instance==null){
        instance=new Singleton();
    }else{
        System.out.println("we already have this object");
    }

    return instance;
}


}
class Test{
    public static void main(String[] args) {
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        //Singleton s3=new Singleton();
        // will not work since it is private constructor
        Singleton s3=Singleton.getInstance();
        Singleton s4=Singleton.getInstance();
        System.out.println(s1==s2);
        System.out.println(s2==s4);
        System.out.println(s1==s3);


    }





}
