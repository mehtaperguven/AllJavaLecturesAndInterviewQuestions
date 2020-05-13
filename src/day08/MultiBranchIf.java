package day08;

public class MultiBranchIf {
    public static void main(String[] args) {

        int currentSpeed=65;
        if (currentSpeed>70){

            System.out.println("you are speeding more than 70 --POINTS TAKEN!!!");
            // ASKING is it less than or equal =< 70 and more than >60
        }
        else if (currentSpeed > 60){
            System.out.println("Your speed is more than 60 but less than or equal to 70  ");
        }
        else{
            System.out.println("KEEP DRIVING, YOU ARE GOOD");
        }

    }
}
