package day04.src.day06;

public class Remainder {
    public static void main(String[] args) {
        System.out.println(5/2);// it gives only 2 as integer
        System.out.println(5.0/2); //it gives 2.5
        System.out.println(5.0/2f);
        // using remainder

        System.out.println(5%2);
        System.out.println("The remainder is "+ 5%2);
        System.out.println(99%10);
        System.out.println("The remainder is "+99%10);
        System.out.println(100%10);



        //int minutes=135;
       // System.out.println("Please enter minutes as whole number ");
        //System.out.println(" you have "+ minutes+ " minutes" + "  it is "+(minutes/60)+"  hour and "+ (minutes%60) +"  minutes");

        int newMinutes=135;
        int hourPart=135/60;
        int remainderMinute=135%60;
        System.out.println("The minutes  "+ newMinutes+ "  is"
        +hourPart+ "hours and  "+remainderMinute +"  minutes");



    }
}
