package day06.day06;

public class coinConverter {
    public static void main(String[] args) {
        // you have 200 cents
        // we spent 74 cents for candy
        //how many quarter you can get 25c
        //how many dime you can get 10c
        // how many nickel you can get 5c
        //how many penny you can get

        int cent=200;
        System.out.println("I have "+ cent +" cents");
        cent-=74; //gives 126 cent
        System.out.println("I used 74 cent to buy candy and "+ cent+" left");

        int quarter =cent/25; // 126 divided by 25 gives 5
        System.out.println( quarter +" quarter left" );

        int penny= cent%25; //126 divided by 25 gives remainder 1
        System.out.println("we have  "+ penny + " penny");

        int dime= cent/10; // 126 divided by 10 gives 12 as Nicel
        System.out.println("we have "+ dime +" dime");

        int penny2=cent%10;
        System.out.println("it left  "+ penny2 );






    }
}
