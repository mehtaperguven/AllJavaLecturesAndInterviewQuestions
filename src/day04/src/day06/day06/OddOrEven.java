package day04.src.day06.day06;

public class OddOrEven {
    public static void main(String[] args) {

        int myNumber=10;
        int yourNumber=11;

        System.out.println("myNumber Remainder of dividing by 2 = " +myNumber%2);
        System.out.println("yourNumber Remainder of dividing by 2 = " +yourNumber%2);
        System.out.println("adding my number to your number = "+ myNumber+yourNumber);
        // IT GIVES 1011!!! BE CAREFUL

        System.out.println("adding my number to your number = "+ (myNumber+yourNumber));
        // USING INSIDE () GIVES 21 AS THEIR NUMERICAL ADDITION!!!!!

    }
}
