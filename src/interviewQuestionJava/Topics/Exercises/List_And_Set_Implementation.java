package interviewQuestionJava.Topics.Exercises;

import java.util.*;

public class List_And_Set_Implementation {

    public static void main(String[] args) {
//generating list
    List<String> list=new ArrayList<>();
    list.add("ABC");
    list.add("BEC");

        System.out.println(list);
    List<String> list1=new ArrayList<>();

    list1.addAll(list);
        System.out.println(list1);
        list1.add("BGT");
        System.out.println(list1);

        list1.remove(2);
        System.out.println("we removed second index"+list1);
        list1.remove("ABC");
         System.out.println(list1);

    List<Integer> lst=new LinkedList<>();
    ArrayList<Integer> ints=new ArrayList<>(Arrays.asList(4,9,7,2,0));
        System.out.println(ints);

        Set<String> set1=new LinkedHashSet<>(Arrays.asList("Michail","Muge","Mehtap","Muge"));
        System.out.println("set1 "+set1);

        Set<String> set2=new HashSet<>(Arrays.asList("Michail","Muge","Mehtap","Muge"));
        System.out.println("set2 "+set2);

        Set<String> set3=new TreeSet<>(Arrays.asList("Aichail","Buge","Cehtap","Buge"));
        System.out.println("set3 "+ set3);



//Interview Question:: Do both strings have same letters or  not ???
//way1==use Set<>;

        String s1="ABCCDDDD"; String s2="KBBBCAD";

        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();

        Set<Character> ss1=new TreeSet<>();
        for (Character each:arr1){
            ss1.add(each);
        }
        System.out.println(ss1);
        Set<Character>  ss2=new TreeSet<>();
        for (Character each:arr2){
            ss2.add(each);
        }
        System.out.println(ss2);

        System.out.println(ss1.equals(ss2));

//way2==Array.sort();//if two strings are equal or not?? if two words are equal or not?
        String str1="ABBCD"; String str2="BCDA";
        String [] string1=str1.split("");
        String [] string2=str2.split("");


        Arrays.sort(string1);
        Arrays.sort(string2);
        String result1=""; String result2="";
        for (int i=0;i<string1.length;i++){
            result1+=string1[i];
        }
        System.out.println(result1);
        for (int i=0;i<string2.length;i++){
            result2+=string2[i];
        }
        System.out.println(result2);


        System.out.println(result1.equals(result2));

//Interview Question::Remove Duplicate letters
 String string4="AADEEEC";
 char [] c1=string4.toCharArray();

    Set<Character> set4=new TreeSet<Character>();

    for (Character each:c1){
        set4.add(each);
    }

        System.out.println("set4 "+ set4);

//Interview Question::Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 //way1 use remove method
//
        List<Integer> integers=new ArrayList<>(Arrays.asList(2,5,80,90,101,109));
        System.out.println(integers);

        for (int i=0;i<integers.size();i++){
            if (integers.get(i)>100){
                integers.remove(integers.get(i));
                i--;////Be careful in here!!!!!
            }
        }
        System.out.println(integers);
 //way2 use add to remove numbers greater than 100
        List<Integer> integers1=new ArrayList<>(Arrays.asList(2,5,180,90,101,109));
        List<Integer> integers2=new ArrayList<>();

        for (Integer each:integers1){
            if (each<100){
                integers2.add(each);
            }
        }
        System.out.println(integers2);

/////Another way to remove duplicate characters

        String name = "aaabbbccffff";
        String [] s5  = name.split("");
        System.out.println(Arrays.toString(s5));

        Set<String> nonDup = new TreeSet<>(Arrays.asList(s5));

        System.out.println("nonDup "+nonDup);
//////////////////////////////

    }
}
