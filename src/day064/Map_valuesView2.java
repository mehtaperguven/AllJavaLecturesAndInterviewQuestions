package day064;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map_valuesView2 {
    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap=new HashMap<>();

        groceryPriceMap.put("Tomato",1.99);
        groceryPriceMap.put("Potato",2.99);
        groceryPriceMap.put("Grape",3.99);
        groceryPriceMap.put("Banana",1.99);
        groceryPriceMap.put("Apple",1.89);

        System.out.println("groceryPriceMap = "+groceryPriceMap);
        Collection<Double> allPrices=groceryPriceMap.values();
/////way1
        allPrices.removeIf(eachPrice->eachPrice>3);//lambda expression
        System.out.println("groceryPriceMap = "+groceryPriceMap);
////way2
        Iterator<Double> iter=allPrices.iterator();
        while(iter.hasNext()){
            if (iter.next()>3){
                iter.remove();
            }
        }
        System.out.println(allPrices);


    }
}
