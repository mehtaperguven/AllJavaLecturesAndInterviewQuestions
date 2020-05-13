package day038;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBulkOperation {
    public static void main(String[] args) {

        List<String>groceries= Arrays.asList("Eggs","Milk","Butter","Apple","Salmon");
        System.out.println("groceries = " + groceries);

        ArrayList<String> newList=new ArrayList<>(groceries);
        newList.add("Sugar");
        newList.add("Banana");
        System.out.println("newList = " + newList);

        //add Pasta, Asparagus, Spinach, Branzini as different list

        List<String> newItemsToAdd=Arrays.asList("Pasta","Asparagus","Spinach","Branzini");

        newList.addAll(newItemsToAdd);
        System.out.println(newList);




    }
}
