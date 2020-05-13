package day060;
import java.io.FileNotFoundException;

public class DangerZoneAgain {

    //Handle or declare are the way to deal with checked exception
    //If we are sure the method will never throw the exception
    //It is good just to declare it
    //if there is actual ??????????
    public static void main(String[] args) throws InterruptedException{// FileNotFoundException

    try {
    readMyFile();
    }catch(FileNotFoundException e){

    System.out.println("Handle in here to move on");
}
       Thread.sleep(4000);//Thread class comes from Java.lang  package
        // it has sleep(x) method to wait to pause the program for x milliseconds
       //since we declare it compiler is happy


        System.out.println("It's the end");

    }

    //document the method to tell the caller, the file you are about to read
    //Handle the consequences
    //

    public static void readMyFile() throws FileNotFoundException{//we declare  FileNotFoundException object

        System.out.println("Reading the file in my computer ");

        throw new FileNotFoundException("File is not here");
    }
}
