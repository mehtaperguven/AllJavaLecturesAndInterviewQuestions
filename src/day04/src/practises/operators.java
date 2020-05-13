package day04.src.practises;

public class operators {
    public static void main(String[] args) {


        int result = 1 + 2; // result is now 3
        System.out.println("result1 =   "+ result);

        result = result - 1; // result is now 2
        System.out.println("result2  =  "+result);

        result = result * 2; // result is now 4
        System.out.println("result3  =  " + result);

        result = result / 2; // result is now 2
        System.out.println(result); // we don't use quotation for numbers!

        result = result + 8; // result is now 10
        System.out.println(result);
        result = result % 7; // result is now 3
        System.out.println(result);
    }
}