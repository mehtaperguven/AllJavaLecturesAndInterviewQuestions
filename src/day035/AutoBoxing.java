package day035;

public class AutoBoxing {
    public static void main(String[] args) {

        Integer i1=new Integer(12);
        Integer i2=12;// int 12 is auto boxed to Integer i2
        int i3=i1;//Integer i1 is auto-unboxed to int i3

        Double d1=3.14;//double 3.14 is auto-boxed  to Double d1
        double d2=d1;//Double d1 is auto-unboxed to double d2

        Integer num1=100;// auto boxing 100;
        int num2=Integer.valueOf("200");//auto-unboxing into 200

        int num3=Integer.parseInt("200");
        /*
        * Integer.parseInt("number")
        * it return an int value converted from String
        *
        * Integer.valueOf("number")
        * it return an Integer Object by wrapping up the number
        *
        * we may use auto boxing or auto-unboxing
        * */

        String caseNumber="IPR2012-00001";

        System.out.println(getYearOutOfTheCaseNumber("DER2019-00034"));
        System.out.println(getYearOutOfTheCaseNumber("CBM2001-10133"));
        System.out.println(getYearOutOfTheCaseNumber("IPR2004-10178"));

    }public static int getYearOutOfTheCaseNumber(String caseNumber){
int year;
       // String strYear=caseNumber.substring(3,7);
       // year=Integer.parseInt(strYear);
       // return year;
        return Integer.parseInt(caseNumber.substring(3,7));//in one step we do same thing


    //Character.isLetter('A')
        //Character.isDigit()?????
        //
        }
}
