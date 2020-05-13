package day034;

public class MathActionFromJDK {
    public static void main(String[] args) {
        String str="Hello";
        //where does String class comes from?
        //from package called java.lang
        //it is special package java.lang!!!
        //any class inside the java.lang we do not import
        //for instance String class we do not import it
//if we want to import String Class
        //import java.lang.String

        //Math class we can use it directly like String class!!!!
        
        System.out.println(Math.asin(1));
        
        int sum=Math.addExact(50,80);
        System.out.println("sum = " + sum);

        int max=Math.max(7,9);
        System.out.println("max is "+max);
    }
}
