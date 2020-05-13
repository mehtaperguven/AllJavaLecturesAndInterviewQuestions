package day064;

import java.util.*;

public class MapPracticeWithList {


    public static void main(String[] args) {

        // What if we want to have multiple value for one key ??
        // for example groupCode (bugHunter) -- group member names (abc, efg , htj , knl)
        // String  and  List<String>
        // key data type is String , value data type is List<String>



        Map<String, List<String>> groupMap= new HashMap<>();
        groupMap.put("PowerOf4" , Arrays.asList("Furkan","Daria","Serife","Muge")  );
        groupMap.put("Achievers" , Arrays.asList("Maiia", "Anastasia", "Zaki", "Toyly", "Like")  );
        groupMap.put("BugHunter" , Arrays.asList("Ayse","Rabiyam","Gulcicek")  );
        groupMap.put("BugBusters", Arrays.asList("Rukhshona","Fariza","Seyma","Sumeyyra","Huvayda"));
groupMap.forEach((groupCode, allMembers)-> System.out.println("groupCode = "+groupCode+"\n\t members : "+ allMembers));

        System.out.println("In the groupMap for the key Achievers we finds third index=>> \n"+groupMap.get("Achievers").get(3));

        System.out.println(groupMap.get("BugHunter").contains("Gulcicek"));
groupMap.put("Justice League",new ArrayList<>(Arrays.asList("Superman","Batman","WonderWoman")));
//we produce new ArrayList Object to be able to work on it
groupMap.get("Justice League").add("Hero");
//groupMap.get("Achievers").add("Merve");//   will not work!!!!

// the key for the Map should be a type Immutable

        System.out.println(groupMap);

    }
}
