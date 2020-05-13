package day011;
import java.util.Scanner;
public class SwitchWithScanner {

        public static void main(String[] args) {
            /*Create class called WarmUp1_LightOnOff
Create a variable  targetOption as String and assign one of below options  for example bd
You have 4 switches in your home to turn on
	  Bd — bedroom
      Lr  — living room
	  ki  — kitchen
      Ha— Hallway
Use switch statement to write a program to print which room light is turned on
For example if Bd was targetOption
	then print  you have turned on bedroom light */
            Scanner scan = new Scanner(System.in);
            String targetOption;
            System.out.println("What light would you like to turn on?");
            targetOption = scan.next();
            switch(targetOption){
                case "Br":
                    System.out.println("Bedroom Light is now on!");
                    break;
                case "Lr":
                    System.out.println("Living room light is on!");
                    break;
                case "Ki":
                    System.out.println("Kitchen light is on!");
                    break;
                case "Ha":
                    System.out.println("Hallway light is on!");
                    break;
                default:
                    System.out.println("Invalid selection, no lights have changed.");
            }
        }
    }








