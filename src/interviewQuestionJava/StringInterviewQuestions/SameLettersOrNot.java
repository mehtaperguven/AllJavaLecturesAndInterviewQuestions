package interviewQuestionJava.StringInterviewQuestions;

import java.util.*;

public class SameLettersOrNot {

    public static void main(String[] args) {


        System.out.println(sameLettersAssertion("bbc","bcb"));
        System.out.println(isSameLetter("abd","dab"));
    }


    public static boolean sameLettersAssertion(String str1, String str2){

        String [] arr1=str1.split("");
        String[] arr2=str2.split("");

        Set<String> setOfArr1=new TreeSet<>();
        Set<String> setOfArr2=new TreeSet<>();
        for (String each:arr1){
            setOfArr1.add(each);
        }

        for (String each:arr2){
            setOfArr2.add(each);
        }
        System.out.println(setOfArr1);
        System.out.println(setOfArr2);
        return  setOfArr1.equals(setOfArr2);

    }

    public static boolean isSameLetter(String string1, String string2){
        char [] c1=string1.toCharArray();
        char [] c2=string2.toCharArray();
        String str1="",str2="";
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i=0;i<c1.length;i++){
            str1+=c1[i]+" ";
        }
        for (int i=0;i<c2.length;i++){
            str2+=c2[i]+" ";
        }
        System.out.println(str1);
        System.out.println(str2);

        return str1.equals(str2);
    }


}
