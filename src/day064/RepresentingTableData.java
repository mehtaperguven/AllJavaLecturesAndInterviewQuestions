package day064;

import java.util.*;

public class RepresentingTableData {
    public static void main(String[] args) {
        //for single row
        //i want to get the value by ir's column name
        //so I choose Map


        Map<String,String> row1=new LinkedHashMap<>();
        row1.put("First_Name","Regan");
        row1.put("email","rdhgh@djfdj.com");
        row1.put("Gender","Male");
        
        //for one row I used one Map
        //However I have many rows
        //List<SomeType>

        System.out.println("row1 "+row1);
        Map<String,String> row2=new LinkedHashMap<>();
        
        row2.put("First_Name","Carleen");
        row2.put("email","Carlengh@j.com");
        row2.put("Gender","Female");

        System.out.println("row2 "+row2);
        List<Map<String,String>> rowMapList=new ArrayList<>();
        rowMapList.add(row1);
        rowMapList.add(row2);

        System.out.println("rowMapList = " + rowMapList);

        System.out.println("email in the second second row "+ rowMapList.get(1).get("email"));

        rowMapList.get(0).replace("First_Name","Hulk");
        System.out.println("rowMapList = " + rowMapList);
        
        rowMapList.get(0).put("First_Name","Jon");
        System.out.println("rowMapList = " + rowMapList);
    
    
    
    }
}
