package day037;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListParameter {
    public static void main(String[] args) {

        //perform a method that accept a list of String as argument
//same thing as a method that has list of String parameter
        //print out each item in the list vertically
        //return nothing
        List<String> nameList=new ArrayList<String>();
        nameList.add("Erva");
        nameList.add("Feyza");
        nameList.add("Cabir");
        nameList.add("Kudret");
        nameList.add("mehtab");
        System.out.println(nameList);
        printAList(nameList);
        String longestName=getLongestStringElement(nameList);
        System.out.println("Longest name is "+longestName);

        System.out.println(printLongestLengthAllNames(nameList));
}public static void printAList(List<String> lst){

        for (String each:lst){
            System.out.println("each = " + each);
        }
    }
    //print only the longest name
    public static String getLongestStringElement( List<String>nameList){


        String longest=nameList.get(0);
        for (int i=0;i<nameList.size();i++){
            if (longest.length()<=nameList.get(i).length()){
                longest=nameList.get(i);
            }
        }
        return longest;

    }
    //List all long names
    public static String printLongestLengthAllNames(List<String> list){
        String allLongs="";
        for (String each:list){
            if(each.length()==getLongestStringElement(list).length()){
                allLongs=allLongs+each+" ";
            }
        }
       return allLongs;
    }

}
