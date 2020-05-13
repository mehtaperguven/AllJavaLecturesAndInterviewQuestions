package day04.src.day06;

public class UsingTheValueOfOtherVariables {
    public static void main(String[] args) {

        int myFavoriteNumber = 300;
        int yourFavoriteNumber=myFavoriteNumber;
        System.out.println("My Favorite number is " +myFavoriteNumber+ "\n"+
                "Your favorite number is " +yourFavoriteNumber
        );

        yourFavoriteNumber=100;

        System.out.println("My Favorite number is " +myFavoriteNumber+ "\n"+
                "Your favorite number is " +yourFavoriteNumber);

                // new variable yourOrder, type is string, assign the value
                //second variable myOrder ,same as previous
                //same value as yourOrder


        String yourOrder = "Coffee please";
        String myOrder =yourOrder;
        System.out.println("Your order is " + yourOrder+ "\n"+
                "My order is " + myOrder);





    }
}
