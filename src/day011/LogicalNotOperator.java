package day011;

public class LogicalNotOperator {
    public static void main(String[] args) {
        //LOGICAL NOT OPERATOR ! EXCLAMATION MARK
        //It is used to negate the boolean value

        System.out.println(true);
        System.out.println(false);
        System.out.println("Result of ! true-->");
        System.out.println(!true);
        System.out.println("Result of ! false-->");
        System.out.println(!false);

        boolean isRecording=false;
        System.out.println("Result of isRecording is "+isRecording);
        System.out.println("Result of ! isRecording-->");
        System.out.println(!isRecording);
        System.out.println("*********************");
        //we can use ! Exclamation mark in front of boolean expression
        //boolean expression is any expression that result in a boolean value
        //for example 7>5, x>10, y==20, x<=100, x>y, x>10&& x<100

        System.out.println("Result of !(7>5) is ");
        System.out.println(!(7>5));

        int x=7;
        System.out.println("Result of x >10 ");
        System.out.println(x>10);
        System.out.println("Result of !(x>10) ");
        System.out.println(!(x>10));
        //!(x>10)--> means x<=10

    }




}
