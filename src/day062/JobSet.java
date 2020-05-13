package day062;

import day061.Job;

import java.util.*;

public class JobSet {

    public static void main(String[] args) {
       // List<Job> mySet=new ArrayList<>();

        SortedSet<Job> mySet=new TreeSet<>();
        //TreeSet<> directly gives when we print in natural order
        //If we want to sort Jobs automatically in ascending (Natural) order
        //When we add Job object into the Collection object
        //We choose SortedSet to do this


        mySet.add(new Job("texas",100000,"NTT"));
        mySet.add(new Job("Huston",60000,"Costco"));
        mySet.add(new Job("Dallas",78000,"HomeDepot"));
        mySet.add(new Job("texas",690000,"Ikea"));////////////
        mySet.add(new Job("Fort Worth",130000,"CVS"));




//We have below Sorted set of Job with TreeSet implementation
//        mySet.add(new Job("texas",100000,"NTT"));
//        mySet.add(new Job("Huston",60000,"Costco"));
//        mySet.add(new Job("Dallas",78000,"HomeDepot"));
//        mySet.add(new Job("texas",60000,"Ikea"));////////////
//        mySet.add(new Job("Fort Worth",130000,"CVS"));


        for (Job each:mySet){
                System.out.println("each = " + each);

        }


        System.out.println(new String("Adam").hashCode());
        System.out.println(new String("Erva").hashCode());

        Set<String >names =new HashSet<>();

        names.add("Adam");
        names.add("Erva");
        for (String each:names) {
            System.out.println(each.hashCode());
        }

        

//        mySet.add(new Job("t",100000,"NTT"));
//        mySet.add(new Job("t",60000,"Costco"));
//        mySet.add(new Job("t",78000,"HomeDepot"));
//        mySet.add(new Job("t",90000,"Ikea"));
//        mySet.add(new Job("t",130000,"CVS"));

    }



}
