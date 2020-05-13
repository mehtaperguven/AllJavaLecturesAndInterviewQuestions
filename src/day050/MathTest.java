package day050;

import java.sql.ClientInfoStatus;
import java.util.Arrays;
import java.util.List;

public class MathTest {
    public static void main(String[] args) {

        Addition a1=new Addition(10,90);
        System.out.println(a1);
        a1.calculate();
        System.out.println(a1);

        Subtraction s1=new Subtraction(90,40);

        System.out.println(s1);//before calculation
        s1.calculate();
        System.out.println(s1);

        Subtraction s2=new Subtraction(80,200);

        System.out.println(s2);//before doing calculation
        s2.calculate();
        System.out.println(s2);

        Multiplication m1=new Multiplication(70,90);
        System.out.println(m1);
        m1.calculate();
        System.out.println(m1);

        Division d1=new Division(80,70);
        System.out.println(d1);
        d1.calculate();
        System.out.println(d1);

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
        List<Question> allTestQuestions= Arrays.asList(a1,s1,s2,m1 ,d1);
        for (Question each: allTestQuestions){
            System.out.println(each);
        }

    }

}
