package day032;

public class MethodWithReturnTypePractice {
    public static void main(String[] args) {
        System.out.println(divide(50, 2));
        double division=divide(90,180);
        System.out.println("division = " + division);
    }
//task produce a method called divide
    //it has 2 double parameters
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            double division = num1 / num2;
            return division;
        }
    }
}