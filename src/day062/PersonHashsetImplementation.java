package day062;


import day051.Person;

import java.util.SortedSet;
import java.util.TreeSet;

public class PersonHashsetImplementation {

    public static void main(String[] args) {
        //use hash


        SortedSet<PersonHashSet> myNames=new TreeSet<>();
        
        myNames.add(new PersonHashSet("Mehtap",43));
        myNames.add(new PersonHashSet("Mehtap",52));
        myNames.add(new PersonHashSet("Mehtap",13));
for (PersonHashSet each: myNames) {
    System.out.println("each = " + each);
}
    }
}
