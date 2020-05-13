package day063;
import java.util.*;
public class MapAddingElements {
    public static void main(String[] args) {
//Map does not accept duplication
        Map<String,Integer> nameAgePair=new HashMap<>();
        nameAgePair.put("Erva",5);
        nameAgePair.put("Dilara",1);
        nameAgePair.put("Duru",5);
        nameAgePair.put("Feyza",19);
        nameAgePair.put("Feyza",4);//If we have duplication the old one is replaced with new one
        // lastly added object would be printed only

        System.out.println("nameAgePair  is "+nameAgePair);
//////SIZE() of the Map()
        System.out.println("nameAgePair.size() is "+nameAgePair.size());

        System.out.println("nameAgePair.get(\"Duru\") is "+ nameAgePair.get("Duru"));

        System.out.println(" Does Map<> contains Erva ? is = "+nameAgePair.containsKey("Erva"));
        System.out.println("Does Map<> contains Duru ? is = " +nameAgePair.containsKey("Duru"));

        System.out.println(nameAgePair.putIfAbsent("Duru",5));

//////////REPLACE
        nameAgePair.replace("Erva",10);//we replace  Erva's age by 10
        System.out.println(nameAgePair.get("Erva"));
        System.out.println(nameAgePair);

        nameAgePair.replace("Abcd",90);//since we do not have Abcd in the nameAgePair
        //Nothing happens!!!!!
        System.out.println(nameAgePair);

        nameAgePair.replace("Erva",10,95);
        //replece old age by new age if exist in the nameAgePair
        System.out.println(nameAgePair);
        System.out.println(nameAgePair.get("Erva"));


///////////REMOVE
        nameAgePair.remove("Erva");
        System.out.println(nameAgePair);
        System.out.println(nameAgePair.get("Erva"));//gives null since we removed Erva
        System.out.println(nameAgePair.containsKey("Erva"));//gives false since nameAgePair does not contain Erva now

    }
}
