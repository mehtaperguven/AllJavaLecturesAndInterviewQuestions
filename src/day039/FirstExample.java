package day039;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstExample {
    public static void main(String[] args) {

        /*
        * Create an ArrayList of String to store 12 elements.
Each element should contains product information separated by comma  : at index 0 -->> iPhone 6s, 499 , 18.71 and so on
Task 1 : print only items name
Task 2 : print all the prices more than 500
Task 3 : print average price
Task 4 : print all the items name that has less than 20$ monthly payment.
Task 5 : Print the monthly payments of all the iPhone no matter what model.
Task 6 : Print all information about most expensive items.
Task 7 : Update Dyson price to 80% off (Monthly payment should also be calculated accordingly)
Task 8 : Count the items prices more than average price.
OPTIONALLY :
Task 9 : Remove all the items has more than average price.*/
        ArrayList<String> lst=new ArrayList<>(Arrays.asList("iPhone 6s, 499 , 18.71 "));
        String itemDetails = "iPhone 6s,449,18.71";
        String[] itemSplitArr = itemDetails.split(",");

        String name = itemSplitArr[0];
        System.out.println("name = " + name);

        double price = Double.parseDouble(itemSplitArr[1]);
        System.out.println("price = " + price);

        double monthly = Double.parseDouble(itemSplitArr[2]);
        System.out.println("monthly = " + monthly);


        System.out.println("item name = " + itemDetails.split(",")[0]);
        System.out.println("item price = " + Double.parseDouble(itemDetails.split(",")[1]));
        System.out.println("item monthly = " + Double.parseDouble(itemDetails.split(",")[2]));
//Task 4 : print all the items name that has less than 20$ monthly payment.




    }


}
