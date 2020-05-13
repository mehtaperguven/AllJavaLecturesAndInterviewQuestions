package day029;

import java.util.Arrays;

public class ILoveJava {
    public static void main(String[] args) {

        //an array with size 300 and fill it up with I Love Java

    String array[]=new String[300];
    //below it will be filled by null since it is string
        System.out.println("before filling array "+Arrays.toString(array));
    //array[0]="1.I love Java";
    //array[1]="2.I love Java";
    //array[299]="300.I love Java"

    for (int i=0;i<array.length;i++){

        array[i]=(i+1)+". I love Java";
    }
        System.out.println(Arrays.toString(array));

    String str=new String("ABC");// it is STRING OBJECT with value ABC

    String [] strArray=new String[5];//it is empty string array with size 5

    for (int i=0;i<strArray.length;i++){
        strArray[i]="I love Java";
    }
        System.out.println(Arrays.toString(strArray));

    }
}
