package day04.src.day05;

        import java.util.Scanner;

public class InteractiveTemperatureConverter {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println(" What is the temperature in F ?");
        double fahrenheit1= scan.nextDouble();
        double celsius= (5.0/9)*(fahrenheit1-32) ;// 5.0 is important
        System.out.println("Today is so cold in Texas." +"\n"
                +"it is  " + fahrenheit1 + "  Fahrenheit "+ " which is  " +celsius+"  in celsius" );

    }
}
