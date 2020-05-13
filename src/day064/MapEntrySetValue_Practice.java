package day064;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntrySetValue_Practice {
    public static void main(String[] args) {
        Map<String,String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene","Female");
        employeeMap.put("Winfred","Male");
        employeeMap.put("Jereme","Male");
        employeeMap.put("Glad","Female");
        employeeMap.put("Desirae","Female");
        employeeMap.put("Kakalina","Female");
        employeeMap.put("Bertrando","Male");
        employeeMap.put("Ajay","Female");
        employeeMap.put("Brigitte","Female");
        employeeMap.put("Derk","Male");
        employeeMap.put("Orlando","Male");
        employeeMap.put("Selle","Female");
        employeeMap.put("Marika","Female");
        employeeMap.put("Griffy","Male");
        employeeMap.put("Shanon","Female");
        employeeMap.put("Clerkclaude","Male");
        employeeMap.put("Rickard","Male");
        employeeMap.put("Job","Male");
        employeeMap.put("Aida","Female");
        employeeMap.put("Alonzo","Male");

        Set<Map.Entry<String,String>> entryPair=employeeMap.entrySet();

        for (Map.Entry<String,String> each:entryPair){
            if (each.getValue().equals("Female")){
                System.out.println(each.getKey());

            }
        }
        for (Map.Entry<String,String> each:entryPair){

            if (each.getValue().equals("Female")){
                each.setValue("Queen");
            }else{
                each.setValue("King");
            }

        }

        System.out.println(entryPair);




    }
}
