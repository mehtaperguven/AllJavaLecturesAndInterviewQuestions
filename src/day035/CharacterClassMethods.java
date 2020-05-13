package day035;

public class CharacterClassMethods {
    public static void main(String[] args) {

        //Character class has lots of static methods
        //to perform actions on char values
        //isDigit, isLetter, isLetterOrDigit, isUpperCase, isLowerCase
        //toUpperCase, toLowerCase
        System.out.println("isDigit() METHOD PRACTICE");
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit(' '));
        System.out.println(Character.isDigit('8'));

        //task
        //get the number out of this String
        //And store into Integer variable x
        String str="A34B123C4X";
        String numsInString="";
        for (int i=0;i<str.length();i++){

            if (Character.isDigit(str.charAt(i))){
                numsInString+=str.charAt(i);
               System.out.println("str.charAt("+i+")= "+str.charAt(i));

            }

        }
        System.out.println("numsInSTring ="+numsInString);
        //int num=Integer.parseInt(numsInString);//int value
        int num=Integer.valueOf(numsInString);//we store the result as Integer object by valueOf();
        System.out.println("num is "+num);

    }
}
