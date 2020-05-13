package day031;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println("LET US USE WHILE");
        usingWhile();
        System.out.println("LET USE CHARACTERS IN STAIR ORDER");
        charStairs();
        System.out.println("HELLO HELLO ");
        sayHello7Times();
    }

    public static void usingWhile(){
        int x=0;
        while(x<5){

            System.out.println("happy new day");
            ++x;
        }

    }

    public static void charStairs(){
        String  line="";

        for (char iChar='A';iChar<='Z'; iChar++){

            line+=iChar;
            System.out.println(line);
        }
    }

    public static void sayHello7Times(){
        System.out.println("Hello world line 1");
        System.out.println("Hello world line 2");
        System.out.println("Hello world line 3");
        //println says go to the next line
        System.out.print("Hello world line 4  ");// we put spaces before quotes to have gap
        System.out.print("Hello world line 5  ");
        //print says stay in the same line
        System.out.println("Hello world line 6");
        System.out.println("Hello world line 7");
    }
}
