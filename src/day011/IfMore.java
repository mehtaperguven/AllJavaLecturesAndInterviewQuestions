package day011;

public class IfMore {
    public static void main(String[] args) {


        String targetOption = "Ki" ;
        if (targetOption=="Bd"){

            System.out.println("You have turned on Bedroom light");
        }
        else if (targetOption=="Lr"){
        System.out.println("You have turned on Living room light ");
        }
        else if (targetOption=="Ki"){
            System.out.println("You have turned on Kitchen light");
        }
        else if (targetOption=="Ha"){
            System.out.println("You have turned on Hallway light");
        }
        else{
            System.out.println("All lights turned off!!!");
        }

    }


}
