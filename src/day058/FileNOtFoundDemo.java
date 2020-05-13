package day058;
import java.io.IOException;
import java.nio.*;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileNOtFoundDemo {
    public static void main(String[] args) {//throws Exception {
        System.out.println("Before try catch");
        //Files.readAllLines(Paths.get("file.txt"));
        //since we do not have this file gives error
//
        try {
            Files.readAllLines(Paths.get("file.txt"));
       }catch(IOException e){
            System.out.println(e);
            System.out.println("exception happened and caught");
        }
        System.out.println("After try catch my program will continue till the end");
    }
}
