package day031;

public class MethodIntro {
    public static void main(String[] args) {
//two ways to call static methods,
// we can call static method of other class
        //1.ClassName.methodName(external data if needed)
        //if you are in same class:
        //you can directly call them
        //2.methodName(external data if needed)
//below two codes doing same thing
//MethodIntro.sayHello();//if you are in same class using MethodIntro is optional
//sayHello();
        System.out.println("%%%%%%%%%%Begin%%%%%%%");
        sayHello();
        System.out.println("------------");
        MethodIntro.sayHello();
        System.out.println("THE end");
        //13..>>>14..>>(30,31,32)....>>15..16...>>(30,31,32)..>>17..DONE!!
//sayHello() works like a link!!

        System.out.println("new method starts here");
        helloSevenLines();



    }//main METHOD ENDS HERE!!!!

    //DO NOT perform  a method inside THE MAIN METHOD
    // i do not need object therefore I use static
    //void means nothing
    //method must be inside the class!!!!
//up or down does not matter
    //Java starts with first line of main method!!!!
        public static void sayHello(){
        System.out.println("Hello World");
        System.out.println("My name is Juma");
        System.out.println("I love java");

        //EHY DO WE NEED METHOD
            //TO REPEAT REUSE SAME CODE BLOCK
            //WE SHOULD NOT REPEAT BY WRITING
            // AGAIN AND AGAIN SAME BUNCH OF CODE!!


    }

    public static void helloSevenLines(){

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

//We have three methods above,
// main method(),sayHello(),helloSevenLines()

    //DO NOT PERFORM A METHOD INSIDE ANOTHER METHOD!!!!
}
