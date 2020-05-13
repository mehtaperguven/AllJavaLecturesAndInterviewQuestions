package day037;

import java.awt.font.FontRenderContext;
import java.util.ArrayList;
import java.util.List;

public class TeamMatesContinued {
    public static void main(String[] args) {
        List<Double> priceList=new ArrayList<>();

        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);
        System.out.println("price list = "+priceList);
//change third member
        priceList.set(2,10.0);
        //add 4$ to the first item
       priceList.set(0,priceList.get(0)+4);
       //change last price to sum of first and second price

        priceList.set(priceList.size()-1,priceList.get(0)+priceList.get(1));
        System.out.println(priceList);

        //give 40% off the second price
        priceList.set(1,priceList.get(1)*0.6);
        System.out.println(priceList.get(1));
        System.out.println(priceList);
        //same result found below
        //priceList.set(1,(priceList.get(1)-priceList.get(1)*0.4));
       // System.out.println(priceList.get(1));

        //DOUBLE THE VALUE OF EACH PRICE IN THE LIST
        for (int i=0;i<priceList.size();i++){
           priceList.set(i,priceList.get(i)*2);

        }
        System.out.println(priceList);
        System.out.println();
        //we do same doubling one more time below
        for (int i=0; i<priceList.size();i++){
            double newValue=priceList.get(i)*2;
            priceList.set(i,newValue);
        }
        System.out.println("after doubling one more time = "+priceList);

        for (int i=0;i<priceList.size();i++){
            if (priceList.get(i)>20){
                double newPrice=priceList.get(i)/2;
                priceList.set(i,newPrice);
            }

        }
        System.out.println("price list after dividing into half " +priceList);

//swap first and last items

        double temp=priceList.get(0);
        priceList.set(0,priceList.get(priceList.size()-1));
        priceList.set(priceList.size()-1,temp);

        System.out.println("After swapping priceList "+priceList);
    }
}
