package day058;



import java.util.*;
public class OutOfMemoryDemo {

    public static void main(String[] args) {

       // int n="abcsd";



        List<Integer> nums=new ArrayList<>();//new Object is in the Heap
        for(int i=1;i>0;i++){//infinite loop
           // System.out.println(i);
            nums.add(i);
        }
    }
}
//ERROR
// OutOfMemoryError  happens when heap memory is full
//if we keep producing objects ,
// or if have one object that is very large