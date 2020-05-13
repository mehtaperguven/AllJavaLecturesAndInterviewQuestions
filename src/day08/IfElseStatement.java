package day08;

public class IfElseStatement {
    public static void main(String[] args) {

        int speedLimit= 60;
        int yourCurrentSpeed=50;
        boolean iAmSpeeding= (yourCurrentSpeed>speedLimit);
        //if(true) can be written
        //if(yourCurrentSpeed>speedLimit)
        //if(iAmSpeeding)
        //all the above statements are possible to write in if parentheses


        if (iAmSpeeding){

            System.out.println("your current speed  is more than speed limit ");
            System.out.println("you should go to court");
        }
        else{
            System.out.println("go shopping!!!!");
            System.out.println("Buy  Ice cream!!!!");

        }
        System.out.println("THE END");
    }
}
