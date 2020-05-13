package day064;

import java.util.*;

public class MapKeySetView {
    public static void main(String[] args) {

        //MAP=====>>>>>KeySet-values View pair
        Map<String, Double> groceryPriceMap=new HashMap<>();

        groceryPriceMap.put("Tomato",1.99);
        groceryPriceMap.put("Potato",2.99);
        groceryPriceMap.put("Grape",3.99);
        groceryPriceMap.put("Banana",1.99);
        groceryPriceMap.put("Apple",1.89);
        System.out.println(groceryPriceMap);
//How do I store only keys ????
        //We will use Set since keys are unique
        //We can use keySet() method of Map to get Set of Keys!!!!!

        Set<String> allNames=groceryPriceMap.keySet();
//        System.out.println("allNames "+allNames);
//        allNames.remove("Tomato");//we removed Tomato
        System.out.println("After removing Tomato "+allNames);
        System.out.println("groceryPriceMap "+ groceryPriceMap);
        //In line 23, Since we removed Tomato from the keys
        //It would be deleted from the original groceryPriceMap as well
//to avoid this case we produced namesCopy which is copy of only keySet values
        //and we worked on this namesCopy
        // any changes would not be affect the original groceryPriceMap pairs

        Set<String>namesCopy=new HashSet<>(allNames);
        System.out.println(namesCopy);
        namesCopy.remove("Tomato");
        System.out.println(namesCopy);
        System.out.println(groceryPriceMap);
    }
}
