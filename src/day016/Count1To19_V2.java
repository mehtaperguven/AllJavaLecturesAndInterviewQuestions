package day016;

public class Count1To19_V2 {
    public static void main(String[] args) {


        int counter = 1;
        while (counter <=10) {
            System.out.println(++counter);// it will prints 2..3..4..5....10..11
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");

        int counter1 = 0;
        while (counter1 <=10) {
            System.out.println(++counter1);// it will prints  1.. 2..3..4..5....10..11
        }
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        int counter2 = 0;
        while (counter2 <10) {
            System.out.println(++counter2);// it will prints  1.. 2..3..4..5....10
        }
        System.out.println("*********************");
        int counter22 = 1;
        while (counter22 <=10) {
            System.out.println(counter22++);// it will prints  1.. 2..3..4..5....10
        }

        int counter3 = 0;
        while (++counter3 <=10) {
            System.out.println(counter3);// it will prints  1.. 2..3..4..5....10
        }
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        int counterr=1;
        while(counterr++ <10){

            System.out.println(counterr);
        }
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        int counterrr=1;
        while(++counterrr <10){

            System.out.println(counterrr);
        }



    }
}