package day011;

public class WarmUp1_LightOnOff {

    public static void main(String[] args) {


        String targetOption = "Bd";


        // In Switch we can use only
        // byte,short, int, char, String
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


        switch (targetOption) {
            case "Bd":

                System.out.println("You have turned on bedroom light ");

                break;
            case "Lr":
                System.out.println("You have turned on living room light ");

                break;
            case "ki":
                System.out.println("You have turned on kitchen light ");
                break;
            case "Ha":
                System.out.println("You have turned on Hallway light ");

                break;
            default:
                System.out.println("All lights are turned off!!!");

        }
    }
}