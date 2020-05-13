package day063;
import java.util.*;

public class MapGrocery {

    public static void main(String[] args) {
// add 7 items :
// try to add duplicate keys and see
// try to use putIfAbsent
// print them out in one shot
// Observe if there is any predictable order
// get the 3rd item value and print
// double the price of the first and last item
// try to remove tomato
// OPTIONALLY : USING THE PREVIOUS CLASS STRING
// TRY TO GET A charFrequencyMap
// your map should store character and it's frequency
//  AAABBCDDDD  -->> {'A'=3 , 'B'=2 , 'C'=1 ,'D'=4 ,  }
        Map<String,Double> unitPricePair=new HashMap<>();
        unitPricePair.put("Banana",0.5);
        unitPricePair.put("Orange",2.5);
        unitPricePair.put("Spinach",2.4);
        unitPricePair.put("Cheese",4.9);
        unitPricePair.put("Milk",2.3);
        unitPricePair.put("Spinach",2.4);
        unitPricePair.put("Carrot",2.5);


        System.out.println(unitPricePair);
        System.out.println(unitPricePair.get("Spinach"));
        System.out.println("********"+unitPricePair.putIfAbsent("Banana",0.5));
        System.out.println("_____"+unitPricePair.containsKey("Banana"));
        System.out.println("unitPricePair.get(\"Spinach\")= "+unitPricePair.get("Spinach"));


        System.out.println(unitPricePair.replace("Banana",0.5,2*0.5));
        //System.out.println(unitPricePair.replace("Carrot",2.5,2*2.5));
        double newPrice=unitPricePair.get("Carrot")+1;
        System.out.println("(((((((((((" +newPrice);
        System.out.println(unitPricePair.replace("Carrot",newPrice));


        System.out.println("After doubling first and last items "+unitPricePair);

if (unitPricePair.containsKey("Banana")){
    unitPricePair.remove("Banana");
    System.out.println("No more banana");
}
        //System.out.println(unitPricePair.remove("Carrot"));

        System.out.println("after removing carrot "+unitPricePair);
    }
}


