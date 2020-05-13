package day029;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {

        String hero1="Superman-Clark Kent";
        //Hero code is Superman and identity is Clark Kent
        //The initial of the hero is CK

        String heroSplit []=hero1.split("-");
        String heroCode=heroSplit[0];
        String fullName=heroSplit[1];
        System.out.println("hero Split= "+ Arrays.toString(heroSplit));
        System.out.println("Hero code is "+ heroCode+ " and identity is "+fullName);
        int indexOfK=fullName.indexOf("K");

        System.out.println("initials are "+fullName.charAt(0)+fullName.charAt(indexOfK));

        //or
//may be there is middle name as well check the lastIndexOf
        int indexOfSpace=fullName.lastIndexOf(" ");
        String initials=""+fullName.charAt(0)+fullName.charAt(indexOfSpace+1);
        System.out.println("initials are "+initials);

        //or use split method
        String fullNameSplit[]=fullName.split(" ");

        System.out.println(Arrays.toString(fullNameSplit));
//[Clark, Kent]
        char firstInitial=fullNameSplit[0].charAt(0);
        char secondInitial=fullNameSplit[1].charAt(0);
        System.out.println(""+firstInitial+secondInitial);
//or we acn find last name
        //fullNameSplit is an array and its length is 2
        //to get last name we write the next code
        //last name is the second element in the

        String lastName = fullNameSplit[fullNameSplit.length - 1];//it means fullNameSplit[2-1=1]
        //fullName[0]=Clark
        //fullName[1]=Kent
        System.out.println(fullName.charAt(0)+lastName.charAt(0));//CK


    }
}
