package day060;

import java.util.*;

public class IteratingAnyCollection {


    public static void main(String[] args) {

        Collection<Integer> nums=new ArrayList<>(Arrays.asList(10,4,5,22,88,13));
        System.out.println(nums);

        //iterating over a Collection object using iterator
        //The best way to remove object while iterating over Collection
        //Using the ....iterator...instead of for loop or foreach loop
        Iterator<Integer> myIter=nums.iterator();
        //System.out.println(nums);
            while(myIter.hasNext()){

                if (myIter.next()<=10){
                    myIter.remove();
                }
            }



        System.out.println("myIter.hasNext() = " + myIter.hasNext());
        //hasNext() shows do we have any thing next or not as true or false
        System.out.println(nums);
//        System.out.println("myIter.next() = "+myIter.next());//directly shows the elements in order in myIter ...>>>10
//        System.out.println("myIter.next() = " + myIter.next());//shows next element....4
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        myIter.remove();//remove whatever is the iterator pointing at this location
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println(nums);//we removed and represent in here
        System.out.println("myIter.hasNext() element?? "+myIter.hasNext());
    }
}
