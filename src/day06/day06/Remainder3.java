package day06.day06;

public class Remainder3 {
    public static void main(String[] args) {
        int bankBalance=1130;
        System.out.println("My balance is  :"+ bankBalance );
        bankBalance/=2;
        System.out.println("now my balance is "+bankBalance);

        //bankBalance=bankBalance%500;
        bankBalance%=500;
        System.out.println("I wanna divide balance by 500 and keep the remainder in my pocket");
        System.out.println("the remainder is : "+bankBalance);

    }
}
