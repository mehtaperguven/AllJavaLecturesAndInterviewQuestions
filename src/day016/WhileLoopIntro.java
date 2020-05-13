package day016;

public class WhileLoopIntro {

    public static void main(String[] args) {
        //print hello world 5 times
        //also keep the count of how many times you said hello world

      /*int x=0;
        while(x<5){
            System.out.println("Hello World");
             ++x;        }*/

      int count=0;
        System.out.println("Hello World");
        //count=count+1;
        ++count;
        System.out.println("Hello World");
        ++count;
        System.out.println("Hello World");
        ++count;
        System.out.println("Hello World");
        ++count;
        System.out.println("Hello World");
        ++count;
        System.out.println("count is : "+count);

        System.out.println("----------------------------------");
        //int cnt=1;
        //while (cnt<=5){

          // System.out.println("HELLO");
        // DO NOT WRITE ABOVE CODE IT WILL WRITE  INFINITE TIMES


        int cnt=1;
        while(cnt<= 5){

            System.out.println("Hello World");
            System.out.println("cnt value is : "+cnt);
            ++cnt;

        }
        //*************************************************************
        //**********WHAT DOES HAPPEN IN THE ABOVE LOOP*****************
       // first time in the loop : cnt=1
       //check this 1<=5...>>> true
        //print hello world
        //cnt value is : 1
        //increase the cnt value to 2

        // second  time in the loop : cnt=2
        //check this 2<=5...>>> true
        //print hello world
        //cnt value is : 2
        //increase the cnt value to 3

        // third times in the loop : cnt=3
        //check this 3<=5...>>> true
        //print hello world
        //cnt value is : 3
        //increase the cnt value to 4

        // fourth times in the loop : cnt=4
        //check this 4<=5...>>> true
        //print hello world
        //cnt value is : 4
        //increase the cnt value to 5

        // fifth times in the loop : cnt=5
        //check this 5<=5...>>> true
        //print hello world
        //cnt value is : 5
        //increase the cnt value to 6

        // sixth time in the loop : cnt=6
        //check this6<=5...>>> false
        //it will not continue to print since condition is false!!!!
        }
    }

