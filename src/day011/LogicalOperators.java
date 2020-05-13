package day011;


public class LogicalOperators {

    public static void main(String[] args) {
        //LOGICAL AND OPERATOR is represented by "&&"
        //in math 60<x<100
        //in Java x>60 && x<100
        //&& double AMPERSAND AND
        /*          true    true
        *int x=70; x>60 && x<100; true
        *           false   true
        * int x=10; x>60 && x<100; false
        *           true    false
        * int x=110; x>60 && x<100; false
        *           true    true
        * int x=95; x>60 && x<100; true
        *password checking
        //when username and password
        // is right at the same time you can log in
         */

        //LOGICAL OR OPERATOR represented by "||"
        //double pipe is ||
        /*        true    false
        int x=70; x>10 || x<5......>true
                  false  false
        int x=7;  x>10 || x<5......>false
                  true    false
        int x=17; x>10 || x<5......>true
                  false   true
        int x=-8; x>10 || x<5......>true

         */
        System.out.println("TRUTH TABLE of AND && ");
        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&true);
        System.out.println(false&&false);

        System.out.println("TRUTH TABLE of LOGICAL AND && ");
        System.out.println("Result of TRUE && TRUE is "+(true&&true));
        System.out.println("Result of TRUE && FALSE is "+(true&&false));
        System.out.println("Result of FALSE && TRUE is "+(false&&true));
        System.out.println("Result of FALSE && FALSE is "+(false&&false));
        System.out.println("TRUTH TABLE of OR || ");
        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||true);
        System.out.println(false||false);
        System.out.println("TRUTH TABLE of LOGICAL OR ||");
        System.out.println("Result of TRUE && TRUE is "+(true||true));
        System.out.println("Result of TRUE && FALSE is "+(true||false));
        System.out.println("Result of FALSE && TRUE is "+(false||true));
        System.out.println("Result of FALSE && FALSE is "+(false||false));

        // VARIABLE CALLED num with type int
        //find out whether this number is more than 100 or less then 10
        int num=40;
        System.out.println("is the num "+num+" is <10 or >100");
        System.out.println(num<10||num>100);
        System.out.println("is the number "+num+ "in the range of 10 and 60");
        System.out.println(num>10 && num<60);
        System.out.println("********************");
        //MORE THAN TWO CONDITIONS
        System.out.println(true||false||false);
        System.out.println(true&&true&&false);
        System.out.println("********************");
        int x=55;
                        //   false||false|| true.....>true
        System.out.println(x==50|| x==51||x==55);

        //check x is more than 50 and x is not equal to 52 or x==57
                        // true &&true||false...> true||false...>true
        System.out.println("result of true&&true or false");
        System.out.println(x>50 && x!=52 || x==57);//...>true
        System.out.println("result of false && true or true");//..>true
        System.out.println(x<50 && x!=52 || x<=57);

    }
}

