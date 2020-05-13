package day031;

public class Voting {
    public static void main(String[] args) {

        checkEligibility(51);//it s called caller!!
        checkEligibility(17);
        //Below code will do same thing as above !
        int yourAge=13;
        checkEligibility(yourAge);
    }

//below method contains one int parameter  named age
// when we call this method it is a must to provide a number data
// The method parameter can only be accessible within the method
//we can not use in the main method as the follow:
//System.out.print(age);

    public static void checkEligibility(int age){

        if (age>18){
            System.out.println("You are eligible to vote");
        }else{

            System.out.println("You are not eligible");
        }
    }

}
