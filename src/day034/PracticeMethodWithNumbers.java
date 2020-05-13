package day034;

public class PracticeMethodWithNumbers {
    public static void main(String[] args) {

        int digit1, digit2, digit3;
        digit1 = 5;
        digit2 = 7;
        digit3 = 9;
int result1=build3DigitNumber(6, 14, 0);
        System.out.println("result1= "+result1);
int result2=build3DigitNumber(13,5,8);
        System.out.println("result2 = " + result2);
        System.out.println(result1+result2);
        //print only prints on the console
        // to use the result we need return number!!
        //we use methods with return to use values or to store values!!
    }
    /*write a method called build3DigitNumber
   it has 3 int parameters digit1 digit2 digit3
   and it will return the 3 digit numbers you have build
   if any of digit1 digit2 digit3 is not within the range of 0-9 the change it to 0 ,
   for example :
   build3DigitNumber(4,2,4) --->> 424
   build3DigitNumber(0,2,1) --->> 21
   build3DigitNumber(65,6,9) --->> 69*/

    public static int build3DigitNumber(int digit1, int digit2, int digit3) {

    if (!(digit1<=9&&digit1>0)){
          digit1=0;
      }
        if (!(digit2<=9&&digit2>0)){
            digit2=0;
        }
        if (!(digit3<=9&&digit3>0)){
            digit3=0;
        }
            int number = digit1 * 100 + digit2 * 10 + digit3;
            return number;



    }
}