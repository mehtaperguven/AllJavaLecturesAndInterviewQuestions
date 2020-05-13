package day016;

import java.util.Scanner;

public class IndexOfWith2parameters {

    public static void main(String[] args) {
                   //012345678901234567890123456789012
        String name="I love Java I love Java Java Java";
        // get the second Java from the sentence
        //assume that there is 4 java words
        //second java means ...>> after the first java

        //first find location of first java
        //in order to find second java
        //instead of searching from the beginning
        //search from right after the location of found first java
        //it will give you index of second java

        //HOW DO I START FROM DIFFERENT INDEX
        System.out.println("Index of Java starting from 0 is "+name.indexOf("Java"));
        System.out.println("Index of Java starting from 7 is "+name.indexOf("Java",7));
        System.out.println("Index of Java starting from 8 is "+name.indexOf("Java",8));
        System.out.println("Index of Java starting from 9 is "+name.indexOf("Java",9));
        System.out.println("Index of Java starting from 19 is "+name.indexOf("Java",19));
        System.out.println("Index of Java starting from 20 is "+name.indexOf("Java",20));

// how do i start from the location that get past first java
//basically starting point different from 0 so that it get past first java

        int firstJavaLocation=name.indexOf("Java");//location of first java iis 7
    //starting point can be right after the index of first character of the word
    // which is here Java
        
        int startingPointToSearchSecondJava=firstJavaLocation+1;
        int secondJavaLocation=name.indexOf("Java", startingPointToSearchSecondJava+1);
        System.out.println("secondJavaLocation = " + secondJavaLocation);

        //I just want to print second word
        //which is between right after the first space and second space
        int firstSpaceLocation=name.indexOf(" ");
        int secondSpace=name.indexOf(" ",firstSpaceLocation+1); //it finds the location of second space 1 after first space location
        System.out.println("Second word in this sentence is "+ name.substring(firstSpaceLocation+1, secondSpace));
    }
}
