package day039;

import java.util.ArrayList;
import java.util.Arrays;

public class UsingArrayListFirstTask {
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
        //we get name part by for each loop
for (String each:productLst){
    String name=each.split(",")[0];
    System.out.println("each "+name);
}
//we get name by for loop

        for (int i=0;i<productLst.size();i++){

            String name=productLst.get(i).split(",")[0];
            System.out.println("each product name = "+name);
        }
//we will print prices more than 500

        for (int i=0;i<productLst.size();i++){

            double price =Double.parseDouble(productLst.get(i).split(",")[1]);
            if (price>500) {
                System.out.println("price more than 500 "+price);
            }

        }
        //print average
        double sum=0;
        double average=0;
        for (String each:productLst){
            double price1=Double.parseDouble(each.split(",")[1]);
        sum+=price1;
        }
        average=sum/productLst.size();
        System.out.println("average = " + average);

        //Task 4 : print all the items name that has less than 20$ monthly payment.

 for (String each:productLst){
     String name=each.split(",")[0];
     double priceMonthly=Double.parseDouble(each.split(",")[2]);
     if (priceMonthly<20){
         System.out.println(name+"--monthly payment is--"+priceMonthly);
     }
 }
   //task 5 print the monthly payments of all iphone no matter model

        for (String each:productLst){
            String name=each.split(",")[0];
            double priceMonthly=Double.parseDouble(each.split(",")[2]);
            if (name.contains("iPhone")){
                System.out.println(name+" "+priceMonthly);
            }
        }

       for (int i=0;i<productLst.size();i++){
           String name=productLst.get(i).split(",")[0];
           double monthly=Double.parseDouble(productLst.get(i).split(",")[2]);
                if (name.contains("iPhone")){
          System.out.println(name+"  "+monthly);
      }

       }


    }
}
