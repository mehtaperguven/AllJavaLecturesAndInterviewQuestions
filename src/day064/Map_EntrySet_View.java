package day064;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_EntrySet_View {
    public static void main(String[] args) {
        Map<String,Double> groceryPriceMap=new HashMap<>();

        groceryPriceMap.put("Tomato",1.99);
        groceryPriceMap.put("Potato",2.99);
        groceryPriceMap.put("Grape",3.99);
        groceryPriceMap.put("Banana",1.99);
        groceryPriceMap.put("Apple",1.89);

   //Map is not iterable
        //to iterate onMap we should get something iterable like Set
        //Map store key-Value pair as Entry
        //entrySEt() method is use to to get Entries out
        //So we can modify them
        Set<Map.Entry<String,Double>> entryView=groceryPriceMap.entrySet();
        //Interview QUESTION HOW DO YOU ITERATE ON A MAP???
        //WE CAN NOT ITERATE OVER MAP
        //We use Map.Entry
        //Map.Entry is an object type as well.

        //Map.Entry helps to use getKey), getValue(), setValue()
        for (Map.Entry<String,Double> each:entryView){
            //System.out.println(each);
            //System.out.println(each.getKey());
            //System.out.println(each.getValue());
            if (each.getKey().length()==5){
                System.out.println(each.setValue(5.0));
            }
        }
        System.out.println(entryView);

    }
}
