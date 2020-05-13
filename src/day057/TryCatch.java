package day057;

public class TryCatch {
    public static void main(String[] args) {

       //int num1=10/0;


        System.out.println("Before try catch");
        try {//we protect inside try block
            System.out.println("in try block");
            int result = 10 / 0;
            System.out.println("10/0 does not allow to print me");

        }catch(ArithmeticException e){

            System.out.println("ArithmeticException happened, and handled");
        }
        System.out.println("After try catch");
        System.out.println("!!!!!!!!!!!!!!!!!!");
        try {

            System.out.println("In second Try block");
            String str = "java is fun";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(30));
            System.out.println(str.charAt(1));
       }catch(Exception e){//e is only Exception type variable

            System.out.println("Exception happened  in tyr-catch block and caught");
        }
        System.out.println("finished");



    }


    }

