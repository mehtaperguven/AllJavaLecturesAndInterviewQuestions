package day05;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class ScannerPractice_NextBoolean {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);// producing scanner object
        System.out.println("Are you recording ? ");
        boolean isRecording=input.nextBoolean();
        System.out.println("We are recording  "+isRecording);


    }
}
