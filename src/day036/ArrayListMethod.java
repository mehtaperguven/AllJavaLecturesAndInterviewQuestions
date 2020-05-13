package day036;

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {


        //Perform ArrayList object of Long and assign it to a Variable
        ArrayList<Long> lst=new ArrayList<>();
        //add item, insert item, read item, update, remove the item,check the location
        //C.R.U.D.
        //Create, Read, Update, Delete
        //we use ADD Method to add item
        lst.add(12L);
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);
       // lst.add(null);
        System.out.println(lst);


        //Counting inside ArrayList
        System.out.println("Counting items using lst.size()  :  "+lst.size());

        //Getting items inside ArrayList

        System.out.println("first item is = "+lst.get(0));
        System.out.println("second item is = "+lst.get(1));

        for (int i=0; i<lst.size();i++){
            System.out.println("item "+(i+1)+" is = "+ lst.get(i));
        }
        //GET THE SUM OF ABOVE ARRAYLIST ITEMS
        long sum=0;
        for (int i=0;i<lst.size();i++){
            sum=sum+lst.get(i);

        }
        System.out.println(sum);

//find max value

        long max=lst.get(0);
        for (int i=0;i<lst.size();i++){
            if (max<lst.get(i)){
                max=lst.get(i);
            }
        }
        System.out.println("max is "+max);

        //let us insert 125L between 100 Land 150L
lst.add(2,125L);
        System.out.println("New List is = "+lst);
        System.out.println(lst.get(3));


        //UPDATING VALUE AT CERTAIN INDEX: SET METHOD

        lst.set(3,195L);//we replaced 150 by 195
        System.out.println("New value of lst.get(3) is = "+lst.get(3));
        System.out.println(lst);

        lst.remove(100L);//we remove object 100L
        System.out.println("After removing 100 = \n\t"+lst);
        lst.remove(2);//we used index to remove
        System.out.println("lst after removing the item at index 2 = \n\t" + lst);

    //LOOKING FOR LOCATION OF CERTAIN ITEM
        System.out.println("Location of 125 using lst.indexOf(100L) "+lst.indexOf(125L));
        System.out.println("Location of 70L using lst.indexOf(70L) "+lst.indexOf(70L));
        // gives -1 since we do not have this element

        //CHECKING WHETHER A LIST IS EMPTY OR NOT

        System.out.println("\nlst.isEmpty() = "+lst.isEmpty());
        System.out.println("lst.size()>0 "+(lst.size()>0));

        //DELETING INSIDE ARRAYLIST
       // lst.clear();// we deleted all elements
        System.out.println(lst);//[]
        System.out.println(lst.size());//0
        System.out.println(lst.isEmpty());//true

        //CONTAINS METHOD

        System.out.println("\nlst.contains(100L)  " +lst.contains(100L));


    //use indexOf method to find if we have item or not// if no returns -1!!!!!
        System.out.println("Is there 10L in the array "+lst.indexOf(10L));

    }
}
