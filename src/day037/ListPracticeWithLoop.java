package day037;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeWithLoop {
    public static void main(String[] args) {

        /*
        * Perform ArrayList of Integer fill it up 1-100
        /
         */
        List<Integer>nums=new ArrayList<>();
        for (int i=1;i<=100;i++){

            nums.add(i);
        }
        System.out.println(nums);
        //change all the odd number value to 0
        for (int i=0;i<nums.size();i=i+2){
            nums.set(i,0);//number at even index are odd
        }
        System.out.println(nums);

//how to find index of value 20
        System.out.println("index of 20                       "+ nums.indexOf(20));

        //insert 100 to the first index
        nums.set(0,100);
        System.out.println(nums);

        System.out.println("index of 20 after set of 100 "+nums.indexOf(20));

        nums.add(0,100);
        System.out.println("index of 20 after add of 100 "+nums.indexOf(20));

        List<Integer>lst2=new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);
        System.out.println(lst2);
        //insert 100 after 34 //we do not know index of 34
       int ind= lst2.indexOf(34);
       lst2.add(ind+1,100);
        System.out.println(lst2);

        //add five 100 in front of 44
for(int i=0;i<5;i++){
        lst2.add(lst2.indexOf(44),100);
        }

System.out.println("lst2 is "+lst2);



    }
}
