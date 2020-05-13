package day026;

import java.util.Arrays;

public class StringSplitPractice {
    public static void main(String[] args) {
//let us spell the following names as
        //A-b-b-o-s-
        //Z-u-l-y-a-r-......

        String students="Abbos,Zulyar,Zhibek,Hasan,Olga,Susan";
        String namesArray[]=students.split(",");
        System.out.println(Arrays.toString(namesArray));
        System.out.println("FIRST WAY");

        String newSpelled="";

        for (int i=0; i<namesArray.length;i++) {
            String word = namesArray[i];
            for (int j=0;j<word.length();j++) {
                newSpelled += word.charAt(j) + "-";
            }
            System.out.println(newSpelled);
            newSpelled="";
        }

        System.out.println("SECOND WAY");
//SECOND WAY TO DO SAME THING not to have "-" symbol in the last
        String s="";
        for (int i=0; i<namesArray.length;i++) {

             String word = namesArray[i];

             for (int j=0;j<word.length()-1;j++) {
                // System.out.print(word.charAt(j) + "-");
               s +=word.charAt(j)+"-";
             }

            //System.out.println();
            System.out.println(s+word.charAt(word.length()-1));
            s="";
        }
        System.out.println("THIRD WAY");
//THIRD WAY
        for (int i=0; i< namesArray.length;i++){
            String name=namesArray[i];
            for (int j=0;j<name.length();j++){

                System.out.print(name.charAt(j)+"-");
            }
            System.out.println();
        }


        }

    }



