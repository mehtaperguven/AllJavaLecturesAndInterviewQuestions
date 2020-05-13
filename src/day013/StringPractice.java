package day013;

import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {
        int x=10;
        int y=13;
        Scanner scan=new Scanner(System.in);
        String str1=new String("abc");
        //s1 is reference it is container it is address of  OBJECT abc
        String str2="hello"; //"hello" part is called string literal
        //anything that not primitive is OBJECT
        //ALL OBJECTS ARE IN THE HEAP
        //"abc" and "hello" is in heap
        //scan, str1, str2 are remote controller,
        //scan,str1 ,str2 are placed in stack
        // they store the addresses of the objects in STACK

    }
}
