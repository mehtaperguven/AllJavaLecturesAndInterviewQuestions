package day060;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Throws_and_throw {
    public static void main(String[] args) {

readMyFile();


    }
public static void readMyFile(){


    System.out.println("Reading my file from the ..src/hero.txt.. file");

    try {
        List<String> allTxt = Files.readAllLines(Paths.get("src/day060/hero1.txt"));

        System.out.println(allTxt);

    }catch(IOException e) {

        System.out.println("we caught IOException");
    }
    }
//we made a File class which comes from java.nio.file package
    //It has a lot of file related utility
    //readAllLines static method is easiest way to read a text file (including cvs file)
    //it accepts a file path .....Paths.get("src/day060/hero.txt") and returns all lines as a List of String
    //readAllLines method declares to throw IOException
    //IOException is checked Exception and must be handled or declared!!!!
//FileNOtFoundException ....is ..sub class of IOException


}
