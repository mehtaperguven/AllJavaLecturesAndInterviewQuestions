package day062;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StringWithSet {
    public static void main(String[] args) {
        
        Set<String> states=new HashSet<>();
        states.add("VI");
        states.add("VI");
        states.add("TX");
        states.add("LA");
        states.add("NJ");
        states.add("NY");
        states.add("NY");
        states.add("GA");
        states.add("TX");
        System.out.println("states = " + states);

        System.out.println("states.size() is "+states.size());
//WAY1 FOREACH LOOP FOR ITERATION
        for (String each: states) {
            System.out.println("each= "+each);

        }
//WAY2 LAMBDA EXPRESSION
      states.forEach(each ->System.out.println("each is: " +each));//LAMBDA EXPRESSION

        // FOR LOOP DOES NOT WORK SINCE INDEX DOES NOT USED IN SET
        System.out.println("###############################");


//WAY3 USING ITERATOR FOR ITERATION


        Iterator<String> nameOfStates= states.iterator();//it iterates// travels // moves  the Collection object elements one by one
        //10....13....7....9
        System.out.println("boolean   "+nameOfStates.hasNext());
        while(nameOfStates.hasNext()){
            System.out.println("strIter.next() = " + nameOfStates.next());
        }

//me>>>>.....<<<<<<<VI>>>>>....VI....??????TX
    }
}
