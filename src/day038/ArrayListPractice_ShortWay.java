package day038;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice_ShortWay {

    public static void main(String[] args) {


        List<Double> prices= Arrays.asList(9.99,5.55,3.76,8.99,0.99,65.67);
        //when we use Arrays.asList():
        // prices.add(12.8);NOT POSSIBLE
        //prices.remove(0);NOT POSSIBLE
        //prices is not resizable!!!!

        int count=0;
        for (Double each:prices){
            if (each>5){
                count++;
            }
        }
        System.out.println("count = " + count);

        ArrayList<Double> copyPrice=new ArrayList<>(prices);
        copyPrice.add(199.99);
        copyPrice.add(0.99);
        copyPrice.remove(4);//we can use index or number by remove()
        copyPrice.remove(8.99);//if we have more equal objects it will remove the first object
        System.out.println(copyPrice);

        //WE CAN PRODUCE ARRAYLIST  OBJECT IN ONE SHOT BELOW
        //WE CAN ADD OR REMOVE ITEMS!!!!
        //WE CAN MODIFY OUR LIST
        ArrayList<Double> oneShotPrice= new ArrayList<>(Arrays.asList(9.99,5.55,3.76,8.9));
        System.out.println("first "+oneShotPrice);
oneShotPrice.add(56.9);
        System.out.println("before "+oneShotPrice);
oneShotPrice.add(1,100.99);
        System.out.println("after adding "+oneShotPrice);
oneShotPrice.remove(2);
        System.out.println("after removing "+oneShotPrice);
    }
}
