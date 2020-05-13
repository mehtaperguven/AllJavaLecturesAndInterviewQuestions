package day063;

import java.util.ArrayList;
import java.util.*;
public class ListToMapPractice {
    public static void main(String[] args) {

        /*
        * Bekir Inalhan
        * Firdevs Oren
        * Mehmet Bereket
        * Mehtap Erguven
        * Nurjamal Crutchfield
        * Omer Seker
        * Omer solak
        * Selen Ucar
        * Sema Engin
        * Suzan Cure
        * Halis Can
        * Huseyin Gokmen
        * Muharramjon Shakirova
        * Navid Hoomanrad
        * */

        List<String> names=new ArrayList<>();
        names.add("Bekir Inalhan");
        names.add("Firdevs Oren");
        names.add("Mehmet Bereket");
        names.add("Mehtap Erguven");
        names.add("Nurjamal Crutchfield");
        names.add("Omer Seker");
        names.add("Omer Solak");
        names.add("Selen Ucar");
        names.add("Sema Engin");
        names.add("Suzan Cure");
        names.add("Halis Can");
        names.add("Huseyin Gokmen");
        names.add("Muharramjon Shakirova");
        names.add("Navid Hoomanrad");

        Map<String, Integer> nameCharCountPair=new HashMap<>();
        for (String each: names){
            nameCharCountPair.put(each,each.length());

        }

        System.out.println(nameCharCountPair);

    }
}
