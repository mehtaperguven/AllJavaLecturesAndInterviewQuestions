package day062;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOfUniqueStates_Deleting {

    public static void main(String[] args) {

        Set<String> states=new HashSet<>();
        states.addAll(Arrays.asList("GA","GA","NY","CA","WA","NJ","CA","NJ","TX","TX","TX"));

        System.out.println("states before removing " + states);
        states.remove("GA");
        System.out.println("states after removing " + states);


//Iterator has three methods:
// hasNext(); next(); remove();
        Iterator<String >stIter= states.iterator();


        while (stIter.hasNext()){
            String  each=stIter.next();
            if (each.contains("A")){
                System.out.println("removing state that contains A = "+each);
                stIter.remove();
            }

        }
        System.out.println("States that contains \"A\" after removing next states left = "+states);



        //DO NOT CALL NEXT() METHOD TWICE WHILE ITERATING

//        while (stIter.hasNext()){
//            //String  each=stIter.next();
//            if (stIter.next().contains("A")){//WE CALLED FIRST TIME
//                System.out.println("removing state that contains A = "+stIter.next());//WE CALLED SECOND TIMES
//                stIter.remove();
//            }
//
//        }
        //if you try to get the next item that you do not have while you do  iteraton
        //You will get NoSuchElementException!!!! in Run Time ====with the above code as well
     //   System.out.println("States that contains \"A\" after removing next states left = "+states);



   //LAMBDA EXPRESSION

        states.removeIf(each->each.contains("N"));
        System.out.println("States after removing \"N\" = "+states);


    }
}
