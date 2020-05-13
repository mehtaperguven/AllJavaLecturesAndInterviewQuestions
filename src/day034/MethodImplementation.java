package day034;
import day031.Calculator;
import java.util.Arrays;

public class MethodImplementation {

    public static void main(String[] args) {
//double shift opens search for the classes and methods
        //to call a method from other class we use following way
        //className.methodName
    int result1=PracticeMethodWithNumbers.build3DigitNumber(5,9,2);
        System.out.println("result1= "+result1);

    int result2=PracticeMethodWithNumbers.build3DigitNumber(90,4,9);
        System.out.println("result2 = " + result2);
//to use Array CLASS
//which comes from java.util  package!!!
// we must import java.util.Arrays;
//to call static method of Array class:
//ClassName.methodName(......)
//Arrays.toString(nums)      //Arrays is our class toString is our method
    int[]nums={2,5,87};
        System.out.println("Arrays.toString(nums) = "+ Arrays.toString(nums));


        //if we would like to call method from OTHER PACKAGE
        //we need to import the class from the package
        //**************import day31.Calculator***********
        //to call static method of Calculator Class
        //Calculator.methodName(.....)
        Calculator.operations("product",8,9);
        //*******when you click on method name operations**************
        //*******ctrl+shift+i shows inside of the method!!!!!!!********
    }

}
