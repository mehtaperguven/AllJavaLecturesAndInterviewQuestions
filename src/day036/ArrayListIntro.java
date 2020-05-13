package day036;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIntro {
    public static void main(String[] args) {
        //How do we perform ArrayList object //<> Diamond OPERATOR
        ArrayList<String> lst1=new ArrayList<>();//can be written as ..>> new ArrayList<String>();
        //we can not store primitive int below!!!!
      //  ArrayList<int> lst2=new ArrayList<>();
        //we use Wrapper Class Type to store number in ArrayList<>;
        ArrayList<Integer> lst2=new ArrayList<>();// new ArrayList<Integer>();
        ArrayList<Boolean> lst3=new ArrayList<>();// new ArrayList<Boolean>();
        ArrayList<Long> lst4=new ArrayList<>();// new ArrayList<Long>();
        ArrayList<Double> lst5= new ArrayList<>();// new ArrayList<Double>();
//optionally we can use following way
        //we can say that ArrayList is one type of List!!!!
        List<String> myList=new ArrayList<>();
    }
}
