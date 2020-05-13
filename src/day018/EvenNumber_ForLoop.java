package day018;

public class EvenNumber_ForLoop {
    public static void main(String[] args) {

        // skip counting by 2
        //from 0 till 100

        for(int i=0; i<=100;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();

        //skip by three
        for(int i=0; i<100; i+=3){
            System.out.print(i+" ");
        }
        System.out.println();

        //backward from 99 till 3 decrease by 3
        for(int i=99; i>0; i-=3){

            System.out.print(i+" ");
        }
        System.out.println();

        //print even number

        for(int i=0; i<100; i++){

            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        //***********************************
        //*****************************************
        //SHORTCUT WAY write fori and press enter it gives below line!!!!
        //for (int i = 0; i < ; i++) {

        System.out.println();
        for (int i = 0; i <100 ; i++) {
            if (i%5==0 && i%3==0){

                System.out.println(i+" is Fizz Buzz Number");
            }

        }
        ////you can do same thing with the for loop and while loop!!!!
        }

    }
