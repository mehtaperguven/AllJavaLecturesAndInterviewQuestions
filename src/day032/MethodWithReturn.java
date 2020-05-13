package day032;

public class MethodWithReturn {
    public static void main(String[] args) {
//void does not return the value
        String name=giveMeMyName();
        System.out.println("name is "+name);
        System.out.println("My name is "+giveMeMyName());
       int doubledNumber=doubleTheNumber(50);
        System.out.println("doubled Number is  = " + doubledNumber);
        System.out.println(doubleTheNumber(51));
        int sum=add2Numbers(34,90);
        System.out.println("sum is "+sum);
        System.out.println(add2Numbers(34,90));

    }

    public static String giveMeMyName(){
        return" Mehtap";
    }
    public static int doubleTheNumber(int num) {
        System.out.println("I am going to double the value of " + num);
        int result = num * 2;
        return result;

    }
    public static int add2Numbers(int num1,int num2){
        int sum=num1+num2;
        return sum;
    }
}
