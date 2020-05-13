package day063;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class ReadingFilePractice {
    public static void main(String[] args) throws IOException {

        List<String> allData= Files.readAllLines(Paths.get("src/day063/employeeData.txt"));
        Map<Integer,String> idNamePair=new HashMap<>();
   // allData.forEach(each-> System.out.println("eachLine= "+each));

        //same with the above LAMBDA expression
    for(String eachLine:allData){
        
        //System.out.println("Each LinE= "+eachLine);

        int id=Integer.parseInt(eachLine.split(",")[0]);
        String name=eachLine.split(",")[1];
        idNamePair.put(id,name);

    }
        System.out.println("idNamePair = " + idNamePair);
//        String line="1,Lilia";
//        int id=Integer.parseInt(line.split(",")[0]);
//        System.out.println(id);
//        String name=line.split(",")[1];
//       Map<Integer,String> idNamePair=new HashMap<>();
//
//         idNamePair.put(id,name);
//        System.out.println(idNamePair);

    }
}
