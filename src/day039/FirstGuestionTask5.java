package day039;

import org.w3c.dom.ls.LSOutput;

import java.awt.font.FontRenderContext;
import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.Arrays;

public class FirstGuestionTask5 {
    public static void main(String[] args) {
        ArrayList<String> productLst
                = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mouse,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18")
        );


//
//        Task 8 : Count the items prices more than average price.

        for (int i = 0; i < productLst.size(); i++) {
            String name = productLst.get(i).split(",")[0];
            double monthly = Double.parseDouble(productLst.get(i).split(",")[2]);
            if (name.contains("iPhone")) {
                System.out.println(name + " " + monthly);
            }
        }
        // Task 6 : Print all information about most expensive items.
        double max = 0.0;
        String maxPriceItem = "";
        for (String each : productLst) {
            double price = Double.parseDouble(each.split(",")[1]);
            if (max < price) {
                max = price;
                maxPriceItem = each;
            }
        }
        System.out.println(maxPriceItem + " " + max);
        System.out.println("Max price's item index " + productLst.indexOf(maxPriceItem));

        //  Task 7 : Update Dyson price to 80% off (Monthly payment should also be calculated accordingly)

        int dysonIndex = 0;
        for (int i = 0; i < productLst.size(); i++) {

            if (productLst.get(i).startsWith("Dyson")) {
                dysonIndex = i;
            }
        }
        System.out.println("dyson index " + dysonIndex);
        String dysonInformation = productLst.get(dysonIndex);
        System.out.println("Before updating " + dysonInformation);
        String name = dysonInformation.split(",")[0];
        double price = Double.parseDouble(dysonInformation.split(",")[1]);
        double monthly = Double.parseDouble(dysonInformation.split(",")[2]);
        //WE DECREASED 80% PRICE AND MONTHLY
        dysonInformation = name + ", " + price * 0.2 + ", " + monthly * 0.2;
        productLst.set(dysonIndex, dysonInformation);
        System.out.println("After updating " + dysonInformation);

        // Task 8 : Count the items prices more than average price.
        //first print average
        System.out.println();
        double sum = 0;
        double average = 0;
        for (String each : productLst) {
            double price1 = Double.parseDouble(each.split(",")[1]);
            sum += price1;
        }
        average = sum / productLst.size();
        System.out.println("average = " + average);
        int count = 0;
        for (String each : productLst) {
            double price1 = Double.parseDouble(each.split(",")[1]);

            if (price1 > average) {
                count++;
                System.out.println(each);
            }
        }
        System.out.println("items count that price more than average is = " + count);
        //task 9
        //Task 9 : Remove all the items with prices more than average price.
        for (int i = 0; i < productLst.size(); i++) {
            double price1 = Double.parseDouble(productLst.get(i).split(",")[1]);
            if (price1 > average) {
                productLst.remove(i);
                --i;
            }
        }
        System.out.println("productLst count  after removing = " + productLst.size());

//task 10
        System.out.println("\n-----------Task 3 ArrayList Objects ----------");
        System.out.println("\n-----------Task Three ArrayList Objects ----------");
//         * ------------------------
//         * Create 3 more ArrayList objects to separately store
//         *  itemNames(String), prices(Double) , monthlyPayments(Double)  :

        ArrayList<String>itemNames=new ArrayList<>();
        ArrayList<Double>prices=new ArrayList<>();
        ArrayList<Double>monthlyPayment= new ArrayList<>();


        String item1="iPhone 6s,449,18.71";

        for (String each:productLst){
        itemNames.add(each.split(",")[0]);

        double pricePart=Double.parseDouble(each.split(",")[1]);
        prices.add(pricePart);

        double monthlyPart=Double.parseDouble(each.split(",")[2]);
         monthlyPayment.add(monthlyPart);
        }
        System.out.println("itemNames " +itemNames);
        System.out.println("prices "+prices);
        System.out.println("monthly payments "+monthlyPayment);
    }

}