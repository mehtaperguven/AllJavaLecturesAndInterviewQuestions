package day026;

import java.util.Arrays;

public class ReverseArrayBySwapping {
    public static void main(String[] args) {
//let us swap numbers to reverse array!!!!!
        int myNumbers[]=new int[]{5,3,21,2,1,13,};
        int size=myNumbers.length;
        int lastIndex=size-1;
        System.out.println(Arrays.toString(myNumbers));
    //we print first and last members
        System.out.println(myNumbers[0]+"------"+myNumbers[lastIndex-0]);
    //we print second and 1 before the last element
        System.out.println(myNumbers[1]+"------"+myNumbers[lastIndex-1]);
        System.out.println(myNumbers[2]+"------"+myNumbers[lastIndex-2]);

        System.out.println("by looooooopppppppp");
        //int myNumbers[]=new int[]{5,3,21,2,1,13,8};
int middleIndex=size/2;
        for (int i=0;i<middleIndex;i++){

            System.out.println(myNumbers[i]+"------"+myNumbers[lastIndex-i]);

            int temp=myNumbers[i];
            myNumbers[i]=myNumbers[lastIndex-i];
            myNumbers[lastIndex-i]=temp;

        }

        System.out.println(Arrays.toString(myNumbers));


    }
}
