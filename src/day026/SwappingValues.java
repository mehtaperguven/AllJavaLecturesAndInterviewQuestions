package day026;

import java.util.Arrays;

public class SwappingValues {

    public static void main(String[] args) {

        String name1="Mehtap";
        String name2="Feyza";

        name1=name2;
        name2=name1;
        System.out.println("name1 = " + name2);
        System.out.println("name2 = " + name1);
        //Above we can not swap!!!
        //to swap first and second name:
        String tempContainer=name1; ////mehttap
        name1=name2;//////name1=.....feyza
        name2=tempContainer;/////name2=......mehtap


        //let us swap first and last int items

        int myNumbers[]=new int[]{10,40,30,7};

        int temp=myNumbers[0];
        myNumbers[0]=myNumbers[3];
        myNumbers[3]=temp;
        System.out.println("first item = "+myNumbers[0]);
        System.out.println("last item = "+myNumbers[3]);

        System.out.println("myNumbers="+ Arrays.toString(myNumbers));

   int temp2=myNumbers[1];

   myNumbers[1]=myNumbers[2];
   myNumbers[2]=temp2;
        System.out.println("myNumbers  = " + Arrays.toString(myNumbers));


    }
}
