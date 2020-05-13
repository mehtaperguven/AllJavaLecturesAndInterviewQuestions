package day051;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonComparing {
    public static void main(String[] args) {
        Person p1=new Person("Aysel",50);
        p1.toString();
        System.out.println(p1);
        Person p2=new Person("Gulser",48);
        System.out.println(p2);
        int age1=p1.age;
        int age2=p2.age;
        //how can we compare two person with each other
        //Compare two person by age
        if (age1>age2){
            System.out.println(1);
        }else if(age1==age2){
            System.out.println(0);
        }else{
            System.out.println(-1);
        }

        System.out.println(p1.compareTo1(p1,p2));
        System.out.println(p1.compareTo(p2));
        Person p3=new Person("Cicek",1);
        System.out.println(p1.compareTo(p3));
        System.out.println(p1.compareTo1(p1,p3));
        int result=p2.compareTo(p3);
        System.out.println( "result =" +result);

    //List<Person> lst=Arrays.asList(p1,p2,p3);
        //or long way
        List<Person>lst=new ArrayList<>();
        lst.add(p1);
        lst.add(p2);
        lst.add(p3);
        lst.add(new Person("Derya",12));
        System.out.println("lst = "+lst);
        Collections.sort(lst);//ANY THING WE SORT SHOULD BE COMPARABLE TYPE
        //IN THE Comparable<Person> was!!!!!!
        System.out.println(lst);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        List<Integer> lstInt=Arrays.asList(4,1,8);
        Collections.sort(lstInt);
        System.out.println(lstInt);

        Collections.sort(lst);
        System.out.println(lst);

        System.out.println('a' > 'c');//prints false
        System.out.println('z' > 'c');//prints true



    }
}
