package interviewQuestionJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListRemove {
//Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        ArrayList<Integer> list2 = new ArrayList<>();

        for(int  each : list1) {

            if (each < 100) {

                list2.add(each);
            }
            //list1=list2;
        }
        System.out.println(list2);


        //way 2
        for (int i=0;i<list1.size();i++){
            if (list1.get(i)>100){
                list1.remove(list1.get(i));
                i--;//IMPORTANT PART!!!!
            }
        }
        System.out.println(list1);



        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        for (int i=0;i<names.size();i++){
            if (names.get(i).equals("Ahmed")){
                names.remove("Ahmed");
                i--;
            }
        }
        System.out.println(names);

        //way 2
        ArrayList<String> names1 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        names1.removeAll(Arrays.asList("Ahmed"));
        System.out.println(names1);

        //way3
        List<String> names2 =new  ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        ListIterator<String> iteration=names2.listIterator();
        if (iteration.hasNext() & iteration.next().equals("Ahmed")){
            iteration.remove();

        }
        System.out.println("names2  "+names2);




    }
}
