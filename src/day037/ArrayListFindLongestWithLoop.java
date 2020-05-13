package day037;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFindLongestWithLoop {

    public static void main(String[] args) {

        List<String>nameList=new ArrayList<>();
        nameList.add("Erva");
        nameList.add("Feyza");
        nameList.add("Cabir");
        nameList.add("Kudret");
        nameList.add("Emir");
        nameList.add("Mehtap");
        nameList.add("Nursel");


        System.out.println(nameList);
//FIND THE LONGEST NAME
        String longestName=nameList.get(0);

        for (int i=0;i<nameList.size();i++){

            if (longestName.length()<nameList.get(i).length()){

                longestName=nameList.get(i);

            }
        }
        System.out.println("longest Name is "+longestName);
   //PRINT LONGEST NAMES
        System.out.println();
        for (int i=0;i<nameList.size();i++){
            if (nameList.get(i).length()==longestName.length()){

                System.out.print(nameList.get(i)+" ");
            }
        }
        System.out.println();
        //using for each loop print nameList
        for (String eachName:nameList){
            System.out.println(eachName);
        }
//find longest by foreach loop???


    //

    }
}
